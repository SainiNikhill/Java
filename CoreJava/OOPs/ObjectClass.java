package OOPs;

class student {

    String name;
    int classs;
    int rollno;

    void display () {
        System.out.println(name);
        System.out.println(classs);
        System.out.println(rollno);
    }

}

public class ObjectClass{
    public static void main(String[] args) {

        student s1 = new student();
        s1.name = "nikhil";
        s1.classs = 12;
        s1.rollno = 34;
        s1.display();
        

        student s2 = new student();
        s2.name = "mansi";
        s2.classs = 13;
        s2.rollno = 56;
        s2.display();

        
    }

    
}
