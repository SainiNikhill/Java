# Static Keyword
In java Static keyword is used to indicate that  a particular member (variable, Method, Block or inner class) belongs to the class itself rather than to instances (objects) of the class.

This means static memebers are shared among all the instances.
## Usage of Static:
1.Static variable
2.Static Methods
3.Static class
4.Static  Blocks.

##  1. Static variable
- A static variable is shared among all the instances of a class.
- Its initialized only once and its value is common across all over objects(gets memory only once in the      class at time class loading).
- Used when we need commom property for all instnaces of class.
- makes program memory efficient.

```java
class Student{
    int roll_no;
    String name;
    String College = "XYZ College";
}
```
here, everytime when we create an object the variable College also gets cretated which leads to extra memory usage so to save this we use Static keyword befor variable college as the college name is same for every object as its common property;

```java
Class Student{
    int roll_no;
    String name;
    static String College= "xyz university";
}
```


## 2. Static Methods.
- A staic method belongs to class rather than the objects of a class.
- A static methods can be invoked without the need for creating an instance of a class.
- A static methods can access static data member and can change the value of it.
- Can be called using class name.

```java
class mathutil{
    static int add (int a , int b){
        return a+b;

    }
}
public class Test{
    public static void main(String[] args){
        System.out.println(mathutil.add(5,3));
    }
}
```

## 3. Static Blocks
it is used to intitilaize the static data members.
- it runs only when the class is loaded into the memory , before any objects of that class is cretaed.
- it gets executed before main method.

```java
class StaticBlock{

    static{
        System.out.println("Static Block")
    }

    public static void main (String [] args){
        System.out.println("Main Method")
    }
}
```
## 4. Static Class
- only inner classes can be static.
- once class is created independetly by declaring it static so we can use it without instance of the outer class.

```java
class outer {
    static class inner {
        void show(){
            System.out.println("inner class")
        }
    }

    public static void main(String[] args){
        outer.inner obj = new outer.inner();
        obj.show();
    }
}
```
