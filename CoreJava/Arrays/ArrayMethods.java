package Arrays;
import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int [] arr  = { 5,2,8,1 };
        int [] arr1 = {1,2,5,8}; 

        // this will sort the arrays 
        Arrays.sort(arr);
        for(int num : arr) {
            System.out.println("element " + num );
        }
        // convert arrays  into string
        System.out.println(Arrays.toString(arr)); // print arrays

        // arrays fill 
        Arrays.fill(arr,0); // fills arrays with 0 

        // check if arrays are equal or not 
        Arrays.equals(arr,arr1);
    }
}
