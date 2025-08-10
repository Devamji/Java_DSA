package Array;
import java.util.*;
import java.util.Scanner;

// sum of array floting data set
// make sum variable and initializing with 0 
           // sum = 0
//  take element from array and sum the sum value with array elements one by one and store that value to sum variable 
           // for ( i = 0; i < arr.length; i++)
           //        sum = sum + arr[i]
           // return sum

public class array3 {
    static float arr[] = {49.3f, 94.5f, 84.4f, 37.4f,100.0f };
    static float sum(){
        float sum = 0; 
        // float i;
        for(int i=0; i<arr.length ; i++){
            sum = sum + arr[i] ;
            
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("sum of given array:"+ sum());
    }
    
}
