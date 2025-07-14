package ObjectOrientedProgramming.Polymorphism;

// It occurs when a method is called on an objects and the methods that gets executed is determined at runtime
// Example is method overriding.

// Method overriding happens when a sub-class provides its specific implementation of a method that is already defined in its superior
// The method in subclass has same name , same parameter and same return type as the method in superclass.

class Animal {
    void Sound (){
        System.out.println("Animal makes sound ");
    }
}
class Dog extends Animal {
    
    @Override
    void Sound(){
        System.out.println("Dog Barks");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal A = new Dog();
        // Type of Animal class but object of Dog class;

        A.Sound();
    }
    
}
