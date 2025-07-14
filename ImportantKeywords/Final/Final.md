# 🔒 Final Keyword in Java

The `final` keyword in Java is used to impose **restrictions**. It can be applied to **variables**, **methods**, and **classes**, and it affects them in different ways.

---

## 📌 1. Final Variable
A `final` variable can be assigned **only once**. After it's initialized, it **cannot be changed**.

### ✅ Example:
```java
public class FinalVariableExample {
    public static void main(String[] args) {
        final int number = 10;
        // number = 20; // ❌ Error: cannot assign a value to final variable
        System.out.println("Final number: " + number);
    }
}
```

## 2. Final Method
A final method cannot be overridden by any subclass. This is used to ensure the method’s behavior remains the same.

## Example
``` java
class Animal {
    final void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    // ❌ This will cause an error
    // void sound() {
    //     System.out.println("Dog barks");
    // }
}
```

## 3. Final Class
A final class cannot be inherited. No class can extend it. This is used to prevent modification of its structure.

## Example
```java
final class Vehicle {
    void showType() {
        System.out.println("This is a vehicle.");
    }
}


class Car extends Vehicle { } // ❌ This will cause an error 
```


