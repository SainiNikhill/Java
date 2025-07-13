package OOPs.constructor;

// constructor chaining is a technique in object oriented programming where one constructor calls another constructor in the same class or parent class to reuse code;
// threre are two different types of constructor chaining in java 
// 1 . with-in same class ( using this()) -- constructor in a class calls constructor in same class;

// 2. Between parent - child class ( using super()) -- constructor in a subclass calls constructor in parent class

class Student{
        // with in same class;
    String name ;
    int age;
    String language;

    // default constructor ;
    Student(){
        this("unknown",18); // calls constructor with 2 parameters;
        System.out.println("Default constructor called");

    }

    // parameterized constructor
    Student(String name, int age){
        this(name,age,"java"); // calls constructor with 3 parameters;
        System.out.println("Parameterized Constructor with 2 parameters.");
    }

    // parameterized constructor 
    Student(String name, int age, String language){
        this.name= name;
        this.age= age;
        this.language = language;
        System.out.println("Parameterized constructor wiht 3 parameters");
    }

    void display(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Course:" + language);
    }

}

public class ConstructorChaining {
    public static void main(String[] args) {
        Student s1 = new Student ();
        Student s2 = new Student ("Neha", 21);
        Student s3 = new Student("Nikhil", 22, "C++");
        System.out.println("-------------------");
        s1.display();
        System.out.println("-------------------");
        s2.display();
        System.out.println("-------------------");
        s3.display();
    }



    
}
