# Java Object Class - Complete Theory Notes

## 1. Introduction

In Java, every class directly or indirectly inherits from the `Object` class.
This means the `Object` class is the root of the Java class hierarchy.

Because of this, every object in Java automatically gets some common methods such as:

- `toString()`
- `equals()`
- `hashCode()`
- `getClass()`
- `clone()`
- `wait()`
- `notify()`
- `notifyAll()`

The `Object` class is therefore one of the most fundamental parts of Java.

---

## 2. Why the Object Class Is Important

The Object class gives a common base to all Java objects.
This makes it possible for Java to treat all objects in a general and consistent way.

### Example ideas
- printing objects
- comparing objects
- checking runtime type
- using collections like HashMap and HashSet

Without the Object class, Java would be much less unified and less flexible.

---

## 3. Every Class Inherits from Object

Even if you do not explicitly write `extends Object`, Java assumes it automatically.

### Example
```java
class Student {
}
```

This is treated like:

```java
class Student extends Object {
}
```

That is why every object can use Object class methods.

---

## 4. The toString() Method

The `toString()` method returns a string representation of an object.

### Default behavior
If not overridden, it usually returns:

```text
ClassName@hashcode
```

### Why override it?
Because a meaningful custom version is much easier to read.

### Example
Instead of:
```text
Student@5a07e868
```

we can return:
```text
Student{id=101, name='Akash'}
```

---

## 5. The equals() Method

The `equals()` method is used to compare two objects.

### Default behavior
By default, it checks whether the two references point to the same object.

### Why override it?
Because sometimes we want to compare the actual content, not just memory reference.

### Example
Two books with the same title and author may be logically equal even if they are different objects in memory.

---

## 6. The hashCode() Method

The `hashCode()` method returns an integer value representing the object for hashing-based collections.

### Why it matters
It is very important in:

- HashMap
- HashSet
- Hashtable

### Rule
If two objects are equal according to `equals()`, they should usually return the same `hashCode()`.

This is one of the most common interview rules.

---

## 7. The equals() and hashCode() Relationship

This is extremely important.

### Main rule
```text
If a.equals(b) is true,
then a.hashCode() should be equal to b.hashCode()
```

If this rule is broken, hash-based collections may behave incorrectly.

---

## 8. The getClass() Method

The `getClass()` method returns runtime class information about an object.

### Example
```java
System.out.println(obj.getClass().getName());
```

This is useful when:

- debugging
- reflection
- checking actual runtime type

---

## 9. The clone() Method

The `clone()` method is used to create a copy of an object.

### Important note
Cloning in Java requires care and is not used as casually as beginners may expect.
A class usually needs to implement `Cloneable`.

### Shallow copy
The copied object has duplicated field values, but referenced inner objects may still be shared.

---

## 10. The finalize() Method

The `finalize()` method was once used for cleanup before garbage collection.
However, in modern Java it is deprecated and generally not recommended.

### Important modern rule
Avoid relying on `finalize()` in new code.

---

## 11. wait(), notify(), and notifyAll()

These methods are related to thread communication and synchronization.
They are inherited from Object because every object can act as a monitor lock in Java.

### Basic meanings
- `wait()` -> current thread waits
- `notify()` -> wakes one waiting thread
- `notifyAll()` -> wakes all waiting threads

These are advanced topics, but they are part of the Object class.

---

## 12. Commonly Overridden Object Methods

The most commonly overridden methods are:

- `toString()`
- `equals()`
- `hashCode()`

These are especially important in real-world Java classes and interviews.

---

## 13. Why Object Methods Matter in Real Projects

### toString()
Useful for logs, debugging, and readable output.

### equals() and hashCode()
Essential when comparing objects and using collections.

### getClass()
Useful for runtime inspection and framework behavior.

Without understanding these methods, Java programming remains incomplete.

---

## 14. Real-World Example

Imagine a user account object.

- `toString()` helps print user details clearly
- `equals()` checks whether two user records are logically the same
- `hashCode()` helps store the user correctly in hash-based collections
- `getClass()` reveals the actual runtime type

This shows why Object class methods are so practical.

---

## 15. Common Mistakes Students Make

### Mistake 1
Using `==` instead of `equals()` when logical comparison is needed.

### Mistake 2
Overriding `equals()` but forgetting to override `hashCode()`.

### Mistake 3
Not overriding `toString()` and then printing unclear object output.

### Mistake 4
Assuming `clone()` is always the best way to copy objects.

### Mistake 5
Using `finalize()` in modern code without knowing it is deprecated.

---

## 16. Visual Memory Trick

```text
Object class = common parent of all Java objects
```

Remember it like this:

- every object gets basic common behavior from Object
- some of those methods should often be customized

---

## 17. Examples Included in This Module

This module provides practical programs for:

- custom `toString()`
- `equals()` and `hashCode()`
- `getClass()`
- cloning basics
- real-world object behavior examples

These examples connect the Object class theory with actual Java programming practice.

---

## 18. Interview Questions and Answers

### Question 1
What is the Object class in Java?

**Answer:** It is the root class of the Java class hierarchy, and every class directly or indirectly inherits from it.

### Question 2
Why is the Object class important?

**Answer:** Because it provides common methods such as `toString()`, `equals()`, `hashCode()`, and `getClass()` to all objects.

### Question 3
What does `toString()` do?

**Answer:** It returns a string representation of the object.

### Question 4
Why do we override `toString()`?

**Answer:** To get more meaningful and readable output when printing objects.

### Question 5
What is the default behavior of `equals()`?

**Answer:** It checks whether two references point to the same object.

### Question 6
Why must `hashCode()` usually be overridden with `equals()`?

**Answer:** Because equal objects should return the same hash code for correct behavior in hash-based collections.

### Question 7
What does `getClass()` return?

**Answer:** It returns the runtime class information of the object.

### Question 8
What is `clone()` used for?

**Answer:** It is used to create a copy of an object.

### Question 9
Is `finalize()` recommended in modern Java?

**Answer:** No. It is deprecated and generally avoided.

### Question 10
Do all Java classes inherit from Object?

**Answer:** Yes.

### Question 11
What is one common mistake with object comparison?

**Answer:** Using `==` when `equals()` is needed for logical comparison.

### Question 12
Why is the Object class important in interviews?

**Answer:** Because it tests understanding of Java fundamentals, object behavior, equality, and collections.

---

## 19. Quick Revision Summary

```text
Object class -> parent of all Java classes
toString()   -> readable object text
equals()     -> logical comparison
hashCode()   -> hashing support
getClass()   -> runtime type info
clone()      -> object copy
```

---

## 20. Final Conclusion

The Object class is one of the most important foundations of Java.
It provides all Java objects with common built-in behavior that supports printing, comparison, hashing, type inspection, and more.

If you remember one key idea, let it be this:

> Every Java object inherits from Object, and understanding its methods is essential for strong Java programming.

Mastering the Object class helps build better code, avoid common mistakes, and perform well in interviews.
