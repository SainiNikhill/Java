# 🚀 Object-Oriented Programming in Java

Object-Oriented Programming (OOP) is a paradigm that organizes software design around **objects**, which contain **data** and **methods**. Java is a purely object-oriented programming language (except for primitives).

---

## 📌 Why OOP?

* Encourages code **reusability**, **modularity**, and **extensibility**
* Makes **complex programs easier** to understand and maintain
* Promotes **real-world modeling** using objects

---

## 🧱 Core Principles of OOP

| Principle     | Description                                                        |
| ------------- | ------------------------------------------------------------------ |
| Encapsulation | Hides internal details of objects and exposes only necessary parts |
| Inheritance   | Allows one class to inherit fields and methods from another        |
| Polymorphism  | One interface, many implementations (overriding/overloading)       |
| Abstraction   | Hides implementation complexity and shows only essential features  |

---

## 📦 Classes and Objects

### ➔ Class

A class is a blueprint for objects.

```java
class Car {
    String name;
    int speed;

    void drive() {
        System.out.println(name + " is driving at " + speed + " km/h");
    }
}
```

### ➔ Object

An object is an instance of a class.

```java
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(); // object
        c1.name = "BMW";
        c1.speed = 120;
        c1.drive();
    }
}
```

---

## ⚙️ Constructors

A constructor is a special method used to initialize objects.

```java
class Car {
    String name;
    int speed;

    // Constructor
    Car(String n, int s) {
        name = n;
        speed = s;
    }
}
```

---

## 🔐 Encapsulation

Encapsulation is achieved by using **private variables** and **public getters/setters**.

```java
class Person {
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
```

---

## 🧬 Inheritance

Allows one class to inherit from another using `extends`.

```java
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
```

Usage:

```java
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // inherited method
        d.bark();
    }
}
```

---

## 🔁 Polymorphism

### ✅ Compile-Time Polymorphism (Method Overloading)

```java
class MathUtils {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

### ✅ Run-Time Polymorphism (Method Overriding)

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}
```

---

## 🧹 Abstraction

Hides unnecessary implementation details using **abstract classes** or **interfaces**.

### ➔ Abstract Class

```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
```

### ➔ Interface

```java
interface Vehicle {
    void move();
}

class Car implements Vehicle {
    public void move() {
        System.out.println("Car is moving");
    }
}
```

---

## 🛡️ Access Modifiers

| Modifier    | Class | Package | Subclass | World |
| ----------- | ----- | ------- | -------- | ----- |
| `private`   | ✅     | ❌       | ❌        | ❌     |
| (default)   | ✅     | ✅       | ❌        | ❌     |
| `protected` | ✅     | ✅       | ✅        | ❌     |
| `public`    | ✅     | ✅       | ✅        | ✅     |

---

## 🧐 "this" Keyword

Refers to the current object instance.

```java
class Car {
    String name;

    Car(String name) {
        this.name = name;
    }
}
```

---

## 🧐 "super" Keyword

Refers to the parent class.

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound(); // Calls parent class method
        System.out.println("Dog barks");
    }
}
```

---

## 🧪 Object Class Methods

All Java classes inherit from the `Object` class.

| Method       | Purpose                       |
| ------------ | ----------------------------- |
| `toString()` | Returns string representation |
| `equals()`   | Compares objects              |
| `hashCode()` | Returns hash value            |
| `getClass()` | Returns class name            |

---

## 💡 Real-world Analogy

| Concept       | Example                                     |
| ------------- | ------------------------------------------- |
| Class         | Blueprint of a car                          |
| Object        | Actual car from blueprint                   |
| Encapsulation | Car’s internal engine hidden                |
| Inheritance   | ElectricCar extends Car                     |
| Polymorphism  | `Car.drive()` behaves differently in `Bike` |
| Abstraction   | Drive without knowing engine                |

---

## 📚 Summary

* OOP makes Java powerful and maintainable.
* Key concepts: **Encapsulation, Inheritance, Polymorphism, Abstraction**
* Use **classes** and **objects** to structure your programs.

---

## 📁 Example Mini Project Structure

```
/OOP-Project
  ├── Main.java
  ├── models/
  │    ├── Vehicle.java
  │    ├── Car.java
  │    └── Bike.java
  └── utils/
       └── Printer.java
```

---

> 🧠 Tip: Practice by building a real-world application like a **Bank Management System** or **Library System** using OOP concepts.
