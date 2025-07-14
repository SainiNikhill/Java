package ObjectOrientedProgramming.constructor;

// Java doesn't have a built-in copy constructor, but we can define one manually.

class Studentt {
    String name;
    int age=18;


    Studentt(String x , int a) {
        name =x;
        age=a;
    }
    Studentt(String x ) {
        name= x;
      
    }

    // copy constructor
    Studentt(Studentt s){
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
        Studentt s1 = new Studentt("nikhil", 12);
        Studentt s2 = new Studentt(s1);
        Studentt s3 = new Studentt("sumit");
        s1.display();
        s2.display();
        s3.display();
    }
    
}