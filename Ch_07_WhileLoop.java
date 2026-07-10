/*
=========================================
            WHILE LOOP IN JAVA
=========================================

Definition:
A while loop is an entry-controlled loop.
It checks the condition before executing the loop body.

If the condition is true, the loop executes.
If the condition is false, the loop stops.

Syntax:

while(condition){
    // code
}

Flow:
1. Initialize variable
2. Check condition
3. Execute loop body
4. Update variable
5. Repeat until condition becomes false

*/

// =========================================
// Main Program (Runnable)
// =========================================

public class Ch_07_WhileLoop {

    public static void main(String[] args) {

        System.out.println("Example 1: Print numbers from 1 to 5");

        int i = 1;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

    }
}

/*
=========================================
Example 2 : Print Numbers 10 to 1
=========================================

int i = 10;

while(i >= 1){
    System.out.println(i);
    i--;
}

Output:
10
9
8
7
6
5
4
3
2
1

*/

/*
=========================================
Example 3 : Print Even Numbers
=========================================

int i = 2;

while(i <= 20){
    System.out.println(i);
    i += 2;
}

Output:
2
4
6
8
10
12
14
16
18
20

*/

/*
=========================================
Example 4 : Print Odd Numbers
=========================================

int i = 1;

while(i <= 20){
    System.out.println(i);
    i += 2;
}

*/

/*
=========================================
Example 5 : Sum of 1 to 10
=========================================

int i = 1;
int sum = 0;

while(i <= 10){
    sum += i;
    i++;
}

System.out.println(sum);

Output:
55

*/

/*
=========================================
Example 6 : Multiplication Table
=========================================

int num = 7;
int i = 1;

while(i <= 10){
    System.out.println(num + " x " + i + " = " + (num * i));
    i++;
}

*/

/*
=========================================
Example 7 : Infinite While Loop
=========================================

while(true){
    System.out.println("Hello");
}

NOTE:
This loop never stops until the program is terminated.

*/

/*
=========================================
Example 8 : Count Digits
=========================================

int num = 12345;
int count = 0;

while(num > 0){
    count++;
    num /= 10;
}

System.out.println(count);

Output:
5

*/

/*
=========================================
Example 9 : Reverse a Number
=========================================

int num = 1234;
int reverse = 0;

while(num > 0){

    int digit = num % 10;

    reverse = reverse * 10 + digit;

    num /= 10;
}

System.out.println(reverse);

Output:
4321

*/

/*
=========================================
Example 10 : Factorial
=========================================

int num = 5;
int fact = 1;

while(num > 0){
    fact *= num;
    num--;
}

System.out.println(fact);

Output:
120

*/

/*
=========================================
Advantages of while Loop
=========================================

✔ Easy to understand
✔ Best when number of iterations is unknown
✔ Saves code repetition
✔ Useful for user input and menu-driven programs
✔ Commonly used in DSA and competitive programming

*/

/*
=========================================
Difference Between while and for
=========================================

while Loop
-----------
- Used when iterations are unknown.
- Initialization is usually outside the loop.
- Update is usually inside the loop.

for Loop
---------
- Used when iterations are known.
- Initialization, condition and update are together.
- More compact syntax.

*/

/*
=========================================
Common Mistakes
=========================================

1. Forgetting to update the variable

int i = 1;

while(i <= 5){
    System.out.println(i);
}

Infinite Loop

-----------------------------------------

2. Wrong condition

int i = 10;

while(i <= 5){
    System.out.println(i);
}

Output:
Nothing

-----------------------------------------

3. Updating in the wrong direction

int i = 1;

while(i <= 5){
    System.out.println(i);
    i--;
}

Infinite Loop

*/