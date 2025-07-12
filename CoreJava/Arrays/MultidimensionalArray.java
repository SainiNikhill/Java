package Arrays;

public class MultidimensionalArray {

 public static void main(String[] args) {
       int [][] matrix  = {
        {1,2,3},
        {4,5,6}
    };
    System.out.println(matrix[1][2]);


    // looping through multidimensional array 
     for (int i = 0; i< matrix.length; i++){
        for ( int j = 0; j< matrix[i].length; j++) {
            System.out.println(matrix[i][j] + " ");
        }
        System.out.println();
     }
    
 }
    
    
}
