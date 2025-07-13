package OOPs.constructor;

// Java doesn't have a built-in copy constructor, but we can define one manually.

class Student {
    String name;
    int age=18;


    Student(String x , int a) {
        name =x;
        age=a;
    }
    Student(String x ) {
        name= x;
      
    }

    // copy constructor
    Student(Student s){
        name = s.name;
        age = s.age;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
         System.out.println("------------");
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student("nikhil", 12);
        Student s2 = new Student(s1);
        Student s3 = new Student("sumit");
        s1.display();
        s2.display();
        s3.display();
    }
    
}