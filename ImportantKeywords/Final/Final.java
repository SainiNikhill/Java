package Final;


final class Calculator {
    // final variable
    final double PI = 3.14159;

    //final method
    final int square(int number){
        return number * number;

    }
    void displayPI(){
        System.out.println("Value of PI:" + PI);
    }
}


// public class Final extends Calculator{} -- gives error as you cant extned final class

public class Final {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.displayPI();
        System.out.println(calc.square(5));
        
    }
    
}
