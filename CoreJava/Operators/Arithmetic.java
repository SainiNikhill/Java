package Operators;

public class Arithmetic {

    public static void main(String[] args) {
         int num1 = 10;
         int num2  = 2;

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1/num2);
        System.out.println(num1*num2);
        System.out.println(num1 % num2); // gives remainder

        /// post and pre increment
        int result  = num1++; // post increment first fetch then increment
        int result1 = ++num1; // pre increment first increment then fetch
        System.out.println(result);
        System.out.println(result1);



    }
}
