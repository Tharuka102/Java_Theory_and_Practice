# Functional Interfaces, Lambda Expressions, and Stream API in Java - Complete Theory Notes

## 1. Introduction

Java 8 introduced several powerful features that changed the way Java programs are written.
Among the most important are:

- functional interfaces
- lambda expressions
- Stream API

These features make code shorter, cleaner, and more expressive.
They also support a more functional programming style in Java.

---

## 2. Functional Interface

A functional interface is an interface that contains exactly **one abstract method**.
It can still have default and static methods, but only one abstract method is allowed.

### Example
```java
@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}
```

### Why important?
Functional interfaces are the base for lambda expressions and method references.

Examples from Java library:
- `Runnable`
- `Callable`
- `Comparator`
- `Predicate`
- `Consumer`
- `Supplier`

---

## 3. Lambda Expression

A lambda expression is a short way to provide implementation for a functional interface.

### Traditional style
Before Java 8, developers often used anonymous classes.

### Modern style
With lambda, the same logic becomes shorter and easier to read.

### Example
```java
Calculator add = (a, b) -> a + b;
```

This means the behavior is passed like data.

---

## 4. Built-in Functional Interfaces

Java provides many ready-made functional interfaces in `java.util.function`.

### `Predicate<T>`
Tests a condition and returns `true` or `false`.

### `Consumer<T>`
Accepts data and performs an operation without returning anything.

### `Supplier<T>`
Supplies or returns a value without taking input.

### `Function<T, R>`
Takes one input and returns one output.

These are heavily used in stream operations.

---

## 5. Stream API

The Stream API is used to process collections of data in a declarative and readable way.
It does not store data itself. Instead, it performs operations on data from collections or arrays.

### Common stream operations
- `filter()`
- `map()`
- `sorted()`
- `collect()`
- `reduce()`
- `forEach()`

---

## 6. How Stream Processing Works

A stream usually works in three stages:

1. **Source** – data comes from a list, set, or array
2. **Intermediate operations** – such as `filter()` or `map()`
3. **Terminal operation** – such as `collect()` or `forEach()`

### Illustration
```text
Collection -> stream() -> filter/map/sorted -> collect/forEach
```

---

## 7. Method References

A method reference is a shorter way to refer to an existing method.
It is often used when a lambda only calls one method.

### Example
```java
words.forEach(System.out::println);
```

This is shorter than writing a full lambda expression.

---

## 8. Reduce Operation

The `reduce()` method combines stream elements into a single result.

### Examples
- sum of numbers
- multiplication of values
- combining strings

### Example
```java
int total = values.stream().reduce(0, Integer::sum);
```

---

## 9. Why These Features Matter

They help developers write:

- shorter code
- cleaner collection processing
- reusable behavior
- more expressive business logic

These are especially important in modern Java applications and interviews.

---

## 10. Real-World Uses

These features are used in:

- filtering database results
- processing user lists
- transforming data
- validation logic
- event handling
- backend business rules

---

## 11. Common Mistakes Students Make

### Mistake 1
Thinking every interface is a functional interface.

### Mistake 2
Forgetting that a functional interface allows only one abstract method.

### Mistake 3
Confusing `map()` and `filter()`.

### Mistake 4
Thinking streams change the original collection automatically.

### Mistake 5
Using streams where a simple loop would be clearer for beginners.

---

## 12. Examples Included in This Module

This module provides practical programs for:

- custom functional interface basics
- lambda expressions
- built-in functional interfaces
- Stream API filtering and mapping
- method references and reduce operation

These examples help make modern Java coding easier to understand.

---

## 13. Interview Questions and Answers

### Question 1
What is a functional interface in Java?

**Answer:** An interface with exactly one abstract method.

### Question 2
What is a lambda expression?

**Answer:** A short way to implement a functional interface.

### Question 3
Why was lambda introduced in Java?

**Answer:** To make code shorter, cleaner, and more expressive, especially for functional-style programming.

### Question 4
What package contains common built-in functional interfaces?

**Answer:** `java.util.function`.

### Question 5
What does `Predicate` do?

**Answer:** It tests a condition and returns a boolean value.

### Question 6
What does `Consumer` do?

**Answer:** It accepts a value and performs an action without returning a result.

### Question 7
What does `Supplier` do?

**Answer:** It returns a value without taking input.

### Question 8
What is the Stream API used for?

**Answer:** It is used to process collections in a clean and declarative way.

### Question 9
What is the difference between `filter()` and `map()`?

**Answer:** `filter()` selects elements, while `map()` transforms elements.

### Question 10
What does `reduce()` do?

**Answer:** It combines stream elements into a single result.

### Question 11
What is a method reference?

**Answer:** A shorter form of lambda that refers to an existing method.

### Question 12
Why are these topics important in interviews?

**Answer:** Because they are core parts of modern Java 8+ programming and are widely used in real-world applications.

---

## 14. Quick Revision Summary

```text
Functional Interface -> one abstract method
Lambda Expression    -> short implementation syntax
Predicate            -> true/false test
Consumer             -> accepts and acts
Supplier             -> returns value
Stream API           -> process collections cleanly
map()                -> transform
filter()             -> select
reduce()             -> combine
```

---

## 15. Final Conclusion

Functional interfaces, lambda expressions, and Stream API are some of the most important features in modern Java.
They help write compact, expressive, and maintainable code.

If you remember one key idea, let it be this:

> Functional interfaces define the contract, lambda expressions provide the behavior, and Stream API processes data elegantly.

Mastering these concepts is essential for modern Java development and interviews.
