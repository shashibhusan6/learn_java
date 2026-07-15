/*
=========================================
      CHAPTER 07 - WHILE LOOP PRACTICE
=========================================

Total Questions : 45

Easy   : Q1 - Q15
Medium : Q16 - Q30
Hard   : Q31 - Q45

Rule:
- Solve every question using ONLY while loops.
- Do not use for loops.
- Try yourself before checking the solution.

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

// Q13. Print all alphabets from A to Z.

// Q14. Print all lowercase alphabets from a to z.

// Q15. Print numbers from 100 to 0 by decreasing 5 every time.



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

// Q45. Print this pattern using while loops only.

/*
*
**
***
****
*****
*/





/*
=========================================
            EASY LEVEL
=========================================
*/


// Q1. Print numbers from 1 to 10.

class Example1 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }

    }
}


// Q2. Print numbers from 10 to 1.

class Example2 {
    public static void main(String[] args) {

        int i = 10;

        while (i >= 1) {
            System.out.println(i);
            i--;
        }

    }
}


// Q3. Print numbers from 1 to 100.

class Example3 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 100) {
            System.out.println(i);
            i++;
        }

    }
}


// Q4. Print numbers from 50 to 100.

class Example4 {
    public static void main(String[] args) {

        int i = 50;

        while (i <= 100) {
            System.out.println(i);
            i++;
        }

    }
}


// Q5. Print even numbers from 1 to 20.

class Example5 {
    public static void main(String[] args) {

        int i = 2;

        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }

    }
}


// Q6. Print odd numbers from 1 to 20.

class Example6 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 20) {
            System.out.println(i);
            i += 2;
        }

    }
}


// Q7. Print multiples of 5 from 5 to 50.

class Example7 {
    public static void main(String[] args) {

        int i = 5;

        while (i <= 50) {
            System.out.println(i);
            i += 5;
        }

    }
}


// Q8. Print numbers from -10 to 10.

class Example8 {
    public static void main(String[] args) {

        int i = -10;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }

    }
}


// Q9. Print squares of numbers from 1 to 10.

class Example9 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            System.out.println(i * i);
            i++;
        }

    }
}


// Q10. Print cubes of numbers from 1 to 10.

class Example10 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            System.out.println(i * i * i);
            i++;
        }

    }
}


// Q11. Print the multiplication table of 7.

class Example11 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            System.out.println("7 x " + i + " = " + (7 * i));
            i++;
        }

    }
}


// Q12. Print the multiplication table of 13.

class Example12 {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 10) {
            System.out.println("13 x " + i + " = " + (13 * i));
            i++;
        }

    }
}


// Q13. Print all alphabets from A to Z.

class Example13 {
    public static void main(String[] args) {

        char ch = 'A';

        while (ch <= 'Z') {
            System.out.println(ch);
            ch++;
        }

    }
}


// Q14. Print all lowercase alphabets from a to z.

class Example14 {
    public static void main(String[] args) {

        char ch = 'a';

        while (ch <= 'z') {
            System.out.println(ch);
            ch++;
        }

    }
}


// Q15. Print numbers from 100 to 0 by decreasing 5 every time.

class Example15 {
    public static void main(String[] args) {

        int i = 100;

        while (i >= 0) {
            System.out.println(i);
            i -= 5;
        }

    }
}




/*
=========================================
           MEDIUM LEVEL
=========================================
*/


// Q16. Find the sum of numbers from 1 to 10.

class Example16 {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);

    }
}


// Q17. Find the sum of numbers from 1 to 100.

class Example17 {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i <= 100) {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);

    }
}


// Q18. Find the sum of even numbers from 1 to 100.

class Example18 {
    public static void main(String[] args) {

        int i = 2;
        int sum = 0;

        while (i <= 100) {
            sum += i;
            i += 2;
        }

        System.out.println("Sum = " + sum);

    }
}


// Q19. Find the sum of odd numbers from 1 to 100.

class Example19 {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i <= 100) {
            sum += i;
            i += 2;
        }

        System.out.println("Sum = " + sum);

    }
}


// Q20. Find the factorial of a number.

class Example20 {
    public static void main(String[] args) {

        int num = 5;
        int i = 1;
        int fact = 1;

        while (i <= num) {
            fact *= i;
            i++;
        }

        System.out.println("Factorial = " + fact);

    }
}


// Q21. Reverse the digits of a number.

class Example21 {
    public static void main(String[] args) {

        int num = 12345;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        System.out.println("Reverse = " + reverse);

    }
}


// Q22. Count the number of digits in a number.

class Example22 {
    public static void main(String[] args) {

        int num = 987654;
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        System.out.println("Digits = " + count);

    }
}


// Q23. Find the sum of digits of a number.

class Example23 {
    public static void main(String[] args) {

        int num = 12345;
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum = " + sum);

    }
}


// Q24. Check whether a number is a palindrome.

class Example24 {
    public static void main(String[] args) {

        int num = 121;
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}


// Q25. Print the Fibonacci series up to N terms.

class Example25 {
    public static void main(String[] args) {

        int n = 10;
        int a = 0;
        int b = 1;
        int count = 1;

        while (count <= n) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;

            count++;
        }

    }
}


// Q26. Find the largest digit in a number.

class Example26 {
    public static void main(String[] args) {

        int num = 583921;
        int largest = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit > largest) {
                largest = digit;
            }

            num /= 10;
        }

        System.out.println("Largest Digit = " + largest);

    }
}


// Q27. Find the smallest digit in a number.

class Example27 {
    public static void main(String[] args) {

        int num = 583921;
        int smallest = 9;

        while (num > 0) {
            int digit = num % 10;

            if (digit < smallest) {
                smallest = digit;
            }

            num /= 10;
        }

        System.out.println("Smallest Digit = " + smallest);

    }
}


// Q28. Count even and odd digits in a number.

class Example28 {
    public static void main(String[] args) {

        int num = 123456789;
        int even = 0;
        int odd = 0;

        while (num > 0) {

            int digit = num % 10;

            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            num /= 10;
        }

        System.out.println("Even Digits = " + even);
        System.out.println("Odd Digits = " + odd);

    }
}


// Q29. Print all factors of a number.

class Example29 {
    public static void main(String[] args) {

        int num = 24;
        int i = 1;

        while (i <= num) {

            if (num % i == 0) {
                System.out.println(i);
            }

            i++;
        }

    }
}


// Q30. Check whether a number is a prime number.

class Example30 {
    public static void main(String[] args) {

        int num = 17;
        int i = 2;
        boolean isPrime = true;

        while (i < num) {

            if (num % i == 0) {
                isPrime = false;
                break;
            }

            i++;
        }

        if (num <= 1) {
            System.out.println("Not Prime");
        } else if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

    }
}