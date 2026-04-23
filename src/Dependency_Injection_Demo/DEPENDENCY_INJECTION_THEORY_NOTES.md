# Java Dependency Injection - Complete Theory Notes

## 1. Introduction

Dependency Injection, often called **DI**, is a design principle used to reduce tight coupling between classes.
Instead of a class creating its own dependent objects internally, those objects are provided from outside.

This makes programs more flexible, testable, and maintainable.

---

## 2. What Is a Dependency?

A dependency is an object that another class needs in order to do its work.

### Example
A notification app may depend on:
- email service
- SMS service
- logging service

If the class creates these objects by itself, the design becomes tightly coupled.

---

## 3. What Is Dependency Injection?

Dependency Injection means **giving a class the objects it needs from the outside instead of letting it create them internally**.

### Simple idea
Do not ask the class to build its tools.
Provide the tools to it.

---

## 4. Why Dependency Injection Is Important

DI helps with:

- loose coupling
- easier testing
- more reusable code
- simpler maintenance
- better flexibility when changing implementations

This is why DI is extremely popular in professional Java development.

---

## 5. Tight Coupling vs Loose Coupling

### Tight coupling
A class directly creates and controls its dependency.
This makes it harder to replace or test.

### Loose coupling
A class depends on an interface or abstraction, and the actual implementation is injected from outside.
This makes the design flexible and cleaner.

### Illustration
```text
Tight coupling  -> class creates its own dependency
Loose coupling  -> dependency is provided from outside
```

---

## 6. Constructor Injection

Constructor injection provides dependencies through the constructor.

### Example idea
```java
NotificationApp app = new NotificationApp(new EmailService());
```

### Benefits
- dependency is available immediately
- object is fully initialized at creation time
- easier to create immutable designs

This is one of the most common and preferred forms of dependency injection.

---

## 7. Setter Injection

Setter injection provides dependencies using setter methods after object creation.

### Example idea
```java
checkoutService.setPaymentGateway(new CardPaymentGateway());
```

### Benefits
- dependency can be changed later
- useful for optional dependencies

### Caution
If the setter is not called, the object may remain incomplete.

---

## 8. Interface-Based Design in DI

Dependency Injection works best when classes depend on interfaces rather than concrete classes.

### Example
A service depends on `NotificationService`, not specifically on `SmsNotificationService` or `MailNotificationService`.

This allows one implementation to be replaced with another very easily.

---

## 9. Real-World Example

Imagine a user registration system.
After registration, the system needs to send a message.

Possible implementations:
- email notification
- SMS notification
- push notification

With DI, the registration class does not care which one is used internally.
It simply uses the common interface.

---

## 10. Benefits of Dependency Injection

| Benefit | Meaning |
|--------|---------|
| flexibility | easy to swap implementations |
| testability | easier to replace real services with test doubles |
| loose coupling | classes are less dependent on each other |
| maintainability | code becomes easier to update |
| clarity | responsibilities are more clearly separated |

---

## 11. Dependency Injection and SOLID Principles

DI strongly supports the **Dependency Inversion Principle** from SOLID design.

### Principle idea
High-level modules should depend on abstractions, not low-level concrete implementations.

This is one of the key reasons DI is considered professional design.

---

## 12. Common Mistakes Students Make

### Mistake 1
Thinking DI means only using frameworks like Spring.
DI is a design principle and can be done manually in plain Java.

### Mistake 2
Making classes depend directly on concrete classes.

### Mistake 3
Confusing dependency injection with just object creation.
DI is specifically about providing dependencies from outside.

### Mistake 4
Using setter injection for required dependencies without checking null safety.

---

## 13. Dependency Injection vs Creating Objects Directly

### Direct creation
```java
EmailService service = new EmailService();
```

This creates stronger coupling when done inside the class.

### Injected dependency
```java
NotificationApp app = new NotificationApp(service);
```

This makes the consumer class more independent and reusable.

---

## 14. Illustration of Dependency Injection Flow

```text
Create service implementation outside
            |
            v
Inject into consumer class
            |
            v
Consumer uses abstraction to do its work
```

This is the core idea of dependency injection.

---

## 15. Examples Included in This Module

This module provides practical programs for:

- constructor injection
- setter injection
- tight vs loose coupling comparison
- real-world notification-based dependency injection

These examples help connect DI theory with real Java design practice.

---

## 16. Interview Questions and Answers

### Question 1
What is dependency injection?

**Answer:** It is the process of providing a class with its required dependencies from outside instead of creating them internally.

### Question 2
What is a dependency in Java design?

**Answer:** A dependency is an object that another class needs in order to perform its work.

### Question 3
Why is dependency injection important?

**Answer:** Because it reduces tight coupling and improves flexibility, testing, and maintainability.

### Question 4
What is constructor injection?

**Answer:** It is providing dependencies through a class constructor.

### Question 5
What is setter injection?

**Answer:** It is providing dependencies using setter methods after object creation.

### Question 6
Which is usually preferred for required dependencies?

**Answer:** Constructor injection.

### Question 7
Does dependency injection require the Spring Framework?

**Answer:** No. It can be implemented in plain Java without any framework.

### Question 8
How does DI support loose coupling?

**Answer:** By making classes depend on abstractions rather than creating concrete implementations internally.

### Question 9
Why does DI improve testing?

**Answer:** Because test versions of dependencies can be easily injected.

### Question 10
What is the difference between tight coupling and loose coupling?

**Answer:** Tight coupling means classes depend directly on specific implementations, while loose coupling means they depend on abstractions.

### Question 11
Which SOLID principle is closely related to DI?

**Answer:** Dependency Inversion Principle.

### Question 12
Why is DI important in interviews?

**Answer:** Because it shows understanding of clean architecture, maintainability, and professional Java design practices.

---

## 17. Quick Revision Summary

```text
Dependency Injection -> give dependencies from outside
Constructor injection -> dependency via constructor
Setter injection      -> dependency via setter
Goal                  -> loose coupling and better testability
```

---

## 18. Final Conclusion

Dependency Injection is one of the most useful design ideas in Java.
It helps create flexible, testable, and maintainable systems by reducing tight coupling between classes.

If you remember one key idea, let it be this:

> Do not let a class build all its own dependencies; provide what it needs from outside.

Understanding DI is a major step toward professional Java and enterprise application design.
