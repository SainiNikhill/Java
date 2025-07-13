package OOPs.constructor;

// a constructor that accepts argument to initialize an objects  with specific values;
class Student {
    String name;
    int age; 

    
    // parameterized constructor 
    Student(String name, int age){
        this.name = name;
        this.age= age;
    }
    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("nikhil", 22);
        s1.display();
    }
    
}
