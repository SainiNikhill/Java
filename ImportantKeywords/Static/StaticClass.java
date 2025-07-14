package Static;


public class StaticClass 
{
    static class Inner {
        void show(){
            System.out.println("this is inner class");
        }
    }

    public static void main(String[] args) {
        StaticClass.Inner in = new StaticClass.Inner();
        in.show();
    }

    // no need for outer class objects.
    
}