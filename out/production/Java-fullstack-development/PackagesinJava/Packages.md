# What are Packages in Java?
Packages in Java are used to group related classes, interfaces, and sub-packages.

They help in:
Organizing code better
Avoiding class name conflicts
Providing access control
Reusing code

## Types of Packages.
1. Built-in = Provided by SDK
2. User-Defined = Created by developer.

## Example Built-in packages.
```
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}

```

## How to create a user defined Package

### Step 1: Create the package
File path: MyPackage/HelloWorld.java

```
package MyPackage; // 👈 declare package

public class HelloWorld {
    public void sayHello() {
        System.out.println("Hello from MyPackage!");
    }
}
```

### Step 2: Use the package in another file


java
```
import MyPackage.HelloWorld;

public class Main {
    public static void main(String[] args) {
        HelloWorld obj = new HelloWorld();
        obj.sayHello();
    }
}
```