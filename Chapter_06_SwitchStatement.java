/*
=========================================
Chapter 06 - Switch Statement
=========================================

What is Switch?
---------------
- switch is a decision-making statement.
- It selects one block of code to execute from multiple choices.
- It is a cleaner alternative to multiple if-else-if statements
  when comparing one variable with fixed values.

Syntax
------
switch (expression) {
    case value1:
        // code
        break;

    case value2:
        // code
        break;

    ...

    default:
        // code
}

How switch Works
----------------
1. Expression is evaluated once.
2. Java compares it with each case.
3. If a match is found:
      -> Executes that case.
      -> Stops when break is encountered.
4. If no case matches:
      -> default block executes (if present).

Example
-------

int day = 3;

switch(day) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid Day");
}

Output:
-------
Wednesday

-----------------------------------------
break Keyword
-----------------------------------------
- break exits the switch block immediately.
- Prevents execution of the remaining cases.

Without break
-------------

int n = 2;

switch(n) {
    case 1:
        System.out.println("One");

    case 2:
        System.out.println("Two");

    case 3:
        System.out.println("Three");
}

Output:
-------
Two
Three

This behavior is called "Fall Through".

With break
----------

int n = 2;

switch(n) {
    case 1:
        System.out.println("One");
        break;

    case 2:
        System.out.println("Two");
        break;

    case 3:
        System.out.println("Three");
        break;
}

Output:
-------
Two

-----------------------------------------
default Case
-----------------------------------------
- Executes when no case matches.
- Similar to the final else block.
- Optional but recommended.

Example
-------

int day = 8;

switch(day) {
    case 1:
        System.out.println("Monday");
        break;

    default:
        System.out.println("Invalid Day");
}

Output:
-------
Invalid Day

-----------------------------------------
switch vs if-else
-----------------------------------------

switch
-------
✔ Better readability
✔ Faster for multiple fixed values
✔ Cleaner code

if-else
--------
✔ Supports complex conditions
✔ Can use >, <, >=, <=, &&, ||

Use switch when:
- Comparing one variable with multiple constant values.

Use if-else when:
- Working with ranges or complex logical conditions.

-----------------------------------------
Key Points
-----------------------------------------
✔ switch compares one expression.
✔ case represents possible values.
✔ break prevents fall-through.
✔ default executes if no case matches.
✔ default is optional.
✔ Missing break causes execution of subsequent cases.

-----------------------------------------
Interview Notes
-----------------------------------------
1. What is a switch statement?
   -> A selection statement used to execute one block
      from multiple choices.

2. Why is break used?
   -> To exit the switch after executing the matched case.

3. What happens if break is omitted?
   -> Fall-through occurs and remaining cases execute.

4. Is default mandatory?
   -> No, but it is recommended.

5. Can switch replace every if-else statement?
   -> No.
      switch works only for fixed value matching,
      whereas if-else supports complex conditions.

=========================================
End of Chapter 06
=========================================
*/