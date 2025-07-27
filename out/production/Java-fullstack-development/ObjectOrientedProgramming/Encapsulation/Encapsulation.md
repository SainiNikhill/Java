# Encapsulation in Object-Oriented Programming (OOP)

## What is Encapsulation?

Encapsulation is one of the four fundamental principles of Object-Oriented Programming (OOP).  
It is the process of **wrapping data (variables)** and **code (methods)** together into a single unit, typically a class, and **restricting direct access** to some of the object's components.

## Key Objectives

- Protect the internal state of an object from unintended or harmful modifications
- Provide a controlled interface to access or modify object data
- Improve maintainability, flexibility, and security of the code

---

## Real-World Analogy

Think of a **capsule** (medicine) — it encapsulates the drug inside. You don’t know the composition or internal process, but you know how to use it. Similarly, in code, the internal implementation is hidden from the outside world.

---

## Characteristics of Encapsulation

- **Private** variables to restrict direct access
- **Public** getter and setter methods to access and update the private variables
- Keeps implementation hidden from the user

---

## Example in Java

```java
class BankAccount {
    private double balance; // Private variable

    // Public method to access balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
