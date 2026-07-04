/*
 * ============================================================================
 * Chapter 03 : Type Conversion, Type Casting & Type Promotion
 * File Name  : Chapter_03_TypeConversionCastingAndPromotion.java
 * ============================================================================
 *
 * Topics Covered
 * ---------------
 * 1. Type Conversion (Implicit Conversion)
 * 2. Type Casting (Explicit Conversion)
 * 3. Widening Conversion
 * 4. Narrowing Conversion
 * 5. int -> byte Conversion
 * 6. float -> int Conversion
 * 7. Byte Overflow
 * 8. Type Promotion
 * 9. Interview Notes
 *
 * ============================================================================
 */

public class Chapter_03_TypeConversionCastingAndPromotion {

    public static void main(String[] args) {

        System.out.println("========== TYPE CONVERSION ==========\n");

        /*
         * Type Conversion
         * ---------------
         * Automatic conversion from a smaller data type
         * to a larger data type.
         *
         * Also called:
         * - Implicit Conversion
         * - Widening Conversion
         */

        byte b = 100;
        int num = b; // Automatic Conversion

        System.out.println("Byte Value : " + b);
        System.out.println("Converted to int : " + num);



        System.out.println("\n========== WIDENING CONVERSION ==========\n");

        /*
         * Smaller -> Larger
         *
         * byte -> short -> int -> long -> float -> double
         *
         * No data loss.
         */

        int marks = 95;
        double result = marks;

        System.out.println("Integer : " + marks);
        System.out.println("Double  : " + result);



        System.out.println("\n========== TYPE CASTING ==========\n");

        /*
         * Type Casting
         * ------------
         * Manual conversion from larger data type
         * to smaller data type.
         *
         * Also called:
         * - Explicit Conversion
         * - Narrowing Conversion
         */

        int age = 25;

        byte newAge = (byte) age;

        System.out.println("Integer : " + age);
        System.out.println("Byte    : " + newAge);



        System.out.println("\n========== NARROWING CONVERSION ==========\n");

        /*
         * Larger -> Smaller
         *
         * double -> float -> long -> int -> short -> byte
         *
         * Data loss may occur.
         */

        double salary = 45678.98;

        int finalSalary = (int) salary;

        System.out.println("Double : " + salary);
        System.out.println("Integer: " + finalSalary);



        System.out.println("\n========== FLOAT TO INT ==========\n");

        /*
         * Decimal part is removed.
         */

        float price = 99.99f;

        int wholeNumber = (int) price;

        System.out.println("Float : " + price);
        System.out.println("Int   : " + wholeNumber);



        System.out.println("\n========== INT TO BYTE ==========\n");

        /*
         * Integer within byte range.
         */

        int number = 120;

        byte small = (byte) number;

        System.out.println("Integer : " + number);
        System.out.println("Byte    : " + small);



        System.out.println("\n========== BYTE OVERFLOW ==========\n");

        /*
         * Byte Range
         * ----------
         * -128 to 127
         *
         * 257 % 256 = 1
         */

        int largeNumber = 257;

        byte overflow = (byte) largeNumber;

        System.out.println("Integer : " + largeNumber);
        System.out.println("Byte    : " + overflow);



        System.out.println("\n========== TYPE PROMOTION ==========\n");

        /*
         * When arithmetic operations are performed
         * on byte, short or char,
         * Java automatically promotes them to int.
         */

        byte x = 10;
        byte y = 30;

        int answer = x * y;

        System.out.println("10 * 30 = " + answer);



        System.out.println("\n========== CHARACTER CONVERSION ==========\n");

        /*
         * Characters are internally stored as numbers.
         */

        char ch = 'A';

        System.out.println("Before : " + ch);

        ch++;

        System.out.println("After  : " + ch);



        System.out.println("\n========== INVALID CONVERSION ==========\n");

        /*
         * boolean cannot be converted
         * to any other primitive type.
         *
         * Invalid:
         *
         * boolean flag = true;
         * int x = (int) flag;   // Error
         *
         * char cannot be converted
         * to boolean and vice versa.
         */

        boolean flag = true;

        System.out.println(flag);



        System.out.println("\n========== QUICK REVISION ==========\n");

        /*
         * Conversion
         * ----------
         * Automatic
         * Smaller -> Larger
         *
         * Example:
         * byte -> int
         *
         *
         * Casting
         * -------
         * Manual
         * Larger -> Smaller
         *
         * Example:
         * double -> int
         *
         *
         * Type Promotion
         * --------------
         * byte, short and char
         * become int during arithmetic operations.
         */



        System.out.println("\n========== INTERVIEW NOTES ==========\n");

        /*
         * Q1. What is Type Conversion?
         * -> Automatic conversion from smaller
         *    data type to larger data type.
         *
         * Q2. Another name for Type Conversion?
         * -> Implicit Conversion
         * -> Widening Conversion
         *
         * Q3. What is Type Casting?
         * -> Manual conversion from larger
         *    data type to smaller data type.
         *
         * Q4. Another name for Type Casting?
         * -> Explicit Conversion
         * -> Narrowing Conversion
         *
         * Q5. Why do we use Casting?
         * -> To convert one data type
         *    into another manually.
         *
         * Q6. What happens when converting
         *     float to int?
         * -> Decimal part is removed.
         *
         * Example:
         * 5.9 -> 5
         *
         * Q7. What happens when
         *     int 257 is cast to byte?
         * -> Output = 1
         *    (257 % 256 = 1)
         *
         * Q8. What is Type Promotion?
         * -> Java automatically promotes
         *    byte, short and char to int
         *    during arithmetic operations.
         *
         * Q9. Can boolean be converted
         *     to int?
         * -> No.
         *
         * Q10. Difference between
         *      Conversion and Casting?
         *
         * Conversion:
         * Automatic
         * No explicit syntax
         *
         * Casting:
         * Manual
         * Uses (datatype)
         */
    }
}