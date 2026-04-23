# Java Strings - Complete Theory Notes

## 1. Introduction

Strings in Java are one of the most commonly used parts of programming.
A string represents a sequence of characters such as names, sentences, messages, passwords, and many other types of textual data.

In Java, strings are not primitive types. They are objects of the `String` class.

---

## 2. What Is a String?

A string is a collection of characters enclosed in double quotes.

### Example
```java
String name = "Akash";
```

This stores the text `Akash` as a String object.

### Important note
Unlike primitive values, a string is an object in Java.

---

## 3. Why Strings Are Important

Strings are used almost everywhere in Java programs:

- user names
- email messages
- file names
- search text
- web content
- validation and input processing

Because text handling is such a common task, Java provides many powerful string features.

---

## 4. String Creation in Java

There are two main ways to create strings.

### A. Using string literals
```java
String s1 = "Java";
```

### B. Using the `new` keyword
```java
String s2 = new String("Java");
```

These may look similar, but their memory behavior is different.

---

## 5. String Pool

Java uses a special memory area called the **String Pool** to store string literals efficiently.

If the same literal already exists in the pool, Java reuses the existing object instead of creating a new one.

### Example
```java
String a = "Java";
String b = "Java";
```

Here, both `a` and `b` point to the same pooled object.

### Benefit
This saves memory and improves performance.

---

## 6. Memory Allocation of Strings

### With literal
```java
String s1 = "Hello";
```
The string is placed in the String Pool if not already present.

### With new
```java
String s2 = new String("Hello");
```
This creates a new object in heap memory, even if the same literal already exists in the pool.

### Illustration
```text
String Pool:  "Hello"
Heap:         new String("Hello")
```

This is why reference comparisons can differ.

---

## 7. The intern() Method

The `intern()` method returns the pooled version of a string.

### Example
```java
String s1 = new String("Java");
String s2 = s1.intern();
```

After `intern()`, `s2` refers to the pooled string object.

### Why it matters
It helps when you want to reuse the canonical string from the pool.

---

## 8. String Immutability

One of the most important facts about Java strings is that they are **immutable**.

### Meaning
Once a String object is created, its content cannot be changed.

### Example
```java
String text = "Hello";
text.concat(" World");
```

The original `text` string is not changed.
Instead, a new String object is created.

### Why immutability is useful
- security
- thread safety
- string pool efficiency
- reliable hashing behavior

---

## 9. Comparing Strings

This is a very important topic in Java.

### `==` operator
Compares object references, not actual content.

### `equals()` method
Compares actual string content.

### Example
```java
String a = "Java";
String b = new String("Java");

System.out.println(a == b);        // false
System.out.println(a.equals(b));   // true
```

### Rule
Use `equals()` when checking whether two strings contain the same text.

---

## 10. Common String Methods

Java provides many built-in methods for string handling.

| Method | Purpose |
|-------|---------|
| `length()` | returns total characters |
| `charAt(index)` | returns character at position |
| `substring()` | extracts part of the string |
| `toUpperCase()` | converts to uppercase |
| `toLowerCase()` | converts to lowercase |
| `trim()` | removes leading and trailing spaces |
| `replace()` | replaces text |
| `contains()` | checks whether text exists |
| `equals()` | compares content |
| `equalsIgnoreCase()` | compares content ignoring case |

These methods make strings very powerful and flexible.

---

## 11. StringBuilder

`StringBuilder` is used when you need to modify strings many times efficiently.

### Why it exists
Because String is immutable, repeated modifications create many extra objects.
`StringBuilder` avoids that problem by being mutable.

### Example
```java
StringBuilder builder = new StringBuilder("Java");
builder.append(" Builder");
```

### Best use case
Use `StringBuilder` when doing many string changes in a single-thread environment.

---

## 12. StringBuffer

`StringBuffer` is similar to `StringBuilder`, but it is synchronized and thread-safe.

### Difference from StringBuilder
- `StringBuilder` -> faster, not synchronized
- `StringBuffer` -> slower, synchronized, thread-safe

### Best use case
Use `StringBuffer` when thread safety is needed.

---

## 13. String vs StringBuilder vs StringBuffer

| Feature | String | StringBuilder | StringBuffer |
|--------|--------|---------------|--------------|
| Mutable | No | Yes | Yes |
| Thread-safe | Yes by immutability | No | Yes |
| Performance for repeated changes | slower | fast | moderate |
| Best use | fixed text | single-thread modifications | multi-thread modifications |

---

## 14. Real-World Importance of Strings

### In login systems
Usernames and passwords are handled as strings.

### In search engines
Search terms are strings.

### In web applications
Requests, JSON values, and response messages often use strings.

### In file handling
Paths and filenames are stored as strings.

Strings are everywhere in software development.

---

## 15. Common Mistakes Students Make

### Mistake 1
Using `==` instead of `equals()` for content comparison.

### Mistake 2
Thinking `concat()` changes the original string.
It does not, because String is immutable.

### Mistake 3
Not understanding the difference between string literals and `new String()`.

### Mistake 4
Using `String` repeatedly in loops when `StringBuilder` would be better.

### Mistake 5
Confusing StringBuilder and StringBuffer.

---

## 16. Examples Included in This Module

This module provides practical programs for:

- basic string handling
- string pool and intern behavior
- string immutability
- common string methods
- string comparison
- StringBuilder and StringBuffer usage

These examples help connect string theory with real Java programming.

---

## 17. Visual Memory Trick

```text
String        -> immutable text object
StringBuilder -> mutable and fast
StringBuffer  -> mutable and thread-safe
```

Remember it like this:

- String = fixed
- Builder = fast changes
- Buffer = safe shared changes

---

## 18. Interview Questions and Answers

### Question 1
What is a String in Java?

**Answer:** A String is an object that represents a sequence of characters.

### Question 2
Are strings mutable in Java?

**Answer:** No. Strings are immutable.

### Question 3
What is the String Pool?

**Answer:** It is a special memory area where Java stores string literals for reuse.

### Question 4
What is the difference between `==` and `equals()` for strings?

**Answer:** `==` compares references, while `equals()` compares content.

### Question 5
What does `intern()` do?

**Answer:** It returns the pooled version of a string.

### Question 6
Why are strings immutable?

**Answer:** For security, thread safety, and efficient memory sharing in the string pool.

### Question 7
When should you use `StringBuilder`?

**Answer:** When you need to modify strings many times efficiently in a single-thread environment.

### Question 8
When should you use `StringBuffer`?

**Answer:** When you need mutable strings with thread safety.

### Question 9
What is the difference between StringBuilder and StringBuffer?

**Answer:** StringBuilder is faster but not synchronized, while StringBuffer is synchronized and thread-safe.

### Question 10
Can two string literals point to the same object?

**Answer:** Yes, if they contain the same text in the string pool.

### Question 11
Why is `new String("Java")` different from `"Java"`?

**Answer:** The first creates a new heap object, while the second uses the pooled literal.

### Question 12
Why are strings important in interviews?

**Answer:** Because they test understanding of memory, immutability, comparison, and common Java APIs.

---

## 19. Quick Revision Summary

```text
String         -> immutable text object
String Pool    -> shared literal memory area
intern()       -> returns pooled reference
equals()       -> compares content
==             -> compares references
StringBuilder  -> mutable and fast
StringBuffer   -> mutable and thread-safe
```

---

## 20. Final Conclusion

Strings are one of the most important and most frequently used parts of Java programming.
Understanding string memory, immutability, comparison, and mutable alternatives is essential for writing strong Java code.

If you remember one key idea, let it be this:

> In Java, String is immutable, the pool saves memory, and StringBuilder/StringBuffer are used when efficient modification is needed.

Mastering strings is essential for Java fundamentals, interviews, and real-world development.
