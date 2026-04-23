# Java Conditional Statements - Complete Theory Notes

## 1. Introduction

Conditional statements in Java allow a program to make decisions.
They help the program choose different actions based on whether a condition is true or false.

This is a core part of programming logic because real-world programs must react differently in different situations.

Examples:

- if a student passes, show a success message
- if a password is correct, allow login
- if the day number is 1, show Monday

---

## 2. What Is a Conditional Statement?

A conditional statement is a structure that checks a condition and decides which block of code should run.

### Simple idea
It is like asking a question:

> “If this is true, do this. Otherwise, do something else.”

---

## 3. Why Conditional Statements Matter

Without conditions, a program would do the same thing every time.
Conditional logic allows software to become intelligent and responsive.

It is used in:

- login systems
- grading systems
- payment checks
- menus
- game rules
- security validation

---

## 4. Main Types of Conditional Statements in Java

Java commonly uses:

1. `if`
2. `if-else`
3. `else-if` ladder
4. nested `if`
5. `switch`

Each one is useful in different situations.

---

## 5. The if Statement

The `if` statement runs a block only when the condition is true.

### Syntax
```java
if (condition) {
    // code to run if condition is true
}
```

### Example
```java
if (age >= 18) {
    System.out.println("Eligible to vote");
}
```

### Meaning
If the condition is false, the code block is skipped.

---

## 6. The if-else Statement

The `if-else` statement chooses between two paths.

### Syntax
```java
if (condition) {
    // true block
} else {
    // false block
}
```

### Example
```java
if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

### Use case
This is useful when exactly one of two outcomes should happen.

---

## 7. The else-if Ladder

An `else-if` ladder is used when there are multiple conditions to test.

### Example
```java
if (marks >= 90) {
    System.out.println("A+");
} else if (marks >= 75) {
    System.out.println("A");
} else if (marks >= 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

### Important point
Java checks from top to bottom and stops at the first true condition.

---

## 8. Nested if Statements

A nested `if` means placing one `if` statement inside another.

### Example use
This is useful when one condition should only be checked after another condition is true.

Example:

- first check username
- then check password

### Illustration
```text
If username is correct
    Then check password
        If password is correct
            Login success
```

---

## 9. The switch Statement

The `switch` statement is useful when a variable needs to be compared against many exact values.

### Syntax
```java
switch (variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code
}
```

### Example
```java
switch (dayNumber) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

---

## 10. Why break Is Important in switch

The `break` statement stops Java from continuing into the next case.
Without `break`, Java may execute multiple cases one after another.
This is called **fall-through**.

### Example idea
If `break` is missing, the output may continue to the next case unexpectedly.

---

## 11. if-else vs switch

| Feature | if-else | switch |
|--------|---------|--------|
| Best for ranges and complex conditions | Yes | No |
| Best for exact value matching | Sometimes | Yes |
| Can test multiple logical expressions | Yes | Limited |
| Easy for menu-style options | Moderate | Excellent |

### Rule of thumb
- use `if-else` for ranges or complex conditions
- use `switch` for fixed exact values like days, menu options, or status codes

---

## 12. Conditions and Boolean Expressions

A condition in Java usually produces a boolean result: `true` or `false`.

### Example conditions
```java
age >= 18
marks > 50
username.equals("admin")
number % 2 == 0
```

These expressions are the heart of conditional logic.

---

## 13. Logical Operators in Conditions

Conditions are often combined using logical operators.

| Operator | Meaning | Example |
|----------|---------|---------|
| `&&` | AND | `age > 18 && citizen == true` |
| `||` | OR | `marks > 50 || sportsQuota == true` |
| `!` | NOT | `!isLoggedIn` |

### Example
```java
if (age >= 18 && hasIdCard) {
    System.out.println("Entry allowed");
}
```

---

## 14. Real-World Uses of Conditional Statements

### In login systems
- validate username and password

### In grading systems
- assign grade based on marks

### In banking systems
- check sufficient balance
- confirm pin correctness

### In shopping systems
- apply discounts if conditions are met

### In games
- win or lose decisions
- health checks
- level unlocking

---

## 15. Common Mistakes Students Make

### Mistake 1
Using `=` instead of `==` in a condition.

### Mistake 2
Writing conditions in the wrong order in an `else-if` ladder.

### Mistake 3
Forgetting `break` in `switch` cases.

### Mistake 4
Making nested conditions too complicated and hard to read.

### Mistake 5
Not understanding that only the first true `else-if` block runs.

---

## 16. Examples Included in This Module

This module provides practical programs for:

- simple `if`
- `if-else`
- `else-if` ladder
- nested `if`
- `switch` statement

These examples are useful for understanding how decisions are made in Java programs.

---

## 17. Flow Illustration

```text
Check condition
     |
   true ---------> run true block
     |
   false --------> run false block or next condition
```

This is the general logic behind all conditional statements.

---

## 18. Interview Questions and Answers

### Question 1
What is a conditional statement in Java?

**Answer:** It is a statement that allows the program to make decisions based on a true or false condition.

### Question 2
What is the difference between `if` and `if-else`?

**Answer:** `if` runs code only when the condition is true, while `if-else` provides an alternative block when the condition is false.

### Question 3
When should you use an `else-if` ladder?

**Answer:** When multiple conditions need to be checked in sequence.

### Question 4
What is a nested `if` statement?

**Answer:** An `if` statement placed inside another `if` statement.

### Question 5
What is the purpose of the `switch` statement?

**Answer:** To compare one variable against multiple exact values more clearly.

### Question 6
Why is `break` used in a switch case?

**Answer:** To stop execution from falling through into the next case.

### Question 7
Can `switch` be used for range conditions like marks > 50?

**Answer:** Not in the same flexible way as `if-else`; `if-else` is better for ranges.

### Question 8
What type of result does a condition produce?

**Answer:** A boolean value: `true` or `false`.

### Question 9
What does `&&` mean in a condition?

**Answer:** Logical AND. Both conditions must be true.

### Question 10
What does `||` mean in a condition?

**Answer:** Logical OR. At least one condition must be true.

### Question 11
What is a common mistake in switch statements?

**Answer:** Forgetting the `break` keyword.

### Question 12
Why are conditional statements important in programming?

**Answer:** They allow the program to react differently based on different situations.

---

## 19. Quick Revision Summary

```text
if         -> one condition
if-else    -> two possible paths
else-if    -> many conditions
nested if  -> condition inside condition
switch     -> compare one value with many exact options
```

---

## 20. Final Conclusion

Conditional statements are essential in Java because they give programs decision-making ability.
They allow software to behave intelligently instead of following only one fixed path.

If you remember one key idea, let it be this:

> Conditional statements are the part of programming that makes software choose what to do next.

Mastering conditionals is a major step toward writing real-world Java applications.
