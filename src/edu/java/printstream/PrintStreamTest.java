package edu.java.printstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDateTime;

public class PrintStreamTest {

    private static final String DIRECTORY = "src/edu/java/printstream/file/";
    private static final String FILE = "test.txt";

    public void write(String word) throws IOException {

        FileOutputStream file = new FileOutputStream(DIRECTORY + FILE);
        PrintStream stream = new PrintStream(file, true, "ISO-8859-15");


        stream.println(LocalDateTime.now());

        stream.println("\nWriting to file: " + FILE);
        stream.println("Directory Location: " + DIRECTORY);
        stream.println();
        stream.println(word);

        System.out.println(stream.checkError());
        
        stream.append('A');

        stream.close();
        file.close();

    }

    public static void main(String[] args) throws IOException {
        String word = "This is Test String!";

        new PrintStreamTest().write(word);
        System.out.println("Success!");
    }


}
