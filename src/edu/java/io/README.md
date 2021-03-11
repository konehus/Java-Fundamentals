
Package java.io ![Build Status](https://img.shields.io/badge/package-java.io-green)
============

Provides for system input and output through data streams, serialization and the file system. Unless otherwise noted, passing a null argument to a constructor or method in any class or interface in this package will cause a `NullPointerException` to be thrown.

<br />

<p align="center">
    <img alt="" src="https://www.tutorialspoint.com/java/images/streams.png" />
</p>

<br />
<br />


## Stream
    A stream can be defined as a sequence of data
- **Java** brings various Streams with its I/O package that helps the user to perform all the input-output operations. These streams support all the types of objects, data-types, characters, files etc to fully execute the I/O operations. 
- Before exploring various input and output streams lets look at **3 standard or default** streams that Java has to provide which are also most common in use:

  1. **`System.in`**  :  This is the standard input stream that is used to read characters from the keyboard or any other standard input device.
  2. **`System.out`** : This is the standard output stream that is used to produce the result of a program on an output device like the computer screen.
  3. **`System.err`** : This is the standard error stream that is used to output all the error data that a program might throw, on a computer screen or any standard output device.

<br />
<p align="center">
    <img alt="geeker" width="550" src="https://media.geeksforgeeks.org/wp-content/uploads/20191127113736/Java-Basic-input-output1.png"/>
</p>



Types of Streams
----------------
**Depending on the type of operators**, streams can be divided into two primary classes:
  
1. **Input Stream**: These streams are used to read data that must be taken as an input from a source array or file or any peripheral device. For eg., FileInputStream, BufferedInputStream, ByteArrayInputStream etc.
<p align="center"><img alt="lkkka" width="500" src="https://media.geeksforgeeks.org/wp-content/uploads/20191126132719/Java-Input-Stream.png"/></p>


2. **Output Stream**: These streams are used to write data as outputs into an array or file or any output peripheral device. For eg., FileOutputStream, BufferedOutputStream, ByteArrayOutputStream etc.
<p align="center"><img alt="kfae" width="550" src="https://media.geeksforgeeks.org/wp-content/uploads/20191126133237/Java-Output-Stream.png" /></p>


<br />

**Depending on the types of file**, Streams can be divided into two primary classes which can be further divided into other classes as can be seen through the diagram below followed by the explanations.

1. ByteStream: This is used to process data byte by byte (8 bits). Though it has many classes, the FileInputStream and the FileOutputStream are the most popular ones. The FileInputStream is used to read from the source and FileOutputStream is used to write to the destination. Here is the list of various ByteStream Classes:

   
2. CharacterStream: In Java, characters are stored using 16-bit Unicode conventions. Character stream automatically allows us to read/write data character by character. Though it has many classes, the FileReader and the FileWriter are the most popular ones. FileReader and FileWriter are character streams used to read from the source and write to the destination respectively. Here is the list of various CharacterStream Classes:

Object Serialization 
--------------------
Warning: Deserialization of untrusted data is inherently dangerous and should be avoided. Untrusted data should be carefully validated according to the "Serialization and Deserialization" section of the Secure Coding Guidelines for Java SE.
<br />
