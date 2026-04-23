# Java Inheritance - Complete Theory Notes

## 1. Introduction

Inheritance is one of the four main pillars of object-oriented programming in Java.
It allows one class to acquire the properties and behaviors of another class.

This creates a powerful **is-a relationship** between classes.

Examples:
- a Dog is an Animal
- a Car is a Vehicle
- a Teacher is a Person

Inheritance helps make Java programs more reusable, organized, and extensible.

---

## 2. What Is Inheritance?

Inheritance is the mechanism by which one class (child/subclass) can use the fields and methods of another class (parent/superclass).

### Simple idea
Instead of writing the same code again and again, the child class reuses the common code from the parent class.

---

## 3. Basic Syntax

```java
class Parent {
}

class Child extends Parent {
}
```

The keyword `extends` is used for class inheritance.

---

## 4. Why Inheritance Is Important

Inheritance helps with:

- code reuse
- reduced duplication
- logical class hierarchy
- method overriding
- runtime polymorphism

It makes object-oriented design more natural and powerful.

---

## 5. Parent and Child Relationship

A parent class contains common properties and behaviors.
A child class inherits them and may also add new features or override existing ones.

### Illustration
```text
Animal
  |
  └── Dog
```

Here, Dog inherits common behavior from Animal.

---

## 6. Types of Inheritance in Java

Java supports several inheritance styles:

### A. Single inheritance
One child inherits from one parent.

### B. Multilevel inheritance
A class inherits from a class that already inherits from another class.

### C. Hierarchical inheritance
Multiple child classes inherit from the same parent class.

### D. Multiple inheritance through interfaces
A class can implement multiple interfaces.

### Important note
Java does **not** support multiple inheritance of classes directly because it can create ambiguity.

---

## 7. Method Overriding

Method overriding happens when a child class provides its own version of a parent method.

### Example idea
An Animal class may define `makeSound()`,
but each child class can implement it differently.

This is a major part of runtime polymorphism.

---

## 8. The this Keyword

The `this` keyword refers to the current object.
It is commonly used to:

- refer to current object fields
- remove confusion between parameters and fields
- call another constructor using `this()`

### Example
```java
this.name = name;
```

Here, the left side is the current object's field and the right side is the parameter.

---

## 9. The this() Constructor Call

`this()` is used to call another constructor in the same class.
This is called **constructor chaining**.

### Example idea
A default constructor can reuse a parameterized constructor instead of repeating the same initialization code.

### Rule
If used, `this()` must be the first statement inside the constructor.

---

## 10. The super Keyword

The `super` keyword refers to the immediate parent class object.
It is used to:

- access parent fields
- call parent methods
- call the parent constructor using `super()`

---

## 11. The super() Constructor Call

`super()` calls the constructor of the parent class.
It is very useful when the parent class needs initialization first.

### Rule
If used explicitly, `super()` must be the first statement in the child constructor.

---

## 12. Interfaces and Inheritance

Interfaces also support inheritance-like behavior in Java.
A class can implement one or more interfaces.

### Example idea
A printer can:
- print
- scan

These behaviors can come from different interfaces.

This makes Java flexible while avoiding direct multiple inheritance of classes.

---

## 13. Diamond Problem in Java

The diamond problem happens when two parent sources provide the same method and a child receives both.

### Illustration
```text
      FirstInterface
          \   /
           Child
          /   \
     SecondInterface
```

In languages with multiple class inheritance, this can cause ambiguity.

### How Java handles it
Java avoids this problem by:
- not allowing multiple inheritance of classes
- requiring explicit override when two interfaces provide the same default method

This makes the conflict resolution clear.

---

## 14. Dynamic Method Dispatch

Dynamic method dispatch means the method call is resolved at runtime based on the actual object type, not just the reference type.

### Example idea
```java
Shape shape = new Circle();
shape.draw();
```

Even though the reference is of type Shape, the Circle version of `draw()` runs.

This is one of the strongest features of inheritance and polymorphism in Java.

---

## 15. Object Type Casting

Object type casting in inheritance is used to convert references between parent and child types.

### Upcasting
Child object -> parent reference

```java
Vehicle vehicle = new Car();
```

This is automatic and safe.

### Downcasting
Parent reference -> child reference

```java
Car car = (Car) vehicle;
```

This must be done carefully, usually with `instanceof`.

---

## 16. Covariant Return Types

A covariant return type means that an overridden method in the child class can return a more specific type than the method in the parent class.

### Example idea
A parent method returns `Animal`, but the child override returns `Dog`.

This makes overridden methods more specific and useful.

---

## 17. Inheritance vs Composition

This is a very important design topic.

| Concept | Meaning |
|--------|---------|
| Inheritance | is-a relationship |
| Composition | has-a relationship |

### Example
- Dog is an Animal -> inheritance
- Car has an Engine -> composition

### Good design principle
Use inheritance only when the relationship is truly an is-a relationship.

---

## 18. Benefits of Inheritance

- code reuse
- less repetition
- easier maintenance
- method overriding support
- runtime polymorphism support
- cleaner hierarchical design

---

## 19. Common Mistakes Students Make

### Mistake 1
Confusing inheritance with composition.

### Mistake 2
Using inheritance where the relationship is not truly is-a.

### Mistake 3
Forgetting that constructors are not inherited.

### Mistake 4
Using downcasting unsafely without checking the actual object type.

### Mistake 5
Confusing `this()` and `super()`.

### Mistake 6
Thinking Java supports multiple inheritance of classes directly.
It does not.

---

## 20. Examples Included in This Module

This module provides practical programs for:

- basic inheritance
- interfaces and multiple behavior through interfaces
- the diamond problem with default methods
- `this` and `this()`
- `super` and `super()`
- object type casting
- co-variant return types
- dynamic method dispatch

These examples help connect inheritance theory with real Java programming practice.

---

## 21. Visual Memory Trick

```text
Inheritance = child reuses and specializes parent behavior
```

Remember it like this:

- parent gives common features
- child adds or changes specific behavior

---

## 22. Interview Questions and Answers

### Question 1
What is inheritance in Java?

**Answer:** Inheritance is the mechanism by which one class acquires the properties and behaviors of another class.

### Question 2
Which keyword is used for class inheritance in Java?

**Answer:** `extends`.

### Question 3
What is method overriding?

**Answer:** It is when a child class provides its own version of a parent class method.

### Question 4
What does the `this` keyword mean?

**Answer:** It refers to the current object.

### Question 5
What is `this()` used for?

**Answer:** It is used to call another constructor in the same class.

### Question 6
What does the `super` keyword mean?

**Answer:** It refers to the immediate parent class object.

### Question 7
What is `super()` used for?

**Answer:** It is used to call the parent class constructor.

### Question 8
Does Java support multiple inheritance of classes?

**Answer:** No. It supports multiple inheritance of type through interfaces.

### Question 9
What is the diamond problem?

**Answer:** It is the ambiguity that can happen when two parent sources provide the same method to a child.

### Question 10
What is dynamic method dispatch?

**Answer:** It is runtime method selection based on the actual object type.

### Question 11
What is upcasting?

**Answer:** Storing a child object in a parent reference.

### Question 12
What is downcasting?

**Answer:** Converting a parent reference back into a child reference.

### Question 13
What is a covariant return type?

**Answer:** It allows an overridden method to return a more specific child type.

### Question 14
Why is inheritance important in interviews?

**Answer:** Because it tests understanding of core OOP design, polymorphism, and Java behavior.

---

## 23. Quick Revision Summary

```text
Inheritance   -> is-a relationship
extends       -> class inheritance
implements    -> interface inheritance behavior
this          -> current object
this()        -> call current class constructor
super         -> parent reference
super()       -> call parent constructor
upcasting     -> child to parent
downcasting   -> parent to child
dispatch      -> runtime method selection
```

---

## 24. Final Conclusion

Inheritance is one of the most powerful concepts in Java OOP.
It supports reuse, specialization, and runtime flexibility.

If you remember one key idea, let it be this:

> Inheritance lets a child class reuse what is common and customize what is different.

Mastering inheritance is essential for understanding Java polymorphism, class design, and technical interviews.
