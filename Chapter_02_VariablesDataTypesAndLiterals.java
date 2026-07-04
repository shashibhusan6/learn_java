/*
 * ============================================================================
 * Chapter 02 : Variables, Primitive Data Types & Literals
 * File Name  : Chapter_02_VariablesDataTypesAndLiterals.java
 * ============================================================================
 *
 * Topics Covered
 * ---------------
 * 1. Variables
 * 2. Primitive Data Types
 * 3. Literals
 * 4. Binary Literals
 * 5. Hexadecimal Literals
 * 6. Numeric Separators (_)
 * 7. Scientific Notation
 * 8. Character Operations
 * 9. Boolean & String Literals
 *
 * ============================================================================
 */

public class Chapter_02_VariablesDataTypesAndLiterals {

    public static void main(String[] args) {

        System.out.println("========== VARIABLES ==========\n");

        // Variable Declaration
        int age;

        // Variable Initialization
        age = 21;

        // Declaration + Initialization
        String name = "Shashi";

        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);



        System.out.println("\n========== PRIMITIVE DATA TYPES ==========\n");

        /*
         * Java has 8 Primitive Data Types
         */

        byte b = 120;
        short s = 25000;
        int i = 100000;
        long l = 9876543210L;

        float f = 5.75f;
        double d = 99.999;

        char grade = 'A';

        boolean isJavaFun = true;

        System.out.println("byte    : " + b);
        System.out.println("short   : " + s);
        System.out.println("int     : " + i);
        System.out.println("long    : " + l);
        System.out.println("float   : " + f);
        System.out.println("double  : " + d);
        System.out.println("char    : " + grade);
        System.out.println("boolean : " + isJavaFun);



        System.out.println("\n========== LITERALS ==========\n");

        /*
         * Literal
         * -------
         * A fixed value assigned directly to a variable.
         */

        int num = 25;          // 25 is an integer literal
        double price = 99.99;  // 99.99 is a floating literal
        char ch = 'A';         // 'A' is a character literal
        boolean flag = true;   // true is a boolean literal
        String city = "Delhi"; // "Delhi" is a string literal

        System.out.println(num);
        System.out.println(price);
        System.out.println(ch);
        System.out.println(flag);
        System.out.println(city);



        System.out.println("\n========== BINARY LITERALS ==========\n");

        /*
         * Prefix : 0b
         * Base   : 2
         */

        int binary = 0b101;

        System.out.println("0b101 = " + binary);



        System.out.println("\n========== HEXADECIMAL LITERALS ==========\n");

        /*
         * Prefix : 0x
         * Base   : 16
         */

        int hex = 0x7E;

        System.out.println("0x7E = " + hex);



        System.out.println("\n========== NUMERIC SEPARATOR ==========\n");

        /*
         * Use underscore (_) to improve readability.
         */

        int population = 1_00_00_000;

        System.out.println(population);



        System.out.println("\n========== SCIENTIFIC NOTATION ==========\n");

        /*
         * e means 10 raised to power.
         */

        double number = 12e10;

        System.out.println(number);



        System.out.println("\n========== CHARACTER OPERATIONS ==========\n");

        /*
         * Characters are internally stored as Unicode values.
         * We can increment them.
         */

        char letter = 'A';

        System.out.println("Before : " + letter);

        letter++;

        System.out.println("After  : " + letter);



        System.out.println("\n========== BOOLEAN ==========\n");

        /*
         * Boolean supports only:
         * true
         * false
         */

        boolean isStudent = true;

        System.out.println(isStudent);



        System.out.println("\n========== STRING LITERALS ==========\n");

        String language = "Java";

        System.out.println(language);



        System.out.println("\n========== VARIABLE NAMING RULES ==========\n");

        /*
         * ✔ Can contain letters, digits, _ and $
         * ✔ Cannot start with a digit
         * ✔ Cannot use Java keywords
         * ✔ Java is case-sensitive
         * ✔ Use meaningful camelCase names
         */

        int studentAge = 20;
        String firstName = "Shashi";

        System.out.println(studentAge);
        System.out.println(firstName);



        System.out.println("\n========== QUICK REVISION ==========\n");

        /*
         * Variable  -> Stores data.
         * Data Type -> Defines what type of data can be stored.
         * Literal   -> Actual value assigned to a variable.
         *
         * Example:
         * int age = 21;
         *
         * int  -> Data Type
         * age  -> Variable
         * 21   -> Literal
         */



        System.out.println("\n========== INTERVIEW NOTES ==========\n");

        /*
         * Q1. What is a Variable?
         * -> A named memory location used to store data.
         *
         * Q2. How many primitive data types are there?
         * -> 8
         *
         * Q3. What is a Literal?
         * -> A fixed value assigned directly to a variable.
         *
         * Q4. Prefix for Binary Literal?
         * -> 0b
         *
         * Q5. Prefix for Hexadecimal Literal?
         * -> 0x
         *
         * Q6. Why use underscore (_) in numbers?
         * -> Improves readability.
         *
         * Q7. Can boolean store 0 or 1?
         * -> No.
         *    Only true or false.
         *
         * Q8. Can char be incremented?
         * -> Yes.
         * Example:
         * char ch = 'A';
         * ch++;
         * Output -> B
         *
         * Q9. Default type of decimal numbers?
         * -> double
         *
         * Q10. Default type of integer numbers?
         * -> int
         */
    }
}