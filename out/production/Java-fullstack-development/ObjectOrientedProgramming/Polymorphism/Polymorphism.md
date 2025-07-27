# 🌀 Polymorphism in Java

## ✅ What is Polymorphism?

**Polymorphism** means **"many forms."**  
In Java, it allows one interface (method or object) to be used in different forms depending on the context.

> It's one of the four core pillars of Object-Oriented Programming (OOP):  
> **Encapsulation, Inheritance, Polymorphism, Abstraction**

---

## 📦 Types of Polymorphism in Java

| Type               | Also Called                  | Resolved At | Example              |
|--------------------|------------------------------|-------------|----------------------|
| Compile-time       | Static Polymorphism / Overloading | Compile time | Method Overloading   |
| Runtime            | Dynamic Polymorphism / Overriding | Runtime     | Method Overriding    |

---

## 📘 1. Compile-Time Polymorphism (Method Overloading)

When multiple methods in the same class have the **same name** but **different parameters**, it is **method overloading**.

### 🔹 Example:

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));          // 5
        System.out.println(calc.add(2.5, 3.5));      // 6.0
        System.out.println(calc.add(1, 2, 3));       // 6
    }
}
```
##  2. Runtime Polymorphism (Method Overriding)
When a subclass provides a specific implementation of a method that is already defined in its parent class.

🔹 Example:
```java

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
```
✅ Usage:
```java

public class Main {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();   // reference is of Animal, object is of Dog
        a.sound();       // Output: Dog barks

        a = new Cat();
        a.sound();       // Output: Cat meows
    }
}
```
This is also known as upcasting, and it allows dynamic method dispatch at runtime.

🧠 Key Concepts in Polymorphism
Method Overloading: Same method name, different parameter list in same class.

Method Overriding: Subclass provides specific version of parent method.

Upcasting: Superclass reference holding subclass object.

Dynamic Method Dispatch: Calls overridden methods at runtime based on object type.

⚠️ Rules for Overriding
Method signature must be the same.

Return type must be the same or covariant.

Access modifier must be the same or more accessible.

Cannot override final, static, or private methods.

💡 Interview Tip
Q: What is the difference between overloading and overriding?
A:

Feature	Overloading	Overriding
Defined In	Same class	Parent and Child classes
Parameters	Must be different	Must be same
Return Type	Can be different	Must be same (or covariant)
Runtime/Compile	Compile time	Runtime


