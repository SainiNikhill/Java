package Variables;

// a variable is a container to store  data while the java program  is executed.
// variables are three types
// 1 . instance  - inside class but outside the method body;
// 2 . local  - declared inside the body  of the methods;
// 3 . static - declared static are static variables  , memory allocation for static variables happens only ones;



public class variables {
    
    int instance_var = 12;

    public static void main(String[] args) {
        int num =10;
        System.out.println(num);

        int a  = 12;
        int b =20 ; 
        int result  = a+b ;
        System.out.println(result);
    }
}