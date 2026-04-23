# Java Arrays - Complete Theory Notes

## 1. Introduction

Arrays in Java are used to store **multiple values of the same type** in a single variable.
Instead of creating many separate variables, an array helps organize related data together.

For example, instead of writing:

```java
int mark1 = 75;
int mark2 = 80;
int mark3 = 90;
```

we can write:

```java
int[] marks = {75, 80, 90};
```

This is cleaner, easier to manage, and much more powerful.

---

## 2. What Is an Array?

An array is a data structure that stores a fixed number of values of the same data type.
Each value is stored at a numbered position called an **index**.

### Key points
- arrays store multiple similar values
- all values must be of the same type
- array size is fixed after creation
- indexing starts from `0`

---

## 3. Why Arrays Are Important

Arrays help us:

- store collections of related data
- process many values using loops
- compute totals and averages
- search and sort data
- represent tables and matrices

Arrays are a foundation for many advanced data structures in programming.

---

## 4. Array Illustration

```text
int[] numbers = {10, 20, 30, 40, 50}

Index:    0    1    2    3    4
Value:   10   20   30   40   50
```

### Important idea
If you want the first element, you use index `0`, not `1`.

---

## 5. Declaring and Creating Arrays

### Method 1: Declare and initialize together
```java
int[] numbers = {10, 20, 30, 40, 50};
```

### Method 2: Create first, assign later
```java
int[] numbers = new int[5];
numbers[0] = 10;
numbers[1] = 20;
```

### Syntax meaning
- `int[]` means an array of integers
- `new int[5]` creates space for 5 integers

---

## 6. Accessing Array Elements

You access values by index.

### Example
```java
int[] numbers = {10, 20, 30};
System.out.println(numbers[0]); // 10
System.out.println(numbers[2]); // 30
```

### Illustration
```text
numbers[0] -> first element
numbers[1] -> second element
numbers[2] -> third element
```

---

## 7. Updating Array Elements

Array values can be changed by assigning a new value to an index.

### Example
```java
int[] marks = {75, 80, 90};
marks[1] = 85;
```

Now the array becomes:

```text
[75, 85, 90]
```

---

## 8. Array Length

Java provides the `length` property to know how many elements are in an array.

### Example
```java
int[] numbers = {10, 20, 30, 40};
System.out.println(numbers.length); // 4
```

### Why this is useful
It helps loops run through the full array safely.

---

## 9. Traversing Arrays

Traversing means visiting each element one by one.
This is usually done with loops.

### Using a normal for loop
```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### Using an enhanced for-each loop
```java
for (int num : numbers) {
    System.out.println(num);
}
```

### Difference
- normal `for` loop gives access to the index
- `for-each` loop is simpler when you only need the values

---

## 10. Default Values in Arrays

When an array is created using `new`, Java fills it with default values.

| Type | Default Value |
|------|---------------|
| int | 0 |
| double | 0.0 |
| boolean | false |
| char | '\u0000' |
| String | null |

This happens automatically for array elements.

---

## 11. Common Errors with Arrays

### A. ArrayIndexOutOfBoundsException
This happens when you try to access an invalid index.

### Example
```java
int[] arr = {1, 2, 3};
System.out.println(arr[3]);
```

This is invalid because valid indexes are only `0`, `1`, and `2`.

### B. Forgetting that indexing starts at 0
This is one of the most common beginner mistakes.

---

## 12. Searching in an Array

A common task is checking whether an element exists in an array.
This can be done using a loop.

### Example
```java
int[] values = {12, 25, 37, 49};
int target = 37;
```

Then compare each element until the value is found.

This is called **linear search**.

---

## 13. Summing and Averaging Array Values

Arrays are often used to calculate totals and averages.

### Example
```java
int[] marks = {75, 80, 90};
int sum = 0;

for (int mark : marks) {
    sum += mark;
}

double average = (double) sum / marks.length;
```

This is very common in real programs.

---

## 14. Two-Dimensional Arrays

A 2D array is like a table with rows and columns.

### Example
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### Illustration
```text
1  2  3
4  5  6
7  8  9
```

### Use cases
- marks tables
- game boards
- seating plans
- matrix calculations

---

## 15. Arrays vs Variables

| Separate Variables | Array |
|--------------------|-------|
| `mark1`, `mark2`, `mark3` | `int[] marks` |
| hard to manage | easier to manage |
| repetitive code | loop-friendly |
| poor scalability | better scalability |

Arrays are a smarter choice when working with many similar values.

---

## 16. Real-World Uses of Arrays

### In schools
- student marks
- attendance records
- exam scores

### In stores
- item prices
- stock quantities
- product IDs

### In games
- board positions
- player scores
- map coordinates

### In science and engineering
- measurements
- data samples
- matrices and tables

---

## 17. Examples Included in This Module

This module provides practical programs for:

- array creation and access
- traversal using loops
- updating elements
- summing and averaging values
- searching inside arrays
- working with 2D arrays

These examples are helpful for both understanding and interview preparation.

---

## 18. Common Mistakes Students Make

### Mistake 1
Using an index that is too large or negative.

### Mistake 2
Forgetting that array indexing starts from `0`.

### Mistake 3
Trying to store mixed data types in one primitive array.

### Mistake 4
Assuming arrays can grow automatically.
In Java, normal arrays have fixed size.

### Mistake 5
Using a `for-each` loop when the index is actually needed.

---

## 19. Interview Questions and Answers

### Question 1
What is an array in Java?

**Answer:** An array is a structure that stores multiple values of the same type in one variable.

### Question 2
Does array indexing in Java start at 0 or 1?

**Answer:** It starts at `0`.

### Question 3
Can an array store different data types together?

**Answer:** A normal Java array stores elements of the same type.

### Question 4
What does the `length` property do?

**Answer:** It returns the number of elements in the array.

### Question 5
What is the last valid index of an array?

**Answer:** `length - 1`.

### Question 6
What exception happens when an invalid index is used?

**Answer:** `ArrayIndexOutOfBoundsException`.

### Question 7
What is the difference between a normal for loop and a for-each loop?

**Answer:** A normal for loop gives access to indexes, while a for-each loop directly gives values.

### Question 8
What is a two-dimensional array?

**Answer:** It is an array of arrays, often used like a table with rows and columns.

### Question 9
Can the size of a normal array change after creation?

**Answer:** No. Its size is fixed.

### Question 10
Why are arrays useful in programming?

**Answer:** They organize related data and make processing multiple values much easier.

### Question 11
What is linear search?

**Answer:** It is a method of checking each array element one by one until the target is found.

### Question 12
Where are arrays commonly used?

**Answer:** In marks systems, price lists, game boards, tables, and many data-processing tasks.

---

## 20. Quick Revision Summary

```text
Array        -> stores many values of same type
Index        -> position of an element
length       -> total number of elements
for loop     -> useful when index is needed
for-each     -> useful when only values are needed
2D array     -> rows and columns
```

---

## 21. Final Conclusion

Arrays are one of the most important foundations in Java programming.
They help organize and process collections of related data efficiently.

If you remember one key idea, let it be this:

> Arrays allow one variable name to manage many values in a structured and powerful way.

Mastering arrays will make loops, searching, sorting, and advanced data structures much easier to understand.
