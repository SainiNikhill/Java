# 🏠 Constructors in Java

A **constructor** in Java is a special method used to **initialize objects**. It is called **automatically** when an object is created. Constructors have the **same name as the class** and **no return type**.

---

## 🔹 Why Use Constructors?

* To initialize object properties at the time of creation.
* To avoid writing setter methods manually after object creation.
* To create multiple ways to instantiate an object using **overloaded constructors**.

---

## 📌 Constructor Syntax

```java
class ClassName {
    ClassName() {
        // constructor body
    }
}
```

---

## 🔁 Types of Constructors in Java

### 1. Default Constructor (No-Arg Constructor)

A constructor with **no parameters**. Provided by Java if no other constructor is defined.

```java
class Car {
    Car() {
        System.out.println("Default constructor called");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
    }
}
```

---

### 2. Parameterized Constructor

A constructor that accepts **arguments** to initialize fields.

```java
class Car {
    String model;
    int speed;

    Car(String m, int s) {
        model = m;
        speed = s;
    }

    void display() {
        System.out.println(model + " runs at " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", 200);
        c1.display();
    }
}
```

---

### 3. Constructor Overloading

Defining **multiple constructors** with different parameter lists.

```java
class Student {
    String name;
    int age;

    // No-arg constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println(name + " - " + age);
    }
}
```

---

### 4. Copy Constructor (Manual Implementation)

Used to create a **copy of an object**.

```java
class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    // Copy constructor
    Book(Book b) {
        this.title = b.title;
    }
}

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Book b2 = new Book(b1);
        System.out.println(b2.title);
    }
}
```

---

### 5. Chained Constructors using `this()`

Allows one constructor to call another constructor **in the same class**.

```java
class Employee {
    String name;
    int age;

    Employee() {
        this("Default Name", 25); // calls parameterized constructor
    }

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

## 🚨 Constructor vs Method

| Feature     | Constructor                      | Method                  |
| ----------- | -------------------------------- | ----------------------- |
| Name        | Same as class                    | Any name                |
| Return type | No return type                   | Must have a return type |
| Invocation  | Automatically on object creation | Manually called         |
| Purpose     | Initializes object               | Defines behavior        |

---

## 🧐 Use of `this` Keyword in Constructors

Used to refer to the **current object** or to invoke another constructor.

```java
class Car {
    String brand;

    Car(String brand) {
        this.brand = brand; // refers to current object's field
    }
}
```

---

## 🚀 Best Practices

* Always initialize object fields using constructors.
* Use constructor overloading for flexibility.
* Avoid logic-heavy constructors (keep them simple).
* Use `this()` to chain constructors for cleaner code.

---

## 📖 Summary

* Constructors initialize new objects.
* Java provides a default constructor if none is defined.
* You can create multiple constructors using overloading.
* Use `this` and `this()` smartly in constructors.

---

> ✨ Tip: Constructors help make your code **readable, organized, and less error-prone** when initializing objects.
