# Java Access Modifiers - Complete Theory Notes

## 1. Introduction

Access modifiers in Java control **who can see and use** classes, variables, methods, and constructors.
They are one of the core tools used to implement:

- **Encapsulation**
- **Security**
- **Code organization**
- **Controlled access to data**

Think of access modifiers like doors in a building:

- **public** = anyone can enter
- **protected** = family members and close relatives can enter
- **default** = only people in the same building can enter
- **private** = only the owner can enter

---

## 2. Why Access Modifiers Matter

Without access control, every part of a program could freely change important data. That would make programs:

- difficult to maintain
- unsafe
- harder to debug
- more likely to break by mistake

Access modifiers help us protect internal logic while exposing only what is necessary.

### Real-life analogy

Imagine an ATM machine:

- The screen buttons are **public** because customers must use them.
- Some internal maintenance features are **protected** or **default** for authorized internal use.
- Secret PIN validation logic is **private** because users should never access it directly.

---

## 3. The Four Access Modifiers in Java

Java provides four levels of access control for members:

1. **public**
2. **protected**
3. **default** (also called package-private, when no modifier is written)
4. **private**

---

## 4. Quick Visibility Table

| Modifier | Same Class | Same Package | Subclass in Different Package | Non-Subclass Different Package |
|----------|------------|--------------|-------------------------------|-------------------------------|
| public | Yes | Yes | Yes | Yes |
| protected | Yes | Yes | Yes, through inheritance | No |
| default | Yes | Yes | No | No |
| private | Yes | No | No | No |

### Easy memory rule

- **public** -> everywhere
- **protected** -> package + subclasses
- **default** -> package only
- **private** -> class only

---

## 5. Visual Illustration of Access

```text
                 ACCESS LEVELS (Most open -> Most restricted)

        public
           |
        protected
           |
        default
           |
        private
```

### Package illustration from this project

```text
AccessModifiersDemo/
│
├── package_A/
│   └── AccessModifierDemoA.java
│
├── Package_B/
│   └── AccessModifiersDemoB.java
│
└── package_C/
    └── AccessModifiersDemoC.java
```

This structure is very useful for understanding what can be accessed:

- Code inside **package_A** can access package-level members of other classes in **package_A**.
- Code inside **package_C** is in a **different package**.
- If **package_C** extends a class from **package_A**, then **protected** members become accessible through inheritance.

---

## 6. public Access Modifier

### Definition
A **public** member can be accessed from **anywhere in the program**.

### Example
```java
public String publicVariable = "This is a public variable";
```

### Meaning
If something is public, other classes from the same package or different packages can use it directly.

### When to use public
Use **public** when:

- the member is part of the class API
- other classes are supposed to call it
- the method is intentionally exposed to users of the class

### Example scenario
If a method prints student details and should be usable by all classes, making it public is appropriate.

### Important caution
Do **not** make everything public. Overexposing fields and methods breaks encapsulation.

---

## 7. private Access Modifier

### Definition
A **private** member can only be accessed **inside the same class**.

### Example
```java
private String privateVariable = "This is a private variable";
```

### Meaning
No outside class can access it directly, even if that class is in the same package.

### Why private is powerful
This is the foundation of **encapsulation**.
It hides the internal state of an object and forces controlled access through methods.

### Example from good design
```java
private double balance;

public double getBalance() {
    return balance;
}

public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
    }
}
```

Here, users cannot set the balance to an invalid value directly.

### Best use cases
- passwords
- internal counters
- sensitive data
- helper methods used only inside the class

---

## 8. default Access Modifier (Package-Private)

### Definition
When no modifier is written, Java uses **default** access.

### Example
```java
String defaultVariable = "This is a default variable";
```

### Meaning
A default member can be accessed only by classes in the **same package**.

### Why it is called package-private
It is private to the package, not to the class.

### Use case
This is useful when several classes inside one package work together, but classes outside the package should not use those members.

### Example idea
A utility method used by multiple classes in the same package does not always need to be public.

---

## 9. protected Access Modifier

### Definition
A **protected** member is accessible:

- inside the same class
- inside the same package
- inside subclasses, even if they are in a different package

### Example
```java
protected String protectedVariable = "This is a protected variable";
```

### Important meaning
Protected is designed mainly for **inheritance**.
It allows child classes to reuse parent class data and behavior without exposing it to the whole world.

### Best use case
Use protected when child classes should be able to customize or reuse something.

---

## 10. Deep Comparison: protected vs default

This is one of the most confusing topics in Java.

| Feature | protected | default |
|--------|-----------|---------|
| Same package access | Yes | Yes |
| Subclass access in different package | Yes | No |
| Unrelated class in different package | No | No |

### Core difference
The only extra power of **protected** over **default** is:

> A subclass in another package can access protected members.

That is why protected is strongly connected with inheritance.

---

## 11. Access Modifiers in This Project

Your project already demonstrates these rules clearly.

### In AccessModifierDemoA
The class contains:

- one private variable and method
- one protected variable and method
- one public variable and method
- one default variable and method

This makes it a perfect comparison class.

### In AccessModifiersDemoC
The class extends **AccessModifierDemoA** and is placed in another package.

That means:

- **public** members are accessible
- **private** members are not accessible
- **default** members are not accessible
- **protected** members are accessible through inheritance

### Important subtle point
Inside a subclass in a different package, protected access works through the subclass relationship.
That is why code like this works:

```java
AccessModifiersDemoC demoC = new AccessModifiersDemoC();
System.out.println(demoC.protectedVariable);
```

But direct access using a parent-class object from another package is not allowed in the same way:

```java
AccessModifierDemoA demoA = new AccessModifierDemoA();
// demoA.protectedVariable;   // not allowed here in a different package
```

This is a very common exam and interview concept.

---

## 12. Illustration of Member Accessibility

```text
Class A defines members:

private     -> only inside Class A
default     -> inside Class A + same package classes
protected   -> same package + subclasses in other packages
public      -> everywhere
```

### Relationship diagram

```text
                      Object with members
                             |
      ---------------------------------------------------
      |                 |                 |             |
   private           default          protected       public
      |                 |                 |             |
   same class      same package     package + child   all classes
```

---

## 13. Access Modifiers for Classes

So far, we talked mostly about variables and methods. But classes also have access rules.

### Top-level classes can only be:

- **public**
- **default**

### They cannot be:

- private
- protected

### Why?
Because a top-level class is not inside another class, so Java does not allow private or protected visibility there.

### Example
```java
public class Student {
}
```

or

```java
class StudentHelper {
}
```

If no modifier is written, that class is visible only inside the same package.

---

## 14. Access Modifiers for Constructors

Constructors can also use access modifiers.

### Examples

#### Public constructor
Used when objects should be created from anywhere.

```java
public Student() {
}
```

#### Private constructor
Used to prevent object creation from outside the class.
Common in:

- Singleton pattern
- utility classes
- factory methods

```java
private Student() {
}
```

---

## 15. Common Mistakes Students Make

### Mistake 1: confusing default with protected
Many learners think both are the same. They are not.
Protected works for subclasses in other packages; default does not.

### Mistake 2: making fields public directly
This weakens encapsulation.
Usually, fields should be private and exposed through methods if needed.

### Mistake 3: expecting private members to be inherited directly
Private members belong only to the declaring class. A child class cannot directly access them.

### Mistake 4: forgetting package boundaries
Two classes may look related, but if they are in different packages, default access stops working.

---

## 16. Best Practice Guidelines

### Recommended style in real projects
- Keep fields **private**.
- Expose behavior through **public methods**.
- Use **protected** only when inheritance truly needs it.
- Use **default** to keep package internals hidden.
- Avoid unnecessary public exposure.

### Strong OOP rule
Prefer this approach:

```text
private data + public behavior = safer object-oriented design
```

---

## 17. Short Rule-Based Summary

### private
Most restrictive.
Used to hide implementation details.

### default
Visible only inside the same package.
Useful for internal package cooperation.

### protected
Visible in the package and to subclasses in other packages.
Designed for inheritance.

### public
Visible everywhere.
Use for the official interface of the class.

---

## 18. Interview and Exam Style Questions

### Question 1
Can a private method be inherited?

**Answer:** It belongs to the parent class only and cannot be directly accessed in the child class.

### Question 2
Which modifier is more open: protected or default?

**Answer:** Protected, because it also allows subclass access from another package.

### Question 3
Can a top-level class be private?

**Answer:** No. A top-level class can only be public or default.

### Question 4
Which modifier should usually be used for fields?

**Answer:** Private.

### Question 5
What happens if no access modifier is written?

**Answer:** Java uses default access, which means the member is accessible only within the same package.

### Question 6
Can a subclass access a protected member from another package?

**Answer:** Yes, but through inheritance. That is the main special feature of protected access.

### Question 7
Can a class in another package access a default member?

**Answer:** No. Default access works only inside the same package.

### Question 8
Why is private commonly used for variables?

**Answer:** Because it protects data and supports encapsulation by preventing direct outside modification.

### Question 9
Which access modifier gives the highest visibility?

**Answer:** Public gives the widest access because it can be used from anywhere in the program.

### Question 10
Can constructors also have access modifiers?

**Answer:** Yes. Constructors can be public, protected, default, or private depending on how object creation should be controlled.

### Question 11
What is the difference between public class and default class?

**Answer:** A public class can be used from any package, while a default class can only be used inside its own package.

### Question 12
Why should developers avoid making everything public?

**Answer:** Because it breaks encapsulation, exposes internal implementation, and makes the program harder to maintain safely.

---

## 19. Memory Trick

Use this order from widest access to narrowest:

```text
public -> protected -> default -> private
```

You can remember it as:

**Open -> Family -> Package -> Self**

- public = everyone
- protected = family/subclasses
- default = package neighbors
- private = only me

---

## 20. Final Conclusion

Access modifiers are essential in Java because they define **visibility and protection**.
They help us write code that is:

- secure
- clean
- maintainable
- modular
- object-oriented

If you understand one key idea, let it be this:

> Good Java design is not about exposing everything. It is about exposing only what should be used.

That is the real purpose of access modifiers.

---

## 21. One-Line Revision Sheet

- **public** -> accessible everywhere
- **protected** -> same package and subclasses in other packages
- **default** -> same package only
- **private** -> same class only

---

## 22. Study Tip for This Folder

Use the classes in this folder as a live experiment:

1. Check what is declared in **AccessModifierDemoA**.
2. Try accessing the members from another class in the same package.
3. Try accessing them from **AccessModifiersDemoC** in another package.
4. Observe which lines compile and which lines fail.

This is one of the fastest ways to master access modifiers in Java.
