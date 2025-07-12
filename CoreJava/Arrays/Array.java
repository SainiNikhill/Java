package Arrays;

public class Array {
    public static void main(String[] args) {


        // declaration 
        int [] numbers;

        // Memory Allocation 
        numbers = new int[5];
    

        // Declaration + initialization
        int [] array = {10,20, 30,40,50};

        // can also initialize later 
        int [] marks;
        marks = new int[] {90,30,70};


        // Assesing elements;
        System.out.println(numbers[0]);



        // Modify an elements ; 
        numbers[3] = 34;


        // Looping through arrays
    
        for( int num : array) {
            System.out.println("Element:" + num);
        }
        for( int num : marks ){
            System.out.println("Element:" + num);
        }

        // Arrays Length 
        System.out.println(marks.length);
        System.out.println(array.length);


    }
}
