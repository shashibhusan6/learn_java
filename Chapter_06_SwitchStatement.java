/*
=========================================
Chapter 06 - Switch Statement
=========================================

What is Switch?
---------------
- switch is a decision-making statement.
- It selects one block of code from multiple choices.
- It is a cleaner alternative to multiple if-else-if
  statements when comparing one variable with fixed values.

Syntax
------

switch(expression) {

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

How Switch Works
----------------
1. Expression is evaluated once.
2. Java compares it with each case.
3. If a match is found:
      -> Executes that case.
      -> Stops when break is encountered.
4. If no case matches:
      -> default block executes.

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

Output
------
Wednesday

-----------------------------------------
break Keyword
-----------------------------------------

- break immediately exits the switch block.
- It prevents execution of the remaining cases.

Without break
-------------

int n = 2;

switch(n){

    case 1:
        System.out.println("One");

    case 2:
        System.out.println("Two");

    case 3:
        System.out.println("Three");
}

Output
------
Two
Three

This behavior is called Fall Through.

With break
----------

int n = 2;

switch(n){

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

Output
------
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

switch(day){

    case 1:
        System.out.println("Monday");
        break;

    default:
        System.out.println("Invalid Day");
}

Output
------
Invalid Day

-----------------------------------------
switch vs if-else
-----------------------------------------

switch
-------
✔ Cleaner
✔ Better readability
✔ Best for fixed values

if-else
--------
✔ Supports complex conditions
✔ Can use >, <, >=, <=, &&, ||

Use switch when:
- Comparing one variable with constant values.

Use if-else when:
- Working with ranges or logical expressions.

-----------------------------------------
Key Points
-----------------------------------------

✔ switch compares one expression.
✔ case represents possible values.
✔ break prevents fall-through.
✔ default executes when no case matches.
✔ default is optional.
✔ Missing break causes execution of all
  following cases.

-----------------------------------------
Interview Notes
-----------------------------------------

Q1. What is a switch statement?
-> A selection statement that executes
   one block from multiple choices.

Q2. Why is break used?
-> To exit the switch after executing
   the matched case.

Q3. What happens if break is omitted?
-> Fall-through occurs.

Q4. Is default mandatory?
-> No.

Q5. Can switch replace every if-else?
-> No.
   switch is only for fixed value matching.

=========================================
End of Chapter 06
=========================================
 */

public class Chapter_06_SwitchStatement {

    public static void main(String[] args) {

        // Example 1 : Basic Switch
        System.out.println("===== Example 1 =====");

        int day = 3;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Day");
        }

        // Example 2 : Fall Through
        System.out.println("\n===== Example 2 =====");

        int number = 2;

        switch (number) {

            case 1:
                System.out.println("One");

            case 2:
                System.out.println("Two");

            case 3:
                System.out.println("Three");
        }

        // Example 3 : Using break
        System.out.println("\n===== Example 3 =====");

        switch (number) {

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

        // Example 4 : Default Case
        System.out.println("\n===== Example 4 =====");

        int value = 8;

        switch (value) {

            case 1:
                System.out.println("Monday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}


/*
=========================================
Bonus - Java 12+ Enhanced Switch
=========================================

Java introduced an improved switch syntax
to make code cleaner and remove the need
for break statements.

-----------------------------------------
1. Arrow (->) Syntax
-----------------------------------------

Old Switch

switch(day) {

    case "Monday":
        System.out.println("Work");
        break;

    default:
        System.out.println("Holiday");
}

New Switch

switch(day) {

    case "Monday" -> System.out.println("Work");

    default -> System.out.println("Holiday");
}

Advantages
----------

✔ No break required.
✔ No fall-through.
✔ Cleaner syntax.
✔ Easier to read.

-----------------------------------------
2. Multiple Labels
-----------------------------------------

Multiple cases can be combined.

Example

switch(day){

    case "Saturday", "Sunday" ->
        System.out.println("Holiday");

    default ->
        System.out.println("Working Day");
}

-----------------------------------------
3. Switch Expression
-----------------------------------------

Switch can directly return a value.

Example

String alarm = switch(day){

    case "Saturday", "Sunday" -> "6:00 AM";

    case "Monday" -> "8:00 AM";

    default -> "7:00 AM";
};

System.out.println(alarm);

Output
------
6:00 AM

-----------------------------------------
4. yield Keyword
-----------------------------------------

When using the old colon (:) syntax with
Switch Expressions, use yield to return
a value.

Example

String alarm = switch(day){

    case "Monday":
        yield "8:00 AM";

    default:
        yield "7:00 AM";
};

-----------------------------------------
Key Points
-----------------------------------------

✔ Introduced in Java 12 (Preview).
✔ Standard feature from Java 14.
✔ Arrow (->) removes break.
✔ Supports multiple labels.
✔ Can return a value.
✔ Java 8 projects mostly use the
  classic switch statement.

=========================================
End of Bonus Notes
=========================================
 */
//=========================================
// Bonus Runnable Examples (Java 12+)
//=========================================
class Chapter_06_EnhancedSwitch {

    public static void main(String[] args) {

        // Example 1 : Arrow Syntax
        System.out.println("===== Example 1 =====");

        String day = "Monday";

        switch (day) {

            case "Monday" ->
                System.out.println("Work");

            case "Saturday", "Sunday" ->
                System.out.println("Holiday");

            default ->
                System.out.println("Normal Day");
        }

        // Example 2 : Switch Expression
        System.out.println("\n===== Example 2 =====");

        day = "Sunday";

        String alarm = switch (day) {

            case "Saturday", "Sunday" ->
                "6:00 AM";

            case "Monday" ->
                "8:00 AM";

            default ->
                "7:00 AM";
        };

        System.out.println("Alarm Time : " + alarm);

        // Example 3 : yield Keyword
        System.out.println("\n===== Example 3 =====");

        day = "Wednesday";

        alarm = switch (day) {

            case "Monday":
                yield "8:00 AM";

            case "Saturday":
            case "Sunday":
                yield "6:00 AM";

            default:
                yield "7:00 AM";
        };

        System.out.println("Alarm Time : " + alarm);
    }
}
