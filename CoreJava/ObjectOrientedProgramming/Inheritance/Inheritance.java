package ObjectOrientedProgramming.Inheritance;

class Animal{
    String name = "Animal";

    void eat(){
        System.out.println(name + " eats food");
    }

    void sleep(){
        System.out.println(name + " sleeps at night.");
    }
}

class Dog extends Animal{
    String breed = "Labrador";

    // override the eat() method
    @Override
    void eat(){
        System.out.println(breed + " eats bone.");
    }

    void bark(){
        System.out.println(breed + " barks loudly");
    }
    
}

public class Inheritance {
    public static void main(String[] args) {
        
        // creating an object of Dog class
        Dog dog = new Dog();
        dog.eat(); // overrriden method in DOG
        dog.sleep(); // Inherted method from animal
        dog.bark(); // Method of dog class
    }
    
}
