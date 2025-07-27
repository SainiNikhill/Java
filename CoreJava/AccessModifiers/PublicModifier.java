package AccessModifiers;

public class PublicModifier {
    // accessible from everywhere ( smae class , same package , subclass different packages)
    // least restrictive.

    public int publicVariable = 10;

    public void method(){
        System.out.println("this is a public method");
    }
    
}
