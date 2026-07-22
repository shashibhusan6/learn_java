/*
=========================================
     CHAPTER 10 - NESTED LOOP PRACTICE
=========================================

File Name:
Ch_10_NestedLoopQuestion.java

Total Questions : 20

Rules:
1. Use nested loops.
2. Try to solve every question yourself.
3. Do not look at the solution immediately.
4. Focus on understanding the row and column logic.

=========================================
        BASIC NESTED LOOP QUESTIONS
=========================================
*/


// Q1. Print a 5 x 5 square of stars.

/*
*****
*****
*****
*****
*****
*/


// Q2. Print a rectangle of 4 rows and 6 columns.

/*
******
******
******
******
*/


// Q3. Print the following pattern.

/*
*
**
***
****
*****
*/


// Q4. Print the following reverse pattern.

/*
*****
****
***
**
*
*/


// Q5. Print the following number pattern.

/*
1
12
123
1234
12345
*/


// Q6. Print the following reverse number pattern.

/*
12345
1234
123
12
1
*/


// Q7. Print the following pattern.

/*
1
22
333
4444
55555
*/


// Q8. Print the following pattern.

/*
1
23
456
789
*/


// Q9. Print the following pattern.

/*
5
54
543
5432
54321
*/


// Q10. Print the following pattern.

/*
A
AB
ABC
ABCD
ABCDE
*/


/*
=========================================
          INTERMEDIATE PATTERNS
=========================================
*/


// Q11. Print the following right-aligned triangle.

/*
    *
   **
  ***
 ****
*****
*/


// Q12. Print the following pattern.

/*
*****
 ****
  ***
   **
    *
*/


// Q13. Print the following pyramid.

/*
    *
   ***
  *****
 *******
*********
*/


// Q14. Print the following inverted pyramid.

/*
*********
 *******
  *****
   ***
    *
*/


// Q15. Print the following diamond pattern.

/*
    *
   ***
  *****
 *******
  *****
   ***
    *
*/


// Q16. Print the following hollow square.

/*
*****
*   *
*   *
*   *
*****
*/


// Q17. Print the following hollow rectangle.

/*
******
*    *
*    *
******
*/


// Q18. Print the following pattern.

/*
1
01
101
0101
10101
*/


/*
=========================================
             HARD PATTERNS
=========================================
*/


// Q19. Print the following number pyramid.

/*
    1
   121
  12321
 1234321
123454321
*/


// Q20. Print the following pattern.

/*
1
121
12321
1234321
123454321
*/


/*
=========================================
        END OF NESTED LOOP PRACTICE
=========================================

Total Questions: 20

Topics Covered:

✓ Square Patterns
✓ Rectangle Patterns
✓ Increasing Patterns
✓ Decreasing Patterns
✓ Number Patterns
✓ Character Patterns
✓ Right-Aligned Patterns
✓ Pyramid Patterns
✓ Inverted Pyramid
✓ Diamond Pattern
✓ Hollow Patterns
✓ 0-1 Patterns
✓ Palindromic Number Patterns

Next Step:
➡️ Solve all 20 questions
➡️ Learn the logic of rows and columns
➡️ Practice more star patterns
➡️ Move to Arrays


=========================================
*/







/*
=========================================
     CHAPTER 10 - NESTED LOOP PRACTICE
=========================================

File Name:
Ch_10_NestedLoopQuestion.java

Total Questions : 20

=========================================
*/


// Q1. Print a 5 x 5 square of stars.

class Example1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}


// Q2. Print a rectangle of 4 rows and 6 columns.

class Example2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 6; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}


// Q3. Print the following pattern.

/*
*
**
***
****
*****
*/

class Example3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}


// Q4. Print the following reverse pattern.

/*
*****
****
***
**
*
*/

class Example4 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}


// Q5. Print the following number pattern.

/*
1
12
123
1234
12345
*/

class Example5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}


// Q6. Print the following reverse number pattern.

/*
12345
1234
123
12
1
*/

class Example6 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}


// Q7. Print the following pattern.

/*
1
22
333
4444
55555
*/

class Example7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }

    }
}


// Q8. Print the following pattern.

/*
1
23
456
789
*/

class Example8 {
    public static void main(String[] args) {

        int num = 1;

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }

            System.out.println();
        }

    }
}


// Q9. Print the following pattern.

/*
5
54
543
5432
54321
*/

class Example9 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {

            for (int j = 5; j >= i; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}


// Q10. Print the following pattern.

/*
A
AB
ABC
ABCD
ABCDE
*/

class Example10 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }

    }
}


// Q11. Print the following right-aligned triangle.

/*
    *
   **
  ***
 ****
*****
*/

class Example11 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int space = 1; space <= 5 - i; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}


// Q12. Print the following pattern.

/*
*****
 ****
  ***
   **
    *
*/

class Example12 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {

            for (int space = 1; space <= 5 - i; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}


// Q13. Print the following pyramid.

/*
    *
   ***
  *****
 *******
*********
*/

class Example13 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int space = 1; space <= 5 - i; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}


// Q14. Print the following inverted pyramid.

/*
*********
 *******
  *****
   ***
    *
*/

class Example14 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {

            for (int space = 1; space <= 5 - i; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}


// Q15. Print the following diamond pattern.

/*
    *
   ***
  *****
 *******
  *****
   ***
    *
*/

class Example15 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int space = 1; space <= 5 - i; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 4; i >= 1; i--) {

            for (int space = 1; space <= 5 - i; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}


// Q16. Print the following hollow square.

/*
*****
*   *
*   *
*   *
*****
*/

class Example16 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {

                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }

    }
}


// Q17. Print the following hollow rectangle.

/*
******
*    *
*    *
******
*/

class Example17 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 6; j++) {

                if (i == 1 || i == 4 || j == 1 || j == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }

    }
}


// Q18. Print the following pattern.

/*
1
01
101
0101
10101
*/

class Example18 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }

            }

            System.out.println();
        }

    }
}


// Q19. Print the following number pyramid.

/*
    1
   121
  12321
 1234321
123454321
*/

class Example19 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int space = 1; space <= 5 - i; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}


// Q20. Print the following pattern.

/*
1
121
12321
1234321
123454321
*/

class Example20 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}


/*
=========================================
        END OF NESTED LOOP PRACTICE
=========================================

Total Questions: 20


=========================================
*/


/*
=========================================
      MORE NESTED LOOP QUESTIONS
=========================================
*/


// Q21. Print the following pattern.

/*
*****
*   *
*   *
*   *
*****
*/


// Q22. Print the following pattern.

/*
1
22
333
4444
55555
4444
333
22
1
*/


// Q23. Print the following pattern.

/*
12345
2345
345
45
5
*/


// Q24. Print the following pattern.

/*
54321
4321
321
21
1
*/


// Q25. Print the following pattern.

/*
1
21
321
4321
54321
*/


// Q26. Print the following pattern.

/*
12345
2345
345
45
5
*/


// Q27. Print the following pattern.

/*
*****
****
***
**
*
*
**
***
****
*****
*/


// Q28. Print the following pattern.

/*
1
12
123
1234
12345
1234
123
12
1
*/


// Q29. Print the following pattern.

/*
    1
   12
  123
 1234
12345
*/


// Q30. Print the following pattern.

/*
12345
 1234
  123
   12
    1
*/


// Q31. Print the following hollow triangle.

/*
    *
   * *
  *   *
 *     *
*********
*/


// Q32. Print the following inverted hollow triangle.

/*
*********
 *     *
  *   *
   * *
    *
*/


// Q33. Print the following pattern.

/*
1
01
101
0101
10101
010101
*/


// Q34. Print the following pattern.

/*
A
BB
CCC
DDDD
EEEEE
*/


// Q35. Print the following pattern.

/*
ABCDE
ABCD
ABC
AB
A
*/


// Q36. Print the following pattern.

/*
A
BA
CBA
DCBA
EDCBA
*/


// Q37. Print the following pattern.

/*
1
23
456
789
101112
*/


// Q38. Print the following pattern.

/*
1
22
333
4444
55555
4444
333
22
1
*/


// Q39. Print the following pattern.

/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/


// Q40. Print the following pattern.

/*
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1
*/


/*
=========================================
        END OF QUESTIONS
=========================================

Total New Questions: 20

New Range:
Q21 - Q40

Focus Areas:
✓ Nested loops
✓ Number patterns
✓ Character patterns
✓ Hollow patterns
✓ Pyramid patterns
✓ Inverted patterns
✓ Diamond patterns
✓ Palindrome patterns

=========================================
*/