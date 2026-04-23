# Java Arithmetic Operators - Complete Theory Notes

## 1. Introduction

Arithmetic operators in Java are used to perform mathematical calculations on numbers.
They are among the most frequently used operators in programming because they help us:

- add values
- subtract values
- multiply numbers
- divide numbers
- find remainders
- increase or decrease values quickly

These operators are essential for building logic in calculators, billing systems, student mark processing, games, banking programs, and almost every real-world application.

---

## 2. What Are Arithmetic Operators?

Arithmetic operators are symbols that tell Java to perform a mathematical operation.

### Common arithmetic operators in Java

| Operator | Meaning | Example |
|----------|---------|---------|
| + | Addition | `a + b` |
| - | Subtraction | `a - b` |
| * | Multiplication | `a * b` |
| / | Division | `a / b` |
| % | Modulus / Remainder | `a % b` |
| ++ | Increment | `a++` or `++a` |
| -- | Decrement | `a--` or `--a` |

---

## 3. Simple Illustration

```text
Let a = 10 and b = 3

Addition       : a + b = 13
Subtraction    : a - b = 7
Multiplication : a * b = 30
Division       : a / b = 3      (integer division)
Remainder      : a % b = 1
```

This shows that each operator performs a different mathematical role.

---

## 4. Addition Operator (+)

The `+` operator adds two values.

### Example
```java
int total = 5 + 3;
System.out.println(total); // 8
```

### Uses
- total marks
- sum of prices
- counting values

### Important note
The `+` operator is also used for string concatenation.

```java
System.out.println("Total = " + total);
```

---

## 5. Subtraction Operator (-)

The `-` operator subtracts one value from another.

### Example
```java
int balance = 100 - 40;
System.out.println(balance); // 60
```

### Uses
- remaining stock
- balance after spending
- mark deductions

---

## 6. Multiplication Operator (*)

The `*` operator multiplies values.

### Example
```java
int area = 5 * 4;
System.out.println(area); // 20
```

### Uses
- area calculations
- salary multiplication
- repeated scaling

---

## 7. Division Operator (/)

The `/` operator divides one number by another.

### Example
```java
int answer = 10 / 2;
System.out.println(answer); // 5
```

### Important concept: Integer division
If both numbers are integers, Java removes the decimal part.

```java
int result = 15 / 4;
System.out.println(result); // 3
```

Even though the exact answer is $3.75$, Java stores only `3` because both values are integers.

### To get a decimal answer
Use `double` or type casting:

```java
double result = (double) 15 / 4;
System.out.println(result); // 3.75
```

---

## 8. Modulus Operator (%)

The `%` operator gives the **remainder** after division.

### Example
```java
int remainder = 15 % 4;
System.out.println(remainder); // 3
```

### Real-life uses
- checking even or odd numbers
- distributing items into groups
- cycling through positions
- clock-like logic

### Even and odd check
```java
if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

---

## 9. Increment Operator (++)

The `++` operator increases a variable by 1.

### Example
```java
int x = 5;
x++;
System.out.println(x); // 6
```

There are two forms:

### Post-increment
```java
x++
```
Use the current value first, then increase it.

### Pre-increment
```java
++x
```
Increase first, then use the new value.

### Illustration
```text
x = 5

x++  -> returns 5, then x becomes 6
++x  -> x becomes 6 first, then returns 6
```

---

## 10. Decrement Operator (--)

The `--` operator decreases a variable by 1.

### Example
```java
int y = 8;
y--;
System.out.println(y); // 7
```

It also has:

- post-decrement: `y--`
- pre-decrement: `--y`

---

## 11. Unary Plus and Unary Minus

These are single-operand arithmetic operations.

```java
int a = 10;
System.out.println(+a); // 10
System.out.println(-a); // -10
```

### Meaning
- unary plus keeps the number positive
- unary minus changes its sign

---

## 12. Compound Assignment with Arithmetic

Java allows short forms of arithmetic updates.

| Shortcut | Meaning |
|----------|---------|
| `a += 5` | `a = a + 5` |
| `a -= 2` | `a = a - 2` |
| `a *= 3` | `a = a * 3` |
| `a /= 4` | `a = a / 4` |
| `a %= 2` | `a = a % 2` |

### Example
```java
int score = 10;
score += 5;
System.out.println(score); // 15
```

These forms make code shorter and cleaner.

---

## 13. Operator Precedence

Not all operations happen left to right equally.
Java follows precedence rules.

### Basic order

```text
1. Parentheses
2. Increment / decrement
3. Multiplication, division, modulus
4. Addition, subtraction
```

### Example
```java
int result = 10 + 5 * 2;
System.out.println(result); // 20
```

Why? Because multiplication happens before addition.

### With parentheses
```java
int result = (10 + 5) * 2;
System.out.println(result); // 30
```

### Best practice
Use parentheses whenever you want your intention to be obvious.

---

## 14. Illustration of Precedence

```text
10 + 5 * 2
= 10 + 10
= 20

(10 + 5) * 2
= 15 * 2
= 30
```

This is why parentheses matter.

---

## 15. Type Promotion in Arithmetic

When Java performs arithmetic using different numeric types, it often promotes smaller types to a larger type.

### Example
```java
byte a = 10;
byte b = 20;
int result = a + b;
```

Even though `a` and `b` are bytes, the result becomes an `int`.

### Why?
Java promotes smaller integer types during arithmetic to prevent unexpected loss of information.

---

## 16. Common Mistakes

### Mistake 1: expecting decimal output from integer division
```java
System.out.println(5 / 2); // 2, not 2.5
```

### Mistake 2: forgetting operator precedence
```java
int value = 10 + 2 * 3; // 16, not 36
```

### Mistake 3: confusing remainder with division result
`/` gives the quotient, `%` gives the remainder.

### Mistake 4: using `++` in a confusing way inside long expressions
Keep increment and decrement usage simple for readability.

---

## 17. Examples from This Module

This module includes practical Java examples for:

- basic arithmetic operations
- exact vs integer division
- pre/post increment and decrement
- modulus for real-life use cases
- operator precedence and parentheses

These examples are designed for practice and interview preparation.

---

## 18. Real-World Uses of Arithmetic Operators

### In banking
- deposit and withdrawal totals
- interest calculations

### In education systems
- calculate total marks
- find averages
- compute pass/fail logic

### In shopping systems
- total bill amount
- discount calculation
- item quantity multiplication

### In games
- score increase
- life reduction
- bonus calculations

---

## 19. Interview Questions and Answers

### Question 1
What are arithmetic operators in Java?

**Answer:** They are operators used to perform mathematical operations such as addition, subtraction, multiplication, division, and remainder calculations.

### Question 2
What is the difference between `/` and `%`?

**Answer:** `/` gives the division result, while `%` gives the remainder after division.

### Question 3
What is integer division in Java?

**Answer:** When both operands are integers, Java removes the decimal part from the result.

### Question 4
What is the output of `15 / 4` in Java using int values?

**Answer:** `3`.

### Question 5
How can you get `3.75` from `15 / 4`?

**Answer:** By converting at least one operand to `double`, such as `(double) 15 / 4`.

### Question 6
What does the modulus operator do?

**Answer:** It returns the remainder after division.

### Question 7
What is the difference between `x++` and `++x`?

**Answer:** `x++` uses the value first and then increases it, while `++x` increases the value first and then uses it.

### Question 8
Why are parentheses important in arithmetic expressions?

**Answer:** They control the order of evaluation and make expressions easier to understand.

### Question 9
What is the output of `10 + 5 * 2`?

**Answer:** `20`, because multiplication happens before addition.

### Question 10
What is the output of `(10 + 5) * 2`?

**Answer:** `30`, because the parentheses force addition first.

### Question 11
Can arithmetic operators be used with different numeric types?

**Answer:** Yes. Java performs type promotion automatically in many mixed-type expressions.

### Question 12
What is a good use of `%` in programming?

**Answer:** Checking whether a number is even or odd.

---

## 20. Quick Revision Summary

```text
+   -> add
-   -> subtract
*   -> multiply
/   -> divide
%   -> remainder
++  -> increase by 1
--  -> decrease by 1
```

---

## 21. Final Conclusion

Arithmetic operators are a core part of Java programming.
They help programs perform calculations, update values, and solve real-world problems.

If one key idea should be remembered, it is this:

> Arithmetic operators are simple symbols, but they power most of the calculations in software.

Mastering them early makes later Java topics much easier.
