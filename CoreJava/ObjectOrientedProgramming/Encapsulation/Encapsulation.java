package ObjectOrientedProgramming.Encapsulation;



class Bank{
    private int amount;
    // setter function 
    public void setAmount(int amount) {
        this.amount = amount;

    }
    // getter function 
    public int getAmount(){
        return this.amount;

    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Bank B = new Bank();
        // B.amount = 100; -- gives error as cant access the private fields 

        B.setAmount(200);
        System.out.println( B.getAmount());

        // without directly accesing the amount variable it used setters and getters 
        // keeping files private and only allowing access through public methods.


        
    }
    
}
