package ObjectOrientedProgramming.Polymorphism;

// happens at the time of compilation, where methods  are resolved based on the method signature.

// Example of Compile time polymorphism is method  overloading 


// Method overloading - multiple methods in a class with same name exists but with different parameters; 


class Calc {

    int add(int a , int b){
        return a+b;

    }
    int add(int a , int b, int c){
        return a+b+c;

    }
    double add(double a, double b){
        return a+b;

    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        System.out.println(c1.add(1,2));
        System.out.println(c1.add(1,2,3));
    }
}
