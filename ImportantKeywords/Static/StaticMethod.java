package Static;

public class StaticMethod {

    public static void  printHello(){
        System.out.println("hello with non static");
    }

    public static void main (String[] args ){
       // printHello(); -  as you cant acces non static methods from static methods as  non static methods requires object reference.
       // so convert the method into static method 

    }
    
}
