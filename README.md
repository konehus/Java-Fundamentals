<p align="center">
  <img src = "https://camo.githubusercontent.com/651195b8c66a9dd22316e672992077dbcecea4ca904b45a6681558ebc0ecc517/68747470733a2f2f75706c6f61642e77696b696d656469612e6f72672f77696b6970656469612f656e2f7468756d622f332f33302f4a6176615f70726f6772616d6d696e675f6c616e67756167655f6c6f676f2e7376672f33303070782d4a6176615f70726f6772616d6d696e675f6c616e67756167655f6c6f676f2e7376672e706e67">
</p>
<br />
<br />

Java Fundamentals ![Build Status](https://img.shields.io/badge/Java-Fundamental-blue)
=================
<br />

## What is Java?

Java is a powerful, general-purpose programming environment and one of the most widely used programming languages in the world. From it’s inception, designers of Java focused on creating a language paradigm that is simple, object-oriented, and platform independent. These are just some aspects of the language which often make it a preferred choice for developing cutting-edge, enterprise-level applications.

Java is considered a higher-level programming language that enables application developers to “write once, run anywhere” meaning that code written and compiled in a certain environment can run on all platforms regardless of computer architecture. Over the past twenty years, Java has remained a go-to language for use in projects of all sizes… now running on over three billion devices!

> **Java Technology** consist of: 
> - Java Language
> - Java Platform
> - Java Tools

Java language is a general-purpose programming language. It can be used to develop software for mobile devices, browser-run applets, games, as well as desktop, enterprise (server-side), and scientific applications.Java platform consists of Java virtual machine (JVM) responsible for hardware abstraction, and a set of libraries that gives Java a rich foundation. Java tools include the Java compiler as well as various other helper applications that are used for day-to-day development (e.g. debugger).

<br />

## Why Java?

- **Object oriented** - In Java, everything is an Object. Java is robust and can be easily extended since it is based on the Object model.
- **Platform Independent** − Unlike many other programming languages including C and C++, when Java is compiled, it is not compiled into platform specific machine code, rather into platform independent bytecode. This bytecode can be distributed over the web and interpreted by the Virtual Machine (JVM) on whichever platform it is being run on.
- **Multi-threaded** − This key feature allows developers to write programs that can perform many tasks simultaneously. This design feature allows for the construction of interactive applications that can run concurrently while maximizing the utilization of computing resources.
- **Interpreted** − Java bytecode is translated on the fly to native machine instructions and is not stored anywhere. The development and deployment process can be more efficient and calculated since the linking is an incremental and light-weight process.
- **High Performance** − With the use of Just-In-Time compilers, Java enables high performance. The JIT compiler is the component that converts Java’s intermediate language into native machine code as needed.
- **Memory Management** — Java comes with a built-in garbage collector that automatically manages the memory used by programs.

<br />

<p align="center">
  <img src="https://miro.medium.com/max/530/1*tRyMCu3qO7x0vZnDsM5CnA.gif">
</p>
  
<br />
<br />


 
 ## Questions and Answers
 
 <br />
 
 How is Java Platform Independent?
 ---------------------------------
 - When you write Java code and compile it, a separate file is created for the converted source code, this file(with a .class extension) is known as “bytecode”. The main purpose of generating bytecode for a program is to achieve platform independence which allows code generated on one platform to be executed on another regardless of computer architecture.
 
 <br />
 
 What is an Object?
 ------------------
 - An instance of a class is called an object. The object has state and behavior. Whenever the JVM reads the “new” keyword, it will create an instance of that class.
            <p align="center">
              <img src="http://tutorials.jenkov.com/images/java/classes-objects.png" />
            </p>
 <br />
 
 What is a Constructor?
 ----------------------
 
 - When a new object is created in the program, a constructor (can have more than one) gets invoked corresponding to the class.
 - The constructor is a method which has the same name as the class name and defines the state of the object being created.
 
 <br />
 
 What are the primary Object Oriented Programming concepts?
 ----------------------------------------------------------
 
 - Inheritance
 - Encapsulation
 - Polymorphism
 - Abstraction
 
 <br />
 
 What is the significance of the following Java code: public static void main (String[] args)?
 ---------------------------------------------------------------------------------------------
 
 This is the line at which a program will start executing. All Java applications begin execution by calling the main method.

 - The keyword public is an access specifier, which allows the programmer to control the visibility of class members.
 - The keyword static allows main to be called without having to instantiate a particular instance of the class.
 -The keyword void tells the compiler that the main method does not return a value.
 
 <br />
 
 At a high-level, describe how Java’s garbage collector works?
 -------------------------------------------------------------

The garbage collector’s job is to automate memory management as objects are created, referenced, and deemed no longer needed by a program.

The main component of the garbage collection process is a “mark and sweep algorithm”. So how does it work at a high-level?

 - The garbage collector scans Java’s dynamic memory areas for objects that are referenced.
 - Unreferenced objects are identified and marked as ready for garbage collection. Two common ways objects can become unreferenced is by nulling the reference to an instance, or by assigning a reference to another object.
 - Marked objects are deleted, and memory is compacted by moving referenced objects with allocated memory together forming a contiguous block on the heap. This makes it easier to allocate memory to new objects as program execution continues.
 
 
 
 
 
 
 
 
 
 
 
 
 
 
