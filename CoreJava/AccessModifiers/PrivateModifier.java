package AccessModifiers;

public class PrivateModifier {

    private int privateVariable = 20;

    private void method(){
        System.out.println("this is private method");

    }

    public void accessPrivate(){
        // can access private members within same class;

        System.out.println(privateVariable);
        method();
    }
    public static void main(String[] args) {
        PrivateModifier pm = new PrivateModifier();
        pm.accessPrivate();
    }
    
}
