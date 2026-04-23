# Exceptions, Errors, and Exception Handling in Java - Complete Theory Notes

## 1. Introduction

In Java, abnormal situations during program execution are represented by **exceptions** and **errors**.
These help us understand and manage unexpected problems in a structured way.

Exception handling is one of the most important parts of Java because real programs must deal with invalid input, missing files, network issues, and many other runtime problems.

---

## 2. What Is an Exception?

An **exception** is a problem that occurs during program execution and interrupts the normal flow of the program.

### Examples
- dividing by zero
- accessing an invalid array index
- reading a missing file
- converting invalid text to a number

Exceptions can often be handled by the programmer.

---

## 3. What Is an Error?

An **error** is a serious problem that usually comes from the system or JVM rather than normal application logic.

### Examples
- `OutOfMemoryError`
- `StackOverflowError`
- `VirtualMachineError`

Errors are usually not meant to be handled in normal application code.

---

## 4. Exception vs Error

| Feature | Exception | Error |
|--------|-----------|-------|
| Nature | application/runtime issue | serious system/JVM issue |
| Can be handled? | usually yes | usually no |
| Example | `ArithmeticException` | `OutOfMemoryError` |
| Programmer focus | recover or report | avoid root cause if possible |

---

## 5. Types of Exceptions

Java exceptions are mainly of two types:

### Checked Exceptions
These are checked at compile time.
The programmer must handle or declare them.

Examples:
- `IOException`
- `SQLException`

### Unchecked Exceptions
These happen at runtime.
They are subclasses of `RuntimeException`.

Examples:
- `NullPointerException`
- `ArithmeticException`
- `ArrayIndexOutOfBoundsException`

---

## 6. Exception Handling Keywords

### `try`
Contains code that may produce an exception.

### `catch`
Handles the exception.

### `finally`
Runs whether exception happens or not.
Often used for cleanup work.

### `throw`
Used to manually create and throw an exception.

### `throws`
Used in the method declaration to indicate a method may throw an exception.

---

## 7. Try-Catch Flow Illustration

```text
try block -> exception occurs -> catch block handles it -> program continues
```

If no exception occurs, the catch block is skipped.
If a finally block exists, it still runs.

---

## 8. Custom Exceptions

Java allows developers to create their own exception classes.
This is useful when business rules require meaningful error messages.

### Example uses
- invalid withdrawal amount
- low account balance
- invalid user role
- age restriction failure

Custom exceptions improve readability and domain clarity.

---

## 9. Why Exception Handling Is Important

Without exception handling, programs may terminate suddenly.
With proper handling, programs can:

- show user-friendly messages
- recover safely
- log problems
- continue execution where possible
- protect data integrity

---

## 10. Real-World Uses

Exception handling is used in:

- banking systems
- file processing
- web applications
- login systems
- database operations
- payment processing

It is essential in professional software development.

---

## 11. Common Mistakes Students Make

### Mistake 1
Confusing exceptions with errors.

### Mistake 2
Using very broad `catch (Exception e)` everywhere without reason.

### Mistake 3
Ignoring exception messages.

### Mistake 4
Misunderstanding the difference between `throw` and `throws`.

### Mistake 5
Thinking `finally` runs only when an exception happens.
It runs in normal cases too.

---

## 12. Examples Included in This Module

This module provides practical programs for:

- try-catch handling
- finally block behavior
- throw and throws usage
- custom exception creation
- multiple catch blocks

These examples make error-handling concepts clear and practical.

---

## 13. Interview Questions and Answers

### Question 1
What is an exception in Java?

**Answer:** An exception is a runtime problem that interrupts the normal flow of a program.

### Question 2
What is an error in Java?

**Answer:** An error is a serious problem usually related to the JVM or system environment.

### Question 3
What is the difference between checked and unchecked exceptions?

**Answer:** Checked exceptions must be handled or declared at compile time, while unchecked exceptions occur at runtime.

### Question 4
What is the purpose of `try` and `catch`?

**Answer:** `try` contains risky code, and `catch` handles exceptions if they occur.

### Question 5
What is the purpose of `finally`?

**Answer:** It runs whether an exception occurs or not, usually for cleanup.

### Question 6
What is the difference between `throw` and `throws`?

**Answer:** `throw` actually throws an exception, while `throws` declares that a method may throw one.

### Question 7
Can we create custom exceptions in Java?

**Answer:** Yes.

### Question 8
Why should exception handling be used?

**Answer:** To make programs more stable, user-friendly, and safe during unexpected situations.

### Question 9
Give one example of an unchecked exception.

**Answer:** `NullPointerException`.

### Question 10
Give one example of an error.

**Answer:** `OutOfMemoryError`.

### Question 11
Why is exception handling important in interviews?

**Answer:** Because it tests understanding of runtime behavior, robustness, and Java best practices.

### Question 12
What happens if an exception is not handled?

**Answer:** The program may terminate abnormally.

---

## 14. Quick Revision Summary

```text
Exception  -> handleable runtime problem
Error      -> serious JVM/system problem
try        -> risky code block
catch      -> handles exception
finally    -> always runs
throw      -> manually throw exception
throws     -> declare possible exception
```

---

## 15. Final Conclusion

Exceptions and errors are essential concepts in Java because real applications must handle problems safely and clearly.
Understanding how to use `try`, `catch`, `finally`, `throw`, and `throws` is a key part of writing robust Java programs.

If you remember one key idea, let it be this:

> Exception handling allows Java programs to respond to problems gracefully instead of failing suddenly.

Mastering this topic improves both coding quality and interview readiness.
