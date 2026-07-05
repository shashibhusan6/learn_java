/*
=========================================================
Chapter 05 : If Else Condition
=========================================================

📖 What You'll Learn
---------------------------------------------------------
• What are Conditional Statements?
• if Statement
• if-else Statement
• else-if Ladder
• Nested if
• Finding Greatest of 2 Numbers
• Finding Greatest of 3 Numbers
• Curly Braces Rules
• Best Practices

=========================================================
1. Introduction
=========================================================

In real life, we make decisions every day.

Examples:
• If it rains, take an umbrella.
• If age >= 18, eligible to vote.
• If marks >= 35, Pass else Fail.

Similarly, Java programs also make decisions.

These decisions are made using Conditional Statements.

Conditional statements control the flow of execution based
on whether a condition is true or false.

=========================================================
2. What are Conditional Statements?
=========================================================

Conditional statements allow a program to execute different
blocks of code depending on a condition.

Every condition must return either:

• true
• false

The condition is generally written using

• Relational Operators
• Logical Operators

Flow:

Condition
   |
True -----> Execute Block A
   |
False ----> Execute Block B

=========================================================
RUNNABLE CODE
=========================================================
*/

public class Ch_05_IfElseCondition {

    public static void main(String[] args) {

        // Example : Greatest of Three Numbers

        int x = 18;
        int y = 25;
        int z = 12;

        if (x > y && x > z) {
            System.out.println("Greatest Number = " + x);
        } else if (y > z) {
            System.out.println("Greatest Number = " + y);
        } else {
            System.out.println("Greatest Number = " + z);
        }
    }
}

/*

Output
------
Greatest Number = 25


=========================================================
3. if Statement
=========================================================

The if statement executes a block of code only when the
condition is true.

Syntax

if(condition)
{
    // code
}

Example

int age = 20;

if(age >= 18)
{
    System.out.println("Eligible");
}

Output

Eligible

---------------------------------------------------------

Example

int marks = 25;

if(marks >= 35)
{
    System.out.println("Pass");
}

Output

Nothing is printed because the condition is false.

=========================================================
4. if-else Statement
=========================================================

Use if-else when exactly one block should execute.

Syntax

if(condition)
{
    // True Block
}
else
{
    // False Block
}

Example

int age = 16;

if(age >= 18)
{
    System.out.println("Adult");
}
else
{
    System.out.println("Minor");
}

Output

Minor

---------------------------------------------------------

Example

int number = 8;

if(number % 2 == 0)
{
    System.out.println("Even");
}
else
{
    System.out.println("Odd");
}

Output

Even

=========================================================
5. else-if Ladder
=========================================================

Used when multiple conditions need to be checked.

Syntax

if(condition1)
{
}
else if(condition2)
{
}
else if(condition3)
{
}
else
{
}

Only the first true block executes.

---------------------------------------------------------

Example

int marks = 72;

if(marks >= 90)
{
    System.out.println("Grade A");
}
else if(marks >= 75)
{
    System.out.println("Grade B");
}
else if(marks >= 35)
{
    System.out.println("Pass");
}
else
{
    System.out.println("Fail");
}

Output

Pass

=========================================================
6. Nested if
=========================================================

A Nested if means writing one if statement inside another.

Syntax

if(condition1)
{
    if(condition2)
    {
        // code
    }
}

Example

int age = 20;
boolean hasLicense = true;

if(age >= 18)
{
    if(hasLicense)
    {
        System.out.println("Can Drive");
    }
}

Output

Can Drive

=========================================================
7. Finding the Largest of Two Numbers
=========================================================

Example

int x = 15;
int y = 22;

if(x > y)
{
    System.out.println(x);
}
else
{
    System.out.println(y);
}

Output

22

=========================================================
8. Finding the Largest of Three Numbers
=========================================================

Example

int x = 18;
int y = 25;
int z = 12;

if(x > y && x > z)
{
    System.out.println(x);
}
else if(y > z)
{
    System.out.println(y);
}
else
{
    System.out.println(z);
}

Output

25

---------------------------------------------------------

Optimization

Instead of writing

else if(y > x && y > z)

write

else if(y > z)

Reason:

If execution reaches else-if,
it already means x is NOT the largest.

So comparing y with x again is unnecessary.

This saves one comparison and makes the code cleaner.

=========================================================
9. Curly Braces Rules
=========================================================

Single Statement

if(age >= 18)
    System.out.println("Adult");

Curly braces are optional.

---------------------------------------------------------

Multiple Statements

if(age >= 18)
{
    System.out.println("Adult");
    System.out.println("Eligible to Vote");
}

Curly braces are mandatory.

---------------------------------------------------------

Best Practice

Always use curly braces even for a single statement.

It improves readability and prevents bugs.

=========================================================
Important Notes
=========================================================

✓ if executes only when condition is true.

✓ else executes when if condition is false.

✓ else cannot exist without if.

✓ else-if is used for multiple conditions.

✓ Only one block executes in an if-else-if ladder.

✓ Conditions always return true or false.

✓ Logical operators (&&, ||, !) can combine conditions.

✓ Java does NOT depend on indentation.

✓ Java uses curly braces {} to define blocks.

*/



/*
=========================================================
10. Ternary Operator (? :)
=========================================================

The Ternary Operator is a shortcut for a simple if-else.

Instead of writing multiple lines, we can write the
condition in a single line.

Syntax

variable = (condition) ? value_if_true : value_if_false;

Flow

Condition
   |
True -----> value_if_true
   |
False ----> value_if_false

---------------------------------------------------------
Example using if-else
---------------------------------------------------------

int age = 20;
String msg;

if(age >= 18)
{
    msg = "Adult";
}
else
{
    msg = "Minor";
}

System.out.println(msg);

Output

Adult

---------------------------------------------------------
Same Example using Ternary Operator
---------------------------------------------------------

int age = 20;

String msg = (age >= 18) ? "Adult" : "Minor";

System.out.println(msg);

Output

Adult

---------------------------------------------------------
Example : Even or Odd
---------------------------------------------------------

int number = 7;

String result = (number % 2 == 0) ? "Even" : "Odd";

System.out.println(result);

Output

Odd

---------------------------------------------------------
Example : Assigning Integer Value
---------------------------------------------------------

int n = 4;

int result = (n % 2 == 0) ? 10 : 20;

System.out.println(result);

Output

10

=========================================================
When to Use Ternary Operator
=========================================================

✓ Simple conditions

✓ Assigning one of two values

✓ Returning values from methods

✓ Making code shorter and cleaner

=========================================================
When NOT to Use Ternary Operator
=========================================================

✗ Multiple statements

✗ Complex logic

✗ Nested conditions

✗ Long expressions

In such cases, use normal if-else.

=========================================================
Real-World Examples
=========================================================

1. Voting Eligibility

int age = 22;

if(age >= 18)
{
    System.out.println("Eligible to Vote");
}
else
{
    System.out.println("Not Eligible");
}

---------------------------------------------------------

2. Student Result

int marks = 80;

if(marks >= 35)
{
    System.out.println("Pass");
}
else
{
    System.out.println("Fail");
}

---------------------------------------------------------

3. Login Check

boolean loggedIn = true;

if(loggedIn)
{
    System.out.println("Welcome");
}
else
{
    System.out.println("Login First");
}

---------------------------------------------------------

4. Maximum Number

int a = 25;
int b = 18;

System.out.println((a > b) ? a : b);

=========================================================
Best Practices
=========================================================

✓ Write meaningful conditions.

✓ Keep if blocks small.

✓ Use else-if instead of multiple independent if statements
when only one block should execute.

✓ Avoid deeply nested if statements.

✓ Always use curly braces {} for better readability.

✓ Use ternary operator only for simple assignments.

✓ Indent your code properly.

=========================================================
Common Mistakes
=========================================================

❌ Using = instead of ==

Wrong

if(age = 18)

Correct

if(age == 18)

---------------------------------------------------------

❌ Forgetting braces with multiple statements

Wrong

if(age >= 18)
    System.out.println("Adult");
    System.out.println("Vote");

Correct

if(age >= 18)
{
    System.out.println("Adult");
    System.out.println("Vote");
}

---------------------------------------------------------

❌ Using ternary operator for complex logic

Prefer if-else for readability.

=========================================================
Chapter Summary
=========================================================

In this chapter, you learned

✓ What are Conditional Statements

✓ if Statement

✓ if-else Statement

✓ else-if Ladder

✓ Nested if

✓ Finding Largest of Two Numbers

✓ Finding Largest of Three Numbers

✓ Curly Braces Rules

✓ Ternary Operator

✓ Best Practices

=========================================================
Interview Notes
=========================================================

Q1. What is a Conditional Statement?

A conditional statement changes the flow of program
execution based on a true or false condition.

---------------------------------------------------------

Q2. Difference between if and if-else?

if executes only when the condition is true.

if-else executes one block when true and another block
when false.

---------------------------------------------------------

Q3. Can else exist without if?

No.

---------------------------------------------------------

Q4. Can we write multiple else-if blocks?

Yes.

---------------------------------------------------------

Q5. Which block executes in an else-if ladder?

Only the first block whose condition becomes true.

---------------------------------------------------------

Q6. Can if exist without else?

Yes.

---------------------------------------------------------

Q7. Can else-if exist without if?

No.

---------------------------------------------------------

Q8. What is a Nested if?

An if statement inside another if statement.

---------------------------------------------------------

Q9. What is the Ternary Operator?

A shorthand version of if-else.

Syntax

condition ? value1 : value2

---------------------------------------------------------

Q10. When should we avoid the ternary operator?

When the logic is complex or contains multiple statements.

=========================================================
Practice Questions
=========================================================

1. Check whether a number is positive or negative.

2. Check whether a number is even or odd.

3. Find the largest of two numbers.

4. Find the largest of three numbers.

5. Check whether a person is eligible to vote.

6. Check whether a student passed or failed.

7. Find the smallest of three numbers.

8. Print grade using else-if ladder.

9. Convert an if-else program into a ternary operator.

10. Check whether a year is a leap year.

11. Find the maximum using the ternary operator.

12. Check whether a character is uppercase or lowercase.

13. Check whether a number lies between 1 and 100.

14. Find the absolute value of a number using a ternary operator.

15. Write a nested if program for ATM withdrawal.

=========================================================
End of Chapter 05
=========================================================
*/