package Operators;

///  perform logical operations  ( && AND = true if only both expressions are correct) , (// OR  = true if at least one expression is true) , (! not  = true if expression is false)

public class logical {

    public static void main(String[] args) {

        int a  = 10 ;
        int b  = 20 ;
        int c  = 30 ;
        System.out.println(a<b || a>c);
        System.out.println(a<b && a<c);

    }
}
