# 🧬 Inheritance in Java
## What is Inheritance?
Inheritance is one of the four fundamental OOP concepts. It allows one class (called the child or subclass) to inherit the properties and behaviors (fields and methods) of another class (called the parent or superclass).

Java supports single inheritance (one class can inherit from only one parent class), but allows multilevel and hierarchical inheritance.

### 📦 Why Use Inheritance?
Reusability: Reuse existing code in new classes.

Extensibility: Easily extend features without modifying base code.

Maintainability: Centralized changes in the base class affect all child classes.

Polymorphism: Supports dynamic method dispatch.

🛠️ Syntax
```java

class Parent {
    void show() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is the child class.");
    }
}
```
Usage:
``` java
Copy
Edit
public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();    // Inherited from Parent
        obj.display(); // Defined in Child
    }
}
``` 

### 🧱 Types of Inheritance in Java
Type	Description	Supported in Java?
Single	One subclass inherits one superclass	✅ Yes
Multilevel	Inheritance chain of multiple levels	✅ Yes
Hierarchical	Multiple subclasses inherit the same parent	✅ Yes
Multiple	One subclass inherits from multiple classes	❌ No (only via interfaces)

# 🔄 Method Overriding
Subclass can override parent methods using the @Override annotation.

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
```
### 🔐 Access Modifiers and Inheritance
Modifier	Accessible in Subclass (same package)?	Accessible in Subclass (different package)?
public	Yes	Yes
protected	Yes	Yes
default	Yes	No
private	No	No

🧮 Example – Multilevel Inheritance
```java
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}
```
 ## ⚠️ Notes
Constructors are not inherited, but the parent constructor is called using super().

Java does not support multiple inheritance with classes to avoid ambiguity (diamond problem). Use interfaces for that.

If a subclass needs to call a superclass method explicitly, use super.methodName().

📌 Interview Point
Q: Why Java doesn't support multiple inheritance with classes?
A: To avoid the diamond problem and ambiguity during method resolution. Interfaces are used instead to support multiple inheritance.

