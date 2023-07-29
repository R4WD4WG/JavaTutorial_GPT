// Java Overview

/* 
Java is a:
    - General Purpose
    - Class Based
    - Object Oriented
    - Concurrent
    - Programming Language

Java is designed for having lesser implementation dependencies.

Features of Java:
    - Object Oriented
        - In Java, everything is an Object.
        - Java can be easily extended since it is based on the Object model.
    - Platform Independent
        - When Java is compiled, it is not compiled into platform-specific machine code.
        - Rather, it is compiled into platform-independent byte code.
        - This byte code is distributed over the web and interpreted by the Virtual Machine (JVM) on the running platform.
    - Simple
        - Java is designed to be easily to learn.
        - If you understand the basic concept of OOP Java, it would be easy to master.
    - Secure
        - Enables development of virus-free, tamper-free systems.
    - Portable
        - Being architecture-neutral and having no implementation dependent aspects of the specification makes Java portable.
*/ 

// Hello World Example

public class gpt1 {
    public static void main (String[] args) {
        System.out.println("Hello, World!");
    }
}

/*
This program consists of 3 parts:

1. public class gpt1
    - This line uses the 'class' keyword to declare a new class called 'gpt1'.
    - In the example provided by GPT-4, they use 'Main'. However, since our Java file is not named 'Main', we must use gpt1.
    - Java is all about classes and objects, and every Java program has at least one class.
2. public static void main (String[] args)
    - This line defines a method called 'amin'.
    - Every Java program begins execution with the 'main' method.
    - The 'public' keyword means that other classes have access to this method.
3. System.out.println("Hello, World!")
    - This line outputs the string "Hello, World!" to the console.
 */



 /* 
Question: Why did I have to use public static gpt1 instead of public static Main?

Answer: Java requires the public class name in a file to match the filename.
        In this case, the file was named 'gpt1.java', so the public class inside the file should
        also be named 'gpt1'. If you had named your file 'Main.java', then you could have used 'Main' as your class name.
  */