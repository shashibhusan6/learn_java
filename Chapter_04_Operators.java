/*
=========================================================
Chapter 05 : Relational Operators
=========================================================

📖 What You'll Learn
---------------------------------------------------------
• What are Relational Operators?
• Compare two values
• Boolean return type
• Equality vs Assignment
• Less than & Greater than operators
• <= and >= operators
• == (Equal to)
• != (Not Equal to)
• Using relational operators with int and double
• Real-world use cases

=========================================================
1. What are Relational Operators?
=========================================================

Relational Operators are used to compare two values.

The result of every relational operation is either:
• true
• false

The return type of relational operators is always boolean.

Example:

5 > 3   → true
5 < 3   → false

---------------------------------------------------------
RUNNABLE CODE:
---------------------------------------------------------  */
public class Chapter_04_Operators {
    public static void main(String[] args) {

        int x = 6;
        int y = 5;

        boolean result = x > y;

        System.out.println(result);
    }
}
/*---------------------------------------------------------
Output:
true

=========================================================
2. Relational Operators in Java
=========================================================

Operator        Meaning

<               Less than
>               Greater than
<=              Less than or equal to
>=              Greater than or equal to
==              Equal to
!=              Not equal to

---------------------------------------------------------
RUNNABLE CODE:
---------------------------------------------------------
public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);
    }
}
---------------------------------------------------------
Output:
true
false
true
false
false
true

=========================================================
3. Less Than (<)
=========================================================

RUNNABLE CODE:
---------------------------------------------------------
public class Main {
    public static void main(String[] args) {

        int x = 7;
        int y = 10;

        System.out.println(x < y);
    }
}
---------------------------------------------------------
Output:
true

=========================================================
4. Greater Than (>)
=========================================================

RUNNABLE CODE:
---------------------------------------------------------
public class Main {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        System.out.println(x > y);
    }
}
---------------------------------------------------------
Output:
true

=========================================================
5. Less Than or Equal To (<=)
=========================================================

RUNNABLE CODE:
---------------------------------------------------------
public class Main {
    public static void main(String[] args) {

        int x = 5;
        int y = 5;

        System.out.println(x <= y);
    }
}
---------------------------------------------------------
Output:
true

=========================================================
6. Greater Than or Equal To (>=)
=========================================================

RUNNABLE CODE:
---------------------------------------------------------
public class Main {
    public static void main(String[] args) {

        int x = 10;
        int y = 10;

        System.out.println(x >= y);
    }
}
---------------------------------------------------------
Output:
true

=========================================================
7. Equality Operator (==)
=========================================================

RUNNABLE CODE:
---------------------------------------------------------
public class Main {
    public static void main(String[] args) {

        int x = 10;
        int y = 10;

        System.out.println(x == y);
    }
}
---------------------------------------------------------
Output:
true

=========================================================
8. Not Equal Operator (!=)
=========================================================

RUNNABLE CODE:
---------------------------------------------------------
public class Main {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        System.out.println(x != y);
    }
}
---------------------------------------------------------
Output:
true

=========================================================
9. Difference Between = and ==
=========================================================

RUNNABLE CODE:
---------------------------------------------------------
public class Main {
    public static void main(String[] args) {

        int x = 10;

        System.out.println(x == 10);  // comparison
    }
}
---------------------------------------------------------
Output:
true

=========================================================
10. Using Relational Operators with double
=========================================================

RUNNABLE CODE:
---------------------------------------------------------
public class Main {
    public static void main(String[] args) {

        double a = 8.8;
        double b = 9.8;

        System.out.println(a < b);
    }
}
---------------------------------------------------------
Output:
true

=========================================================
11. Boolean Result
=========================================================

RUNNABLE CODE:
---------------------------------------------------------
public class Main {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        boolean result = x < y;

        System.out.println(result);
    }
}
---------------------------------------------------------
Output:
true

=========================================================
Real-World Example
=========================================================

RUNNABLE CODE:
---------------------------------------------------------
public class Main {
    public static void main(String[] args) {

        int marks = 72;

        System.out.println(marks >= 35); // pass check

        int age = 20;

        System.out.println(age >= 18);   // voting check
    }
}
---------------------------------------------------------
Output:
true
true

=========================================================
Key Points
=========================================================

✓ Used to compare two values.
✓ Always returns boolean.
✓ Works with primitive numeric data types.
✓ Frequently used with if, else, loops and conditions.
✓ = assigns values.
✓ == compares values.

=========================================================
What We Learned
=========================================================

• Learned what Relational Operators are.
• Compared two values using relational operators.
• Learned that relational operators always return boolean.
• Learned all relational operators:
    <, >, <=, >=, ==, !=
• Understood the difference between = and ==.
• Stored comparison results in a boolean variable.
• Used relational operators with int and double.
• Learned where relational operators are used in real programs.
• Got an introduction to decision-making in Java.

=========================================================
Interview Notes
=========================================================

Q1. What are Relational Operators?

Operators used to compare two values.

---------------------------------------------------------

Q2. What is the return type of relational operators?

boolean

---------------------------------------------------------

Q3. List all relational operators.

<
>
<=
>=
==
!=

---------------------------------------------------------

Q4. Difference between = and == ?

=  → Assignment
== → Comparison

---------------------------------------------------------

Q5. Difference between == and != ?

==  → Checks equality

!=  → Checks inequality

---------------------------------------------------------

Q6. Can relational operators be used with double?

Yes.

---------------------------------------------------------

Q7. Which operator checks equality?

==

---------------------------------------------------------

Q8. Which operator checks inequality?

!=

---------------------------------------------------------

Q9. What is the output?

int x = 6;
int y = 5;

System.out.println(x > y);

Output:

true

---------------------------------------------------------

Q10. What is the output?

int x = 5;
int y = 5;

System.out.println(x == y);

Output:

true

=========================================================
Common Mistakes
=========================================================

❌ Wrong

if (x = 10)

---------------------------------------------------------

✅ Correct

if (x == 10)

---------------------------------------------------------

❌ Wrong

int result = x > y;

---------------------------------------------------------

✅ Correct

boolean result = x > y;

=========================================================
Quick Revision
=========================================================

<     Less than

>     Greater than

<=    Less than or Equal

>=    Greater than or Equal

==    Equal to

!=    Not Equal

Return Type → boolean

=  → Assignment

== → Comparison

=========================================================
Practice Questions
=========================================================

1. What are relational operators?

2. What is the return type of relational operators?

3. Explain the difference between = and ==.

4. Explain the difference between == and !=.

5. Write a program to compare two integers.

6. Write a program to check whether a person is eligible to vote.

7. Write a program to check whether a student has passed.

8. Can relational operators be used with double?

9. Predict the output.

int x = 10;
int y = 20;

System.out.println(x <= y);

10. Predict the output.

int a = 5;
int b = 5;

System.out.println(a != b);

*/