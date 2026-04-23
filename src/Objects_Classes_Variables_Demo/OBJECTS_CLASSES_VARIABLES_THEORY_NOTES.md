# Objects, Classes, and Variables in Java - Complete Theory Notes

## 1. Introduction

Objects, classes, and variables are the foundation of object-oriented programming in Java.
Before learning advanced OOP concepts, a student must clearly understand these basics.

This topic explains:

- what a class is
- what an object is
- how variables store data
- the difference between local, instance, and static variables

---

## 2. What Is a Class?

A **class** is a blueprint or template used to create objects.
It defines what data an object has and what actions it can perform.

### Example idea
If `Car` is a class, then specific cars like Toyota or Honda are objects of that class.

### Simple class structure
```java
class Car {
    String brand;
    int speed;
}
```

A class itself is only a design. Real memory is used when objects are created.

---

## 3. What Is an Object?

An **object** is a real instance of a class.
It contains actual values for the variables defined in the class.

### Example
```java
Car car1 = new Car();
```

Here:
- `Car` is the class
- `car1` is the object reference
- `new Car()` creates the object in memory

---

## 4. Variables in Java

Variables are used to store data.
In this topic, the most important variable types are:

- local variables
- instance variables
- static variables

Each has its own purpose and lifetime.

---

## 5. Local Variables

A **local variable** is declared inside a method, constructor, or block.
It exists only while that method is executing.

### Example
```java
int number = 50;
```

### Characteristics
- created inside methods
- must be initialized before use
- destroyed when method ends

---

## 6. Instance Variables

An **instance variable** is declared inside a class but outside methods.
Each object gets its own separate copy.

### Example
```java
String name;
int age;
```

If two objects are created, they can store different values for the same instance variables.

---

## 7. Static Variables

A **static variable** belongs to the class itself, not to individual objects.
It is shared by all objects of that class.

### Example
```java
static String company;
```

If the static value changes, all objects see the updated value.

---

## 8. Constructor Role in Object Creation

A constructor is a special block used to initialize objects.
It runs automatically when an object is created.

### Example
```java
Book b1 = new Book("Java Basics", 2500.00);
```

Constructors help assign values at the time of creation.

---

## 9. Class vs Object Illustration

```text
Class = blueprint
Object = real thing created from blueprint

Class: Car
Objects: car1, car2, car3
```

This is one of the easiest ways to understand OOP.

---

## 10. Variable Comparison Table

| Variable Type | Declared Where | Belongs To | Lifetime |
|--------------|----------------|------------|----------|
| Local        | inside method  | method     | until method ends |
| Instance     | inside class   | object     | as long as object exists |
| Static       | inside class with `static` | class | until class is loaded |

---

## 11. Real-World Example

Imagine a `Student` class:

- `name` and `age` are instance variables because each student has different values
- `schoolName` can be static because all students belong to the same school
- `marks` calculated inside a method can be local

This makes the concept very practical and easy to visualize.

---

## 12. Common Mistakes Students Make

### Mistake 1
Confusing class and object.

### Mistake 2
Thinking static variables are copied into each object.

### Mistake 3
Trying to use local variables before initializing them.

### Mistake 4
Forgetting that each object has its own instance variable values.

### Mistake 5
Not understanding the role of constructors.

---

## 13. Why This Topic Matters

This topic is the entry point to object-oriented programming.
Without it, concepts such as encapsulation, inheritance, and polymorphism become difficult to understand.

It is essential in:

- beginner Java learning
- real-world class design
- object creation logic
- interviews and exams

---

## 14. Examples Included in This Module

This module provides practical programs for:

- creating classes and objects
- understanding instance variables
- using local variables
- sharing static variables
- using constructors for initialization

These examples help transform theory into real Java practice.

---

## 15. Interview Questions and Answers

### Question 1
What is a class in Java?

**Answer:** A class is a blueprint used to create objects.

### Question 2
What is an object in Java?

**Answer:** An object is an instance of a class containing real data.

### Question 3
What is the difference between a class and an object?

**Answer:** A class is the design, while an object is the actual created entity based on that design.

### Question 4
What is a local variable?

**Answer:** A variable declared inside a method or block and used only there.

### Question 5
What is an instance variable?

**Answer:** A variable declared inside a class but outside methods, belonging to each object.

### Question 6
What is a static variable?

**Answer:** A class-level variable shared by all objects.

### Question 7
What is the role of a constructor?

**Answer:** It initializes object data when an object is created.

### Question 8
Can two objects of the same class have different instance variable values?

**Answer:** Yes.

### Question 9
Do local variables need initialization before use?

**Answer:** Yes.

### Question 10
Why are objects and classes important in Java?

**Answer:** Because Java is an object-oriented language, and these concepts are the core building blocks of programs.

### Question 11
Why are static variables useful?

**Answer:** They allow shared data across all objects of a class.

### Question 12
Why is this topic important in interviews?

**Answer:** Because it tests whether the candidate understands the foundation of Java OOP.

---

## 16. Quick Revision Summary

```text
Class      -> blueprint
Object     -> instance of class
Local var  -> inside method
Instance var -> one copy per object
Static var -> shared by all objects
Constructor -> initializes object
```

---

## 17. Final Conclusion

Objects, classes, and variables are the basic building blocks of Java programming.
A strong understanding of these ideas makes it easier to learn every advanced OOP topic later.

If you remember one key idea, let it be this:

> A class defines the structure, an object gives it life, and variables hold the data that makes each object meaningful.

Mastering this topic gives a strong start in Java development and interviews.
