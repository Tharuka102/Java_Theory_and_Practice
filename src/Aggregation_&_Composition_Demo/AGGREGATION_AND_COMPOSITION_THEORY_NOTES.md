# Aggregation and Composition in Java - Complete Theory Notes

## 1. Introduction

Aggregation and composition are two important forms of association in object-oriented programming.
They describe how one class can be related to another class using a has-a relationship.

Both concepts are used to model real-world systems in Java more accurately.

Examples:
- a student has a course
- an employee has a department
- a car has an engine
- a house has rooms

---

## 2. What Is Association?

Association is a general relationship between two classes.
It shows that objects of one class are connected to objects of another class.

Aggregation and composition are special stronger forms of association.

### Simple idea
Association asks:

> How are two objects related in the real world?

---

## 3. What Is Aggregation?

Aggregation is a weak has-a relationship.
In aggregation, one object uses another object, but the contained object can still exist independently.

### Example idea
An employee belongs to a department.
But the department can still exist even if a specific employee leaves.

### Key point
The child or contained object has its own independent life cycle.

---

## 4. What Is Composition?

Composition is a strong has-a relationship.
In composition, one object strongly owns another object.
If the parent object is destroyed, the contained object is also considered destroyed as part of it.

### Example idea
A car has an engine.
In a composition design, the engine is treated as an internal part of the car object.

### Key point
The contained object depends strongly on the parent object.

---

## 5. Easy Difference in One Sentence

- Aggregation = uses another object
- Composition = owns another object

This is the fastest way to remember the difference.

---

## 6. Aggregation Illustration

```text
Department <----- Employee

Employee uses Department
Department can exist without a specific Employee
```

### Real-world meaning
A department is not created only for one employee.
Many employees may belong to the same department.

---

## 7. Composition Illustration

```text
Car ----contains----> Engine

Engine is a strong internal part of Car
```

### Real-world meaning
In this design, the engine belongs to the car structure and is treated as part of it.

---

## 8. Aggregation vs Composition Table

| Feature | Aggregation | Composition |
|--------|-------------|-------------|
| Relationship strength | weak | strong |
| Ownership | no strong ownership | strong ownership |
| Life cycle dependency | independent | dependent |
| Reusability | higher | lower but tighter design |
| Example | employee and department | car and engine |

---

## 9. How Aggregation Is Implemented in Java

Aggregation usually happens when one class stores a reference to an object created elsewhere.

### Example
```java
Department department = new Department("IT");
Employee employee = new Employee("Akash", department);
```

Here, the department object exists independently and is passed into the employee object.

---

## 10. How Composition Is Implemented in Java

Composition usually happens when one class creates and manages the inner object itself.

### Example
```java
class Car {
    private Engine engine = new Engine();
}
```

Here, the engine is strongly tied to the car object.

---

## 11. Why These Concepts Matter

Aggregation and composition help developers design classes more naturally.
They improve:

- code structure
- readability
- maintainability
- real-world modeling
- object responsibility design

Choosing the correct relationship makes a design much better.

---

## 12. When to Use Aggregation

Use aggregation when:

- the related object can exist independently
- objects are shared or reused
- the relationship is loose
- one object only needs to refer to another

### Examples
- student and course
- employee and department
- library member and book

---

## 13. When to Use Composition

Use composition when:

- one object is a strong part of another
- the child object should not meaningfully exist alone in the design
- the parent fully controls the part

### Examples
- house and rooms
- human and heart
- car and engine

---

## 14. Aggregation and Composition in OOP Design

These concepts are often connected to better object-oriented design.

### Good design principle
Prefer a clear has-a relationship when inheritance is not appropriate.

This often creates more flexible and realistic software models than forcing an is-a relationship.

---

## 15. Common Mistakes Students Make

### Mistake 1
Thinking aggregation and composition are exactly the same.
They are related, but composition is stronger.

### Mistake 2
Using inheritance where a has-a relationship would be better.

### Mistake 3
Ignoring the object life cycle when deciding between aggregation and composition.

### Mistake 4
Choosing composition when the child object should actually be shared independently.

---

## 16. Examples Included in This Module

This module provides practical programs for:

- basic aggregation with employee and department
- basic composition with car and engine
- side-by-side comparison examples
- real-world ownership modeling

These examples help connect theory with practical Java coding.

---

## 17. Visual Memory Trick

```text
Aggregation -> has-a but can live separately
Composition -> has-a and belongs strongly
```

You can remember it like this:

- aggregation = connection
- composition = ownership

---

## 18. Interview Questions and Answers

### Question 1
What is aggregation in Java?

**Answer:** Aggregation is a weak has-a relationship where one object refers to another object that can exist independently.

### Question 2
What is composition in Java?

**Answer:** Composition is a strong has-a relationship where one object strongly owns another object.

### Question 3
What is the main difference between aggregation and composition?

**Answer:** In aggregation, the related object can exist independently, while in composition it is strongly tied to the parent object.

### Question 4
Which relationship is stronger: aggregation or composition?

**Answer:** Composition is stronger.

### Question 5
Give a simple aggregation example.

**Answer:** Employee and Department.

### Question 6
Give a simple composition example.

**Answer:** Car and Engine.

### Question 7
Why is composition often used in good design?

**Answer:** Because it models strong ownership clearly and improves object organization.

### Question 8
Can aggregated objects be shared by multiple other objects?

**Answer:** Yes.

### Question 9
What type of relationship do both aggregation and composition represent?

**Answer:** A has-a relationship.

### Question 10
Should inheritance always be used instead of composition?

**Answer:** No. In many cases, composition is a better and more flexible design choice.

### Question 11
What is life cycle dependency in composition?

**Answer:** It means the child object is strongly dependent on the parent object in the design.

### Question 12
Why are aggregation and composition important in interviews?

**Answer:** Because they test understanding of real object-oriented design, relationships, and modeling decisions.

---

## 19. Quick Revision Summary

```text
Aggregation  -> weak has-a relationship
Composition  -> strong has-a relationship
Aggregation  -> shared or independent object
Composition  -> owned internal object
```

---

## 20. Final Conclusion

Aggregation and composition are essential ideas in Java OOP.
They help developers model relationships between objects in a realistic and maintainable way.

If you remember one key idea, let it be this:

> Aggregation means using another object, while composition means strongly owning it.

Understanding this difference will improve both your Java design skills and interview confidence.
