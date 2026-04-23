# Java Primitive Types - Complete Theory Notes

## 1. Introduction

Primitive data types in Java are the most basic building blocks of data storage.
They are used to store simple values directly, such as:

- whole numbers
- decimal numbers
- single characters
- true or false values

Java has **8 primitive types**, and each one has a fixed size and purpose.

---

## 2. What Is a Primitive Type?

A primitive type is a built-in type provided by Java itself.
It is **not an object**.
It stores the actual value directly in memory.

### Simple idea
If objects are like full containers with features, primitive types are the raw values inside them.

Examples:

- `10` is an integer value
- `3.14` is a decimal value
- `'A'` is a character
- `true` is a boolean value

---

## 3. The 8 Primitive Types in Java

Java divides primitive types into four groups:

### A. Integer types
- byte
- short
- int
- long

### B. Floating-point types
- float
- double

### C. Character type
- char

### D. Logical type
- boolean

---

## 4. Full Primitive Type Table

| Type | Size | Range / Meaning | Example |
|------|------|------------------|---------|
| byte | 1 byte | -128 to 127 | `byte x = 100;` |
| short | 2 bytes | -32,768 to 32,767 | `short x = 30000;` |
| int | 4 bytes | about $-2.1 \times 10^9$ to $2.1 \times 10^9$ | `int x = 1000000;` |
| long | 8 bytes | very large whole numbers | `long x = 10000000000L;` |
| float | 4 bytes | single-precision decimal | `float x = 3.14f;` |
| double | 8 bytes | double-precision decimal | `double x = 3.14159;` |
| char | 2 bytes | single Unicode character | `char x = 'A';` |
| boolean | JVM dependent | `true` or `false` | `boolean x = true;` |

---

## 5. Memory Illustration

```text
Primitive Types in Java

Numbers
├── Whole numbers
│   ├── byte   (smallest)
│   ├── short
│   ├── int    (most common)
│   └── long   (largest integer)
│
├── Decimal numbers
│   ├── float  (less precision)
│   └── double (more precision)
│
Other
├── char       (one character)
└── boolean    (true/false)
```

---

## 6. Integer Primitive Types

These store whole numbers without decimals.

### byte
- size: 1 byte
- range: $-128$ to $127$
- useful when memory is limited

```java
byte myByte = 100;
```

### short
- size: 2 bytes
- larger range than byte

```java
short myShort = 30000;
```

### int
- size: 4 bytes
- most commonly used integer type in Java

```java
int myInt = 1000000;
```

### long
- size: 8 bytes
- used for very large whole numbers
- must often end with `L`

```java
long myLong = 10000000000L;
```

### Best practice
Use:
- `int` for normal counting and arithmetic
- `long` when the number may become very large

---

## 7. Floating-Point Primitive Types

These store decimal values.

### float
- size: 4 bytes
- about 6 to 7 digits of precision
- literal usually ends with `f`

```java
float myFloat = 3.14f;
```

### double
- size: 8 bytes
- about 15 to 16 digits of precision
- preferred for most decimal calculations

```java
double myDouble = 3.141592653589793;
```

### Important difference
A double is more precise than a float.
That is why Java uses `double` as the default decimal type.

---

## 8. char Type

The `char` type stores a single character.

Examples:

```java
char grade = 'A';
char symbol = '#';
char digit = '7';
```

### Important note
A char stores a **single Unicode character**, not a word or sentence.

So this is valid:

```java
char letter = 'B';
```

But this is invalid:

```java
// char text = "Hello";
```

Because multiple characters belong in a String, not a char.

---

## 9. boolean Type

The `boolean` type stores only two possible values:

- `true`
- `false`

Example:

```java
boolean isJavaFun = true;
boolean isLoggedIn = false;
```

### Where it is used
Booleans are essential in:

- decision making
- loops
- condition checking
- comparisons

---

## 10. Examples from Your Demo Code

The project already shows these primitive types clearly.

### In the basic demo
The program demonstrates:

- byte with `100`
- short with `30000`
- int with `1000000`
- long with a large literal ending in `L`
- float with `3.14f`
- double with a more precise decimal
- char with `'A'`
- boolean with `true`

This gives a practical overview of all 8 primitive types.

### In the wrong-range example
The file also shows what happens when values exceed the allowed range.
This is useful for understanding compile-time errors and limits.

---

## 11. Range Errors and Overflow

Each primitive numeric type has a fixed limit.
If you try to assign a value outside the range, Java may show a compile-time error or produce overflow in calculations.

### Example
```java
byte myByte = 128;
```

This is invalid because the byte range is only from $-128$ to $127$.

### Overflow idea
If a number grows beyond the storage limit, it wraps around.

Example concept:

```text
byte max = 127
127 + 1 becomes -128
```

This happens because the number exceeds the available binary storage.

---

## 12. Precision in float and double

This is one of the most important real-world concepts.

### Key fact
Floating-point types do **not** store decimal values perfectly in many cases.
They store approximations using binary representation.

That is why expressions like this can surprise beginners:

```java
double x = 0.1 + 0.2;
System.out.println(x);
```

Expected:

```text
0.3
```

Actual:

```text
0.30000000000000004
```

### Why this happens
Some decimal fractions cannot be represented exactly in binary floating-point format.
So Java stores the nearest possible approximation.

---

## 13. float vs double Precision Illustration

```text
float   -> about 7 digits precision
double  -> about 15 digits precision
```

### Example idea
```java
float f = 123.456789f;      // rounded
double d = 123.456789123456789; // more accurate
```

So if you need more precision, `double` is usually better than `float`.

---

## 14. Why BigDecimal Is Sometimes Better

For money and exact decimal math, `float` and `double` are risky.
A better option is `BigDecimal`.

### Example
```java
BigDecimal a = new BigDecimal("0.1");
BigDecimal b = new BigDecimal("0.2");
BigDecimal result = a.add(b);
System.out.println(result); // 0.3
```

### Use BigDecimal when working with:
- currency
- financial systems
- tax calculations
- interest values
- exact decimal comparisons

### Rule
Use primitive floating-point types for speed and general scientific calculations.
Use `BigDecimal` for exact decimal correctness.

---

## 15. Type Conversion in Java

Primitive values can be converted from one type to another.
This is called **type casting**.

### A. Widening casting
Small type to larger type.
This is automatic and generally safe.

```java
int num = 100;
double value = num;
```

### B. Narrowing casting
Large type to smaller type.
This must be done manually and may lose data.

```java
double price = 9.99;
int rounded = (int) price;
```

After conversion, the decimal part is removed.

---

## 16. Widening Order

```text
byte -> short -> int -> long -> float -> double
                char -> int -> long -> float -> double
```

This shows the usual safe direction of conversion.

---

## 17. Default Values of Primitive Types in Fields

When primitive types are used as class-level fields, Java gives them default values.

| Type | Default Value |
|------|---------------|
| byte | 0 |
| short | 0 |
| int | 0 |
| long | 0L |
| float | 0.0f |
| double | 0.0d |
| char | '\u0000' |
| boolean | false |

### Important note
Local variables inside methods do **not** get automatic default values.
They must be initialized before use.

---

## 18. Primitive Types vs Wrapper Classes

Every primitive type has a wrapper class:

| Primitive | Wrapper |
|----------|---------|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

### Why wrappers exist
Wrapper classes are useful when:

- working with collections like ArrayList
- using utility methods
- converting between strings and numbers
- needing object behavior instead of raw values

---

## 19. Common Mistakes Students Make

### Mistake 1
Forgetting the suffix for long and float literals.

Examples:
- `10000000000L` for long
- `3.14f` for float

### Mistake 2
Using `==` to compare decimal values blindly.
Because of floating-point precision, exact equality may fail.

### Mistake 3
Thinking char is the same as String.
A char stores one character only.

### Mistake 4
Ignoring type range limits.
That leads to overflow or compile errors.

### Mistake 5
Using double for financial calculations that need exact values.
In such cases, `BigDecimal` is safer.

---

## 20. Best Practice Guidelines

- Use `int` for most whole numbers.
- Use `long` for very large counts.
- Use `double` for most decimal calculations.
- Use `float` only when memory or special APIs require it.
- Use `char` for a single character.
- Use `boolean` for true/false logic.
- Use `BigDecimal` when exact decimal precision matters.

---

## 21. Interview Questions and Answers

### Question 1
How many primitive types are there in Java?

**Answer:** There are 8 primitive types in Java.

### Question 2
Which primitive type is most commonly used for whole numbers?

**Answer:** `int`.

### Question 3
What is the difference between float and double?

**Answer:** `double` uses more memory and provides more precision than `float`.

### Question 4
Why does `0.1 + 0.2` not always equal exactly `0.3` in Java?

**Answer:** Because floating-point numbers are stored in binary approximation, not always as exact decimal values.

### Question 5
Which type should be used for true or false values?

**Answer:** `boolean`.

### Question 6
Can a char store multiple characters?

**Answer:** No. A char stores only one Unicode character.

### Question 7
What is the range of byte?

**Answer:** $-128$ to $127$.

### Question 8
Why is BigDecimal used in finance-related programs?

**Answer:** Because it provides more accurate decimal calculations than float and double.

### Question 9
What is narrowing type casting?

**Answer:** It is converting a larger type to a smaller type manually, which may lose data.

### Question 10
What happens when a number exceeds the storage range of its type?

**Answer:** It can cause overflow or an invalid assignment error depending on the situation.

### Question 11
What is the default decimal type in Java?

**Answer:** `double`.

### Question 12
What suffix is commonly used with long and float literals?

**Answer:** `L` for long and `f` for float.

---

## 22. Quick Revision Summary

```text
byte    -> small integer
short   -> medium integer
int     -> standard integer
long    -> very large integer
float   -> decimal, less precision
double  -> decimal, more precision
char    -> one character
boolean -> true or false
```

---

## 23. Final Conclusion

Primitive types are fundamental in Java because they store the simplest and most important forms of data.
They are fast, memory-efficient, and essential for programming logic.

If you remember the main idea, remember this:

> Choose the primitive type based on the kind of data, the required range, and the needed precision.

That is the key to using primitive types correctly in Java.
