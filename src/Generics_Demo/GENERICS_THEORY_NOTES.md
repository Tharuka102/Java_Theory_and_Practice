# Generics in Java - Complete Theory Notes

## 1. Introduction

Generics in Java allow classes, interfaces, and methods to work with different data types while keeping type safety.
They were introduced to make collections and reusable code safer and cleaner.

Instead of writing separate logic for each data type, generics let us write one flexible version.

---

## 2. Why Generics Are Important

Before generics, Java collections often stored `Object` values.
This created problems such as unsafe type casting and runtime errors.

Generics solve this by:

- improving type safety
- reducing explicit casting
- making code reusable
- catching errors at compile time
- improving readability

---

## 3. Generic Class

A generic class uses a type parameter such as `T`.
This allows the same class to work with many types.

### Example
```java
class Box<T> {
    private T value;
}
```

Here, `T` is a placeholder for a real type like `String`, `Integer`, or `Double`.

---

## 4. Generic Method

A generic method introduces its own type parameter.
It can operate on different data types without depending on the class type.

### Example
```java
public static <T> void printArray(T[] array)
```

This method can print arrays of many different types.

---

## 5. Generic Interface

An interface can also be generic.
This makes contracts more flexible and reusable.

### Example
```java
interface Processor<T> {
    void process(T item);
}
```

This is useful in services, repositories, handlers, and processing pipelines.

---

## 6. Wildcards in Generics

The wildcard symbol `?` means “unknown type”.
It is used when the exact type is not important.

### Example
```java
List<?> list
```

This means the method can accept a list of any type.

Wildcards improve flexibility when reading data.

---

## 7. Type Safety

One of the biggest advantages of generics is compile-time type safety.
If a collection is declared as `List<String>`, only strings can be stored in it.

This avoids many runtime errors such as `ClassCastException`.

---

## 8. Common Type Parameter Names

Some common names used in generics are:

- `T` = Type
- `E` = Element
- `K` = Key
- `V` = Value
- `N` = Number

These are naming conventions, not strict rules.

---

## 9. Real-World Uses of Generics

Generics are widely used in:

- collections like `List<String>` and `Map<Integer, String>`
- repository patterns
- service layers
- utility methods
- framework APIs

They are one of the most important features in modern Java programming.

---

## 10. Simple Illustration

```text
Generic class: Box<T>
|
|-- Box<String>
|-- Box<Integer>
|-- Box<Double>
```

This shows how the same class design can work with different data types.

---

## 11. Common Mistakes Students Make

### Mistake 1
Thinking generics work only with collections.

### Mistake 2
Using raw types instead of generic types.

### Mistake 3
Confusing generic classes with generic methods.

### Mistake 4
Not understanding what wildcard `?` means.

### Mistake 5
Forgetting that generics improve compile-time safety.

---

## 12. Examples Included in This Module

This module provides practical programs for:

- generic class creation
- generic methods
- generic interfaces
- wildcard usage
- type-safe collections

These examples help connect generic theory to real Java development.

---

## 13. Interview Questions and Answers

### Question 1
What are generics in Java?

**Answer:** Generics allow classes, interfaces, and methods to work with different data types while keeping type safety.

### Question 2
Why were generics introduced?

**Answer:** To improve type safety, reduce casting, and make reusable code cleaner.

### Question 3
What does `T` mean in generics?

**Answer:** It is a placeholder representing a type.

### Question 4
Can methods be generic in Java?

**Answer:** Yes.

### Question 5
Can interfaces be generic in Java?

**Answer:** Yes.

### Question 6
What is a wildcard in generics?

**Answer:** The `?` symbol representing an unknown type.

### Question 7
What is a raw type?

**Answer:** Using a generic class without specifying a type parameter, such as `List` instead of `List<String>`.

### Question 8
What is one major advantage of generics?

**Answer:** Compile-time type safety.

### Question 9
Do generics remove the need for explicit casting in many cases?

**Answer:** Yes.

### Question 10
Where are generics commonly used in Java?

**Answer:** In collections, utilities, framework APIs, repositories, and reusable service code.

### Question 11
Why are generics important in interviews?

**Answer:** Because they are a core Java concept related to collections, reusable code, and type safety.

### Question 12
What problem can generics help prevent?

**Answer:** Runtime type mismatch problems such as `ClassCastException`.

---

## 14. Quick Revision Summary

```text
Generics        -> reusable and type-safe code
Generic class   -> class with type parameter
Generic method  -> method with type parameter
Generic interface -> interface with flexible type
Wildcard ?      -> unknown type
Type safety     -> errors caught at compile time
```

---

## 15. Final Conclusion

Generics are one of the most useful features in Java because they allow flexible and reusable code without losing safety.
They make collections and APIs much cleaner and more reliable.

If you remember one key idea, let it be this:

> Generics let Java code stay flexible for many types while still catching mistakes early at compile time.

Mastering generics is essential for writing professional Java code and answering interview questions confidently.
