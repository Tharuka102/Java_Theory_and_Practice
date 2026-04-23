# Java Design Patterns - Complete Theory Notes

## 1. Introduction

Design patterns are proven reusable solutions to common software design problems.
They are not ready-made code libraries. Instead, they are standard design ideas that help developers write cleaner and more maintainable applications.

In Java, design patterns are widely used in object-oriented development, frameworks, enterprise applications, and interviews.

---

## 2. Why Design Patterns Matter

Design patterns matter because they help developers:

- solve common problems in a structured way
- improve code readability
- reduce tight coupling
- increase flexibility and reuse
- communicate design ideas clearly in teams

They make software easier to extend and maintain over time.

---

## 3. Main Categories of Design Patterns

Design patterns are usually grouped into three main categories:

### Creational Patterns
These deal with object creation.

Examples:
- Singleton
- Factory
- Builder

### Structural Patterns
These deal with class and object composition.

Examples:
- Adapter
- Decorator
- Facade

### Behavioral Patterns
These deal with communication and responsibilities between objects.

Examples:
- Strategy
- Observer
- Command

---

## 4. Singleton Pattern

The Singleton pattern ensures that only one object of a class exists in the entire application.
It also provides a global access point to that object.

### Use cases
- configuration manager
- logger
- cache manager
- shared service object

### Core idea
- private constructor
- static instance
- public access method

---

## 5. Factory Pattern

The Factory pattern creates objects without exposing the creation logic to the client.
The client asks the factory for an object instead of creating it directly.

### Benefits
- centralizes object creation
- reduces direct dependency on concrete classes
- improves flexibility

### Use cases
- notification creation
- payment gateways
- report generators

---

## 6. Builder Pattern

The Builder pattern is useful when an object has many fields or optional settings.
It helps create complex objects step by step in a readable way.

### Benefits
- readable object creation
- avoids huge constructors
- useful for immutable objects

### Example idea
A user profile, house, or product object with many optional values.

---

## 7. Strategy Pattern

The Strategy pattern allows changing behavior at runtime by switching one algorithm or rule with another.

### Example idea
A shopping cart may pay by card, cash, or online wallet.

### Benefits
- follows open/closed principle
- avoids large conditional chains
- makes behavior interchangeable

---

## 8. Observer Pattern

The Observer pattern creates a one-to-many relationship between objects.
When one object changes, all subscribed objects are notified automatically.

### Example uses
- event systems
- news subscriptions
- UI listeners
- notification updates

This pattern is very common in real-world Java systems.

---

## 9. Simple Illustration

```text
Design Patterns
|
|-- Creational
|    |-- Singleton
|    |-- Factory
|    |-- Builder
|
|-- Behavioral
     |-- Strategy
     |-- Observer
```

This gives a clear overview of the patterns covered in this module.

---

## 10. Real-World Value of Design Patterns

In real projects, design patterns help teams produce software that is:

- easier to understand
- easier to change
- easier to test
- more reusable
- better aligned with OOP principles

Frameworks like Spring and Java libraries use these ideas heavily.

---

## 11. Pattern Selection Insight

Not every problem needs a design pattern.
Patterns are helpful when they solve a real design issue.

### Good use
When code becomes repetitive, tightly coupled, or hard to extend.

### Bad use
Using patterns just to make simple code look complicated.

So, patterns should be applied wisely, not blindly.

---

## 12. Common Mistakes Students Make

### Mistake 1
Thinking design patterns are fixed code templates.

### Mistake 2
Using a pattern when a simpler solution is enough.

### Mistake 3
Memorizing names without understanding the problem each pattern solves.

### Mistake 4
Confusing Factory with Builder.

### Mistake 5
Not understanding why Strategy and Observer are behavioral patterns.

---

## 13. Examples Included in This Module

This module provides practical programs for:

- Singleton pattern
- Factory pattern
- Builder pattern
- Strategy pattern
- Observer pattern

These examples connect interview theory with clear Java code.

---

## 14. Interview Questions and Answers

### Question 1
What is a design pattern?

**Answer:** A design pattern is a proven reusable solution to a common software design problem.

### Question 2
What are the three main categories of design patterns?

**Answer:** Creational, structural, and behavioral.

### Question 3
What does the Singleton pattern do?

**Answer:** It ensures only one object of a class exists and provides global access to it.

### Question 4
Why is the Factory pattern useful?

**Answer:** It centralizes object creation and reduces dependency on concrete classes.

### Question 5
When is the Builder pattern useful?

**Answer:** When creating complex objects with many fields or optional values.

### Question 6
What problem does the Strategy pattern solve?

**Answer:** It allows behavior or algorithms to be changed at runtime.

### Question 7
What is the Observer pattern used for?

**Answer:** It notifies multiple subscribed objects when one object changes or publishes an update.

### Question 8
Are design patterns mandatory in every project?

**Answer:** No. They should be used only when they solve a real design problem.

### Question 9
Why are design patterns important in Java interviews?

**Answer:** Because they show knowledge of software design, OOP principles, and maintainable coding practices.

### Question 10
What is one common real-world use of Singleton?

**Answer:** Application configuration management.

### Question 11
What is one common real-world use of Observer?

**Answer:** Event or notification systems.

### Question 12
Why should patterns be understood conceptually instead of memorized only by name?

**Answer:** Because the real skill is knowing which problem each pattern solves and when to use it.

---

## 15. Quick Revision Summary

```text
Singleton -> one shared object
Factory   -> object creation through factory
Builder   -> step-by-step complex object creation
Strategy  -> switch behavior at runtime
Observer  -> notify many listeners/subscribers
```

---

## 16. Final Conclusion

Design patterns are essential tools for writing better Java applications.
They improve structure, readability, flexibility, and long-term maintainability.

If you remember one key idea, let it be this:

> Design patterns are not about making code complex; they are about solving recurring design problems in a clean and reusable way.

Mastering these patterns strengthens both practical development skills and interview confidence.
