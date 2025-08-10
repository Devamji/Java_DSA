package Array;
import java.util.*;
// In this we have an array and we find where is my element are present or not in array.

// make an array list ( int arr [] = {---------------------} )
// take a key from user (Scanner sc = new Scanner(System.in))
// then find length (arr.length ) and see in array that me given key is present in my array or not
              // for (i = 0; i< arr.length; i++)
// If key are present then say found otherwise say Not Found.  
             // if (arr[i] == key){
             //    system.out.print("found")
             //}else{
             //     system.out.print("not found")
             //}
public class  array2{
    public static boolean containElement(int arr[],int key){
        for (int i = 0 ; i< arr.length; i++){
            if (arr[i] == key){
                return true;
            }

            
        }
        return false;
       
    } 
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        Scanner sc = new Scanner (System.in);
        int key = sc.nextInt();
         if (containElement(arr, key)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
      
    }
}