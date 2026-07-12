/*
=========================================
        CHAPTER 08 - DO WHILE LOOP
=========================================

WHAT IS A DO-WHILE LOOP?

A do-while loop is an entry-controlled loop that executes
the block of code at least ONCE before checking the condition.

SYNTAX:

do {
    // Code
} while(condition);

WORKING:
1. Execute the code inside the do block.
2. Check the condition.
3. If the condition is true, repeat.
4. If false, stop.

-----------------------------------------
Difference Between while and do-while
-----------------------------------------

while loop:
- Checks condition first.
- May execute 0 times.

do-while loop:
- Executes first.
- Checks condition later.
- Executes at least 1 time.

-----------------------------------------
When to use do-while?
-----------------------------------------

Use do-while when the code must run at least once.

Examples:
- ATM Menu
- Login System
- Game Menu
- Menu Driven Programs
- Taking user input until valid

=========================================
Example 1
=========================================
*/

public class Ch_08_DoWhile_Loops {

    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

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
Print Even Numbers
=========================================
*/

class Example2 {

    public static void main(String[] args) {

        int i = 2;

        do {
            System.out.println(i);
            i += 2;
        } while (i <= 20);

    }
}


/*
=========================================
Example 3
Print Odd Numbers
=========================================
*/

class Example3 {

    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println(i);
            i += 2;
        } while (i <= 19);

    }
}


/*
=========================================
Example 4
Print Multiplication Table of 5
=========================================
*/

class Example4 {

    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println("5 x " + i + " = " + (5 * i));
            i++;
        } while (i <= 10);

    }
}


/*
=========================================
Example 5
Countdown
=========================================
*/

class Example5 {

    public static void main(String[] args) {

        int i = 10;

        do {
            System.out.println(i);
            i--;
        } while (i >= 1);

    }
}


/*
=========================================
Example 6
Condition False Initially
(do-while still executes once)
=========================================
*/

class Example6 {

    public static void main(String[] args) {

        int i = 100;

        do {
            System.out.println("Executed Once");
        } while (i < 10);

    }
}


/*
=========================================
Quick Revision
=========================================

Syntax:

do {
    // statements
} while(condition);

Points to Remember:

1. Executes at least once.
2. Condition checked after execution.
3. Useful for menu-driven programs.
4. Semicolon (;) is compulsory after while(condition).

Example:

do {
    System.out.println("Hello");
} while(false);

Output:
Hello

=========================================
*/