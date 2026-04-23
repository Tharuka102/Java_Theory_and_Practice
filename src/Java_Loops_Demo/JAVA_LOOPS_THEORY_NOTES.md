# Java Loops - Complete Theory Notes

## 1. Introduction

Loops in Java are used to repeat a block of code multiple times.
Instead of writing the same statement again and again manually, a loop allows the program to perform repetition automatically.

Loops are one of the most important programming concepts because many real-world tasks involve repetition, such as:

- printing numbers
- processing lists
- reading input repeatedly
- generating tables and patterns
- repeating calculations until a condition is met

---

## 2. What Is a Loop?

A loop is a control structure that keeps executing code **as long as a condition is true**.

### Simple idea
A loop is like telling the computer:

> “Keep doing this until I tell you to stop.”

---

## 3. Why Loops Are Important

Without loops, repetitive tasks would require many repeated lines of code.
That would make programs:

- longer
- harder to read
- harder to maintain
- more error-prone

Loops make code shorter, cleaner, and smarter.

---

## 4. Types of Loops in Java

Java mainly provides these loop types:

1. `for` loop
2. `while` loop
3. `do-while` loop
4. nested loops

Each one is useful in different situations.

---

## 5. The for Loop

The `for` loop is used when the number of repetitions is usually known in advance.

### Syntax
```java
for (initialization; condition; update) {
    // code to repeat
}
```

### How it works

1. initialization runs once
2. condition is checked
3. loop body executes if condition is true
4. update runs
5. steps repeat until the condition becomes false

### Example
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### Illustration
```text
Start i = 1
Check i <= 5 -> true
Print i
Increase i by 1
Repeat
```

---

## 6. The while Loop

The `while` loop is used when the number of repetitions is not fixed beforehand.
It keeps running while the condition remains true.

### Syntax
```java
while (condition) {
    // code to repeat
}
```

### Example
```java
int count = 1;
while (count <= 5) {
    System.out.println(count);
    count++;
}
```

### Important point
If the condition is false at the beginning, the loop body will not run even once.

---

## 7. The do-while Loop

The `do-while` loop is similar to while, but it checks the condition **after** running the code block.

### Syntax
```java
do {
    // code to repeat
} while (condition);
```

### Example
```java
int num = 1;
do {
    System.out.println(num);
    num++;
} while (num <= 5);
```

### Key feature
A do-while loop always executes **at least one time**.

---

## 8. Comparison of for, while, and do-while

| Loop Type | Condition Checked | Minimum Runs | Best Use Case |
|----------|-------------------|--------------|---------------|
| for | before loop body | 0 | known number of repetitions |
| while | before loop body | 0 | condition-based repetition |
| do-while | after loop body | 1 | menu or prompt that must run once |

---

## 9. Nested Loops

A nested loop is a loop inside another loop.

### Example
```java
for (int row = 1; row <= 3; row++) {
    for (int col = 1; col <= 4; col++) {
        System.out.print("* ");
    }
    System.out.println();
}
```

### Output idea
```text
* * * *
* * * *
* * * *
```

### Uses of nested loops
- pattern printing
- tables
- matrix operations
- grid-based games

---

## 10. break Statement

The `break` statement immediately stops the loop.

### Example
```java
for (int i = 1; i <= 10; i++) {
    if (i == 6) {
        break;
    }
    System.out.println(i);
}
```

This stops the loop when `i` becomes `6`.

### Use case
Use `break` when a needed result is found and further repetition is unnecessary.

---

## 11. continue Statement

The `continue` statement skips the current iteration and moves to the next one.

### Example
```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}
```

In this example, `3` is skipped.

---

## 12. Infinite Loops

An infinite loop happens when the condition never becomes false.

### Example
```java
while (true) {
    System.out.println("This runs forever");
}
```

### Why it happens
This usually occurs when:

- the loop variable is not updated
- the condition is always true
- the exit logic is missing

### Warning
Infinite loops can freeze or overload a program if not controlled carefully.

---

## 13. Common Loop Mistakes

### Mistake 1: forgetting to update the loop variable
This can create an infinite loop.

### Mistake 2: wrong condition
Using `<` instead of `<=` can change how many times the loop runs.

### Mistake 3: off-by-one errors
A loop may run one time too many or one time too few.

### Mistake 4: overusing nested loops
Too many nested loops can make code slower and harder to read.

---

## 14. Real-World Uses of Loops

### In school systems
- print student marks
- calculate class averages
- process attendance lists

### In banking systems
- process transactions
- calculate balances over time

### In games
- repeat game actions
- update player positions
- process turns

### In web and app development
- show lists of items
- read records from databases
- process user input repeatedly

---

## 15. Examples Included in This Module

This module provides practical examples for:

- `for` loop counting
- `while` loop counting and countdowns
- `do-while` loop behavior
- nested loops for pattern printing
- `break` and `continue`

These are useful for both understanding and interview practice.

---

## 16. Loop Flow Illustration

```text
Initialization
     |
     v
Check condition ---- false ----> Stop
     |
    true
     |
     v
 Run code block
     |
     v
Update variable
     |
     └-------------> back to condition
```

This is the general idea behind most loops.

---

## 17. Interview Questions and Answers

### Question 1
What is a loop in Java?

**Answer:** A loop is a control structure that repeats a block of code while a condition is true.

### Question 2
What are the main types of loops in Java?

**Answer:** `for`, `while`, and `do-while`.

### Question 3
Which loop is best when the number of repetitions is known?

**Answer:** The `for` loop.

### Question 4
Which loop always runs at least once?

**Answer:** The `do-while` loop.

### Question 5
What does `break` do in a loop?

**Answer:** It immediately terminates the loop.

### Question 6
What does `continue` do in a loop?

**Answer:** It skips the current iteration and moves to the next one.

### Question 7
What is an infinite loop?

**Answer:** A loop that never ends because its condition never becomes false.

### Question 8
What is a nested loop?

**Answer:** A loop inside another loop.

### Question 9
What is an off-by-one error?

**Answer:** It is a mistake where a loop runs one extra time or one time too few because of a wrong condition.

### Question 10
When is a while loop more suitable than a for loop?

**Answer:** When the number of repetitions is not known beforehand and depends on a condition.

### Question 11
Can a while loop execute zero times?

**Answer:** Yes, if its condition is false at the start.

### Question 12
Why are loops important in programming?

**Answer:** Because they automate repetition and reduce duplicate code.

---

## 18. Quick Revision Summary

```text
for       -> best for known repetitions
while     -> best for condition-based repetition
do-while  -> runs at least once
break     -> stop the loop
continue  -> skip current round
```

---

## 19. Final Conclusion

Loops are essential in Java because they allow efficient repetition of code.
They make programs shorter, clearer, and far more powerful.

If you remember one key idea, let it be this:

> A loop is the tool that lets a program repeat work intelligently instead of manually.

Mastering loops is a major step toward becoming confident in Java programming.
