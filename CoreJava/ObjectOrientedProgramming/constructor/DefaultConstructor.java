package ObjectOrientedProgramming.constructor;

  class car {
    String name;
    int price ; 

    car () {
            System.out.println("Default Constructor called ");
            this.name = "unkown";
            this.price = 20000;
        }

    void display () {
        System.out.println(name);
        System.out.println("the price of the car is:" + price);
    }
    }

public class DefaultConstructor {

    // no argument constructor
    /** a constructor with no parameters , provided by java if no other constructor is defined  */
  
    
        public static void main(String[] args) {
            car car1 = new car();
            car1.display();
        }
    
    
}
