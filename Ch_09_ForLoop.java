/*
=========================================
        CHAPTER 09 - FOR LOOP
=========================================

WHAT IS A FOR LOOP?

A for loop is used when we know in advance
how many times we want to repeat a block of code.

It is called an entry-controlled loop because
the condition is checked before executing the loop body.

-----------------------------------------
SYNTAX
-----------------------------------------

for(initialization; condition; update) {
    // Code
}

Example:

for(int i = 1; i <= 5; i++) {
    System.out.println(i);
}

-----------------------------------------
HOW IT WORKS
-----------------------------------------

1. Initialization executes once.
2. Condition is checked.
3. If true, loop body executes.
4. Update statement executes.
5. Again condition is checked.
6. Loop continues until condition becomes false.

-----------------------------------------
Parts of a for Loop
-----------------------------------------

Initialization
↓
Condition
↓
Loop Body
↓
Update
↓
Repeat

-----------------------------------------
When to use a for Loop?
-----------------------------------------

Use a for loop when the number of iterations
is known beforehand.

Examples:
- Printing numbers
- Tables
- Patterns
- Array traversal
- Counting

-----------------------------------------
Difference Between while and for
-----------------------------------------

while loop:
- Best when number of iterations is unknown.

for loop:
- Best when number of iterations is known.

=========================================
Example 1
Print Numbers from 1 to 5
=========================================
*/

public class Ch_09_ForLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

    }
}

/*
Output:
1
2
3
4
5
*/


/*
=========================================
Example 2
Print Numbers from 10 to 1
=========================================
*/

class Example2 {

    public static void main(String[] args) {

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

    }
}


/*
=========================================
Example 3
Print Even Numbers
=========================================
*/

class Example3 {

    public static void main(String[] args) {

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

    }
}


/*
=========================================
Example 4
Print Odd Numbers
=========================================
*/

class Example4 {

    public static void main(String[] args) {

        for (int i = 1; i <= 19; i += 2) {
            System.out.println(i);
        }

    }
}


/*
=========================================
Example 5
Multiplication Table of 7
=========================================
*/

class Example5 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }

    }
}


/*
=========================================
Example 6
Sum of Numbers from 1 to 10
=========================================
*/

class Example6 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);

    }
}


/*
=========================================
Example 7
Print Squares of Numbers
=========================================
*/

class Example7 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " -> " + (i * i));
        }

    }
}


/*
=========================================
Example 8
Infinite for Loop
(Press Stop to terminate)
=========================================
*/

class Example8 {

    public static void main(String[] args) {

        for (;;) {
            System.out.println("Infinite Loop");
        }

    }
}


/*
=========================================
Quick Revision
=========================================

Syntax:

for(initialization; condition; update) {
    // statements
}

Example:

for(int i = 1; i <= 5; i++) {
    System.out.println(i);
}

Points to Remember:

1. Initialization executes only once.
2. Condition is checked before every iteration.
3. Update executes after each iteration.
4. Best when the number of iterations is known.
5. A for loop can also be written as:

for(;;) {
    // Infinite loop
}

=========================================
*/