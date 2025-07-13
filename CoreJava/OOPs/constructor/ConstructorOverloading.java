package OOPs.constructor;

// constructor overloading in java means having multiple constructors in a class with same name but different parameters.
// it allows objects to be intialized  in different ways.


public class ConstructorOverloading {

String name;
int age;


// having three different constructors  with same name but different parameters;


// default constructor ;
ConstructorOverloading(){
    this.name = "unknown";
    this.age = 18;
    System.out.println("default constructor:");

}
// Parameterized constructor with one parameter 
ConstructorOverloading(String name){
    this.name= name;
    this.age = 18;

}
// copy constructor
ConstructorOverloading(ConstructorOverloading s){
    this.name = s.name;
    this.age = s.age;
}

void display(){
    System.out.println(name);
    System.out.println(age);
}

public static void main(String[] args) {
    ConstructorOverloading co = new ConstructorOverloading();
    co.display();
    ConstructorOverloading co2 = new ConstructorOverloading("nikhil");
    co2.display();
    ConstructorOverloading co3 = new ConstructorOverloading(co2);
    co3.display();
}

    
}
