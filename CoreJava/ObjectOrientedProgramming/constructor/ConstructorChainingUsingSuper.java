package ObjectOrientedProgramming.constructor;

// this is another type of constructor chaining in java, this happens between parent and child class. 

/*
What is super() in Constructor Chaining?
super() is used in a child class constructor to call a parent class constructor.

It must be the first statement in the child constructor.

This allows initialization of parent class members before the child class initializes its own members.

 */


class Person {
    String name ;
    int age;

    // default constructor 
    Person(){
        this("unknown", 0); // constructor chaining in parent
        System.out.println("Person Default Constructor");

    }
    // Parameterized Constructor 
    Person(String name , int age){
        this.name = name;
        this.age = age;
        System.out.println("Person parameterized constructor");
    }
}

class Students extends Person{
    String course;


    // default constructor
    Students(){
        this("nikhil",21, "java"); // constructor chaining in child 
        System.out.println("Student default Constructor");
    }
    Students(String name, int age, String course){
        super(name,age); // calls Person's constructor 
        this.course = course;
        System.out.println("Student Parameterized Constructor");
    }

    void display(){
        System.out.println("Name:" + name + "\nAge:" + age + "\nCourse:" + course);
    }
}

public class ConstructorChainingUsingSuper {
    public static void main(String[] args) {
        Students s1 = new Students();
        System.out.println("------------------------------");
        s1.display();
    }
    
}
