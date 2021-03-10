package edu.java.system;

import java.io.Console;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

public class MainSystem {
    public Character aCharacter;

    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException {
        long startNanoTime = System.nanoTime();
        long startMilliTime = System.currentTimeMillis();

        int[] srcArr = {1, 2, 3, 4, 5, 6};
        int[] destArr = new int[7];

        //Copies an array from the specified source array, beginning at the specified position,
        // to the specified position of the destination array.
        System.arraycopy(srcArr, 2, destArr, 2, 3);
        System.out.println(Arrays.toString(destArr));

        //Returns the unique Console object associated with the current Java virtual machine, if any.
        //Works from terminal
        Console cons;
        char[] passwd;
        if( (cons = System.console()) != null && (passwd = cons.readPassword("[%s]", "Password:")) != null){
            Arrays.fill(passwd, ' ');
            cons.writer().println(passwd);

        }


        //Returns the current value of the running Java Virtual Machine's high-resolution time source, in nanoseconds.
        //This method provides nanosecond precision, but not necessarily nanosecond resolution (that is, how frequently
        //the value changes) - no guarantees are made except that the resolution is at least as good as that of currentTimeMillis().
        //Differences in successive calls that span greater than approximately 292 years (263 nanoseconds) will not correctly
        //compute elapsed time due to numerical overflow.
        System.out.println(System.nanoTime() - startNanoTime);

        //Returns the current time in milliseconds. Note that while the unit of time of the return value is a millisecond,
        // the granularity of the value depends on the underlying operating system and may be larger. For example, many operating systems measure time in units of tens of milliseconds.
        System.out.println(System.currentTimeMillis() - startMilliTime);

        //Runs the garbage collector in the JVM
        System.gc(); // same effect Runtime.getRuntime().gc()

        //Returns unmodifiable string map view of the current system
        System.out.println(System.getenv());

        //gets the value of the specified environent variable
        System.out.println(System.getenv("HOME"));

        //Determines the current system properties
        System.out.println(System.getProperties());

        //Gets the system property indicated by the specified key
        System.out.println(System.getProperty("user.name", "henok"));


        //Returns the same hash code for the given object, check whether or not object's class overrides hashCode()
        Object obj = new Object();
        System.out.println(obj.hashCode() == System.identityHashCode(obj));
        System.out.println(System.identityHashCode(startNanoTime));
        System.out.println("Hash Code for null: " + System.identityHashCode(null));

        //Returns the system-dependent Line separator
        //On UNIX systems, it returns "\n"; on Microsoft Windows systems it returns "\r\n".
        System.out.println("Line Separator: \"" + System.lineSeparator() + "\""); //same as System.getProperty("line.separator")


        //maps a library name into a platform-specific string representing a native library
        System.out.println(System.mapLibraryName("os.name"));

        //Reassigns the "standard" error output stream
        System.out.println("This is not error");
        System.setOut(System.err);
        System.out.println("This is not error");

        //Set the system properties
        System.setProperties(null);
        System.out.println(System.getProperties());

        //security enforcement is still an actual concept when there is a situation in which third-party code executes
        // in a protected environment.
        System.out.println("SECURITY MANAGER");
//        System.setSecurityManager(new SecurityManager());
        new URL("http://www.google.com").openConnection().connect();

        //Set the system property indicated by te specified key
        System.out.println("Before: " + System.getProperty("os.name"));
        System.setProperty("os.name", "Windows XP");
        System.out.println("After: " + System.getProperty("os.name"));

        MainSystem mainSystem = new MainSystem();
        Field field = MainSystem.class.getField("aCharacter");
//        Field type = Field.class.getDeclaredField("type");
//        type.setAccessible(true);
//        type.set(field, String.class);
        field.set(mainSystem, 'A');
        System.out.println(mainSystem.aCharacter);

        //Runs the finalization methods of any objects pending finalization
        System.runFinalization(); //equal as Runtime.getRuntime().runFinalization()


        //Terminates the currently running Java Virtual Machine. The argument serves as a status code; by convention, a nonzero status code indicates abnormal termination.
        //This method calls the exit method in class Runtime. This method never returns normally.
        System.exit(230);   //same as  Runtime.getRuntime().exit(230);
        System.out.println("hello");


     }
}
