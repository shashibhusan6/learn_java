/*
==========================================================
        CHAPTER 1 : GETTING STARTED WITH JAVA
==========================================================

Topics Covered:
1. Introduction to Java
2. Java Development Environment Setup
3. First Java Program

----------------------------------------------------------
1. Introduction to Java
----------------------------------------------------------

• Java is a high-level, object-oriented programming language.
• Developed by Sun Microsystems (1995).
• Now maintained by Oracle.
• Java follows the principle:

    "Write Once, Run Anywhere (WORA)"

Meaning:
Compile once -> Run on any operating system having JVM.

Applications of Java:
• Desktop Applications
• Web Applications
• Mobile Applications (Android)
• Enterprise Applications
• Banking Software
• Cloud Applications
• Big Data

Advantages:
✔ Platform Independent
✔ Object-Oriented
✔ Secure
✔ Robust
✔ Portable
✔ Multithreaded
✔ Automatic Memory Management (Garbage Collection)

----------------------------------------------------------
2. Java Development Environment Setup
----------------------------------------------------------

To write and run Java programs, install:

1. JDK (Java Development Kit)
   - Contains compiler (javac)
   - Contains JVM
   - Contains development tools

2. IDE (Optional)
   Examples:
   • IntelliJ IDEA
   • Eclipse
   • VS Code

Useful Commands:

Check Java Version:
> java -version

Check Compiler Version:
> javac -version

Compile Program:
> javac FileName.java

Run Program:
> java FileName

(Java 11+ also supports)

> java FileName.java

(Useful only for learning and small programs.)

----------------------------------------------------------
3. First Java Program
----------------------------------------------------------

Every Java program contains at least one class.

public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello World");

    }

}

Explanation:

public
-> Accessible from anywhere.

class
-> Blueprint of an object.

Hello
-> Class Name
-> File name must also be Hello.java

main()
-> Entry point of every Java program.

String[] args
-> Stores command-line arguments.

System.out.println()
-> Prints output with a new line.

----------------------------------------------------------
Compilation Process
----------------------------------------------------------

Hello.java
     |
     | javac
     v
Hello.class (Bytecode)
     |
     | JVM
     v
Output

----------------------------------------------------------
Flow of Execution
----------------------------------------------------------

Write Code
      ↓
Compile
      ↓
Bytecode (.class)
      ↓
JVM
      ↓
Machine Code
      ↓
Output

----------------------------------------------------------
Important Points
----------------------------------------------------------

✔ Java is Case Sensitive.

✔ File name and public class name must be same.

✔ Every statement ends with ;

✔ Program execution always starts from main().

✔ JVM executes the bytecode.

✔ JDK contains compiler + JVM + development tools.

✔ JRE contains JVM + libraries.

----------------------------------------------------------
Interview Points ⭐
----------------------------------------------------------

Q1. Why is Java platform independent?
Ans:
Because Java code is converted into bytecode which runs on JVM.

Q2. Difference between JDK, JRE and JVM?

JDK
→ Development Kit
→ Used to develop Java applications.

JRE
→ Runtime Environment
→ Used to run Java programs.

JVM
→ Executes bytecode.

Q3. Why is main() method static?

Because JVM calls main() directly without creating an object.

Q4. Why is Java called WORA?

Because the same bytecode can run on any OS with JVM.

Q5. What is bytecode?

Intermediate code generated after compilation.

==========================================================
                Runnable Examples
==========================================================
*/

public class Chapter_01_GettingStartedWithJava {

    public static void main(String[] args) {

        // Example 1: Printing a message
        System.out.println("Hello, Java!");

        // Example 2: Multiple outputs
        System.out.println("Welcome to Java Programming.");
        System.out.println("Write Once, Run Anywhere.");

        // Example 3: Simple calculation
        System.out.println("10 + 20 = " + (10 + 20));

        // Example 4: Display current learning chapter
        System.out.println("Chapter 1: Getting Started with Java");

    }
}