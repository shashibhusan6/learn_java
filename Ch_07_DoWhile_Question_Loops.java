/*
=========================================
    CHAPTER 07 - DO WHILE LOOP PRACTICE
=========================================

File Name:
Ch_07_DoWhile_Question_Loops.java

Total Questions : 15
Level : Easy

Rules:
1. Solve every question using ONLY do-while loops.
2. Do NOT use while or for loops.
3. Try solving yourself before checking the answer.

=========================================
            EASY LEVEL
=========================================
*/


// Q1. Print numbers from 1 to 10.


// Q2. Print numbers from 10 to 1.


// Q3. Print numbers from 1 to 100.


// Q4. Print numbers from 50 to 100.


// Q5. Print even numbers from 1 to 20.


// Q6. Print odd numbers from 1 to 20.


// Q7. Print multiples of 5 from 5 to 50.


// Q8. Print numbers from -10 to 10.


// Q9. Print squares of numbers from 1 to 10.


// Q10. Print cubes of numbers from 1 to 10.


// Q11. Print the multiplication table of 7.


// Q12. Print the multiplication table of 13.


// Q13. Print all uppercase alphabets from A to Z.


// Q14. Print all lowercase alphabets from a to z.


// Q15. Print numbers from 100 to 0 by decreasing 5 every time.


/*
=========================================
           END OF PRACTICE SET
=========================================

After completing these questions,
move on to Medium and Hard level
do-while loop problems.

Happy Coding!
=========================================
*/



/*
=========================================
        MEDIUM LEVEL
=========================================
*/


// Q16. Find the sum of numbers from 1 to 10.


// Q17. Find the sum of numbers from 1 to 100.


// Q18. Find the sum of even numbers from 1 to 100.


// Q19. Find the sum of odd numbers from 1 to 100.


// Q20. Find the factorial of a number.


// Q21. Reverse the digits of a number.


// Q22. Count the number of digits in a number.


// Q23. Find the sum of digits of a number.


// Q24. Check whether a number is a palindrome.


// Q25. Print the Fibonacci series up to N terms.


// Q26. Find the largest digit in a number.


// Q27. Find the smallest digit in a number.


// Q28. Count even and odd digits in a number.


// Q29. Print all factors of a number.


// Q30. Check whether a number is a prime number.


/*
=========================================
      END OF MEDIUM LEVEL
=========================================

Rules:
1. Use only do-while loops.
2. Do not use while or for loops.
3. Try to solve each problem before looking
   at the solution.
4. Most of these questions are frequently
   asked in placement interviews.

=========================================
*/


/*
=========================================
            HARD LEVEL
=========================================
*/


// Q31. Find the GCD (HCF) of two numbers.


// Q32. Find the LCM of two numbers.


// Q33. Check whether a number is an Armstrong number.


// Q34. Check whether a number is a Strong number.


// Q35. Check whether a number is a Perfect number.


// Q36. Print all prime numbers between 1 and 100.


// Q37. Print all Armstrong numbers between 1 and 1000.


// Q38. Print all Perfect numbers between 1 and 1000.


// Q39. Convert a decimal number to binary.


// Q40. Convert a binary number to decimal.


// Q41. Calculate the power of a number (a^b).


// Q42. Find the product of digits of a number.


// Q43. Remove all zeros from a number.


// Q44. Find the second largest digit in a number.


// Q45. Print this pattern using do-while loops only.

/*
*
**
***
****
*****
*/


/*
=========================================
        END OF HARD LEVEL
=========================================

Rules:
1. Solve every question using ONLY do-while loops.
2. Do not use while or for loops.
3. Think about the logic before writing code.
4. Some questions may require nested do-while loops.
5. These are excellent placement-level practice problems.

=========================================
             CONGRATULATIONS!
=========================================

*/



// ANSWER //

/*
=========================================
    CHAPTER 07 - DO WHILE LOOP PRACTICE
=========================================

File Name:
Ch_07_DoWhile_Question_Loops.java

Total Questions : 15
Level : Easy
*/


// Q1. Print numbers from 1 to 10.

class Example1 {
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

    }
}


// Q2. Print numbers from 10 to 1.

class Example2 {
    public static void main(String[] args) {

        int i = 10;

        do {
            System.out.println(i);
            i--;
        } while (i >= 1);

    }
}


// Q3. Print numbers from 1 to 100.

class Example3 {
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 100);

    }
}


// Q4. Print numbers from 50 to 100.

class Example4 {
    public static void main(String[] args) {

        int i = 50;

        do {
            System.out.println(i);
            i++;
        } while (i <= 100);

    }
}


// Q5. Print even numbers from 1 to 20.

class Example5 {
    public static void main(String[] args) {

        int i = 2;

        do {
            System.out.println(i);
            i += 2;
        } while (i <= 20);

    }
}


// Q6. Print odd numbers from 1 to 20.

class Example6 {
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println(i);
            i += 2;
        } while (i <= 20);

    }
}


// Q7. Print multiples of 5 from 5 to 50.

class Example7 {
    public static void main(String[] args) {

        int i = 5;

        do {
            System.out.println(i);
            i += 5;
        } while (i <= 50);

    }
}


// Q8. Print numbers from -10 to 10.

class Example8 {
    public static void main(String[] args) {

        int i = -10;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

    }
}


// Q9. Print squares of numbers from 1 to 10.

class Example9 {
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println(i * i);
            i++;
        } while (i <= 10);

    }
}


// Q10. Print cubes of numbers from 1 to 10.

class Example10 {
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println(i * i * i);
            i++;
        } while (i <= 10);

    }
}


// Q11. Print the multiplication table of 7.

class Example11 {
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println("7 x " + i + " = " + (7 * i));
            i++;
        } while (i <= 10);

    }
}


// Q12. Print the multiplication table of 13.

class Example12 {
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println("13 x " + i + " = " + (13 * i));
            i++;
        } while (i <= 10);

    }
}


// Q13. Print all uppercase alphabets from A to Z.

class Example13 {
    public static void main(String[] args) {

        char ch = 'A';

        do {
            System.out.println(ch);
            ch++;
        } while (ch <= 'Z');

    }
}


// Q14. Print all lowercase alphabets from a to z.

class Example14 {
    public static void main(String[] args) {

        char ch = 'a';

        do {
            System.out.println(ch);
            ch++;
        } while (ch <= 'z');

    }
}


// Q15. Print numbers from 100 to 0 by decreasing 5 every time.

class Example15 {
    public static void main(String[] args) {

        int i = 100;

        do {
            System.out.println(i);
            i -= 5;
        } while (i >= 0);

    }
}


/*
=========================================
           END OF PRACTICE SET
=========================================

Happy Coding!
=========================================
*/

