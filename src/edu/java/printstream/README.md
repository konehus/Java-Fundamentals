
Java PrintStream Class ![Build Status](https://img.shields.io/badge/Class-PrintStream-blue)
============

 _Closeable, Flushable, Appendable, AutoCloseable_   ![Build Status](https://img.shields.io/badge/Implemented-Interfaces-pink)

<br />

A `PrintStream` adds functionality to another output stream, namely the ability to print representations of various data values conveniently. Two other features are provided as well. Unlike other output streams, a `PrintStream` never throws an `IOException`; instead, exceptional situations merely set an internal flag that can be tested via the checkError method. Optionally, a `PrintStream` can be created to flush automatically; this means that the flush method is automatically invoked after a byte array is written, one of the println methods is invoked, or a newline character or byte ('\n') is written.

All characters printed by a `PrintStream` are converted into bytes using the given encoding or charset, or the platform's default character encoding if not specified. The PrintWriter class should be used in situations that require writing characters rather than bytes.

This class always replaces malformed and unmappable character sequences with the charset's default replacement string. The CharsetEncoder class should be used when more control over the encoding process is required.

It extends the abstract class `OutputStream`.

<br />
<p align="center">
    <img width="150" src="https://cdn.programiz.com/sites/tutorial2program/files/java-printstream.png"/>
</p>