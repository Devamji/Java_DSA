package Array;
import java.util.*;
// First we make an array and take input with user 
// In array we divide in half (a/2) then we swap both two part  
// In swaping case we make temp as an empty array and both two divided array. 
//              temp = arr[i];
//              arr[i] = arr[a-i-1];
//              arr[a-i-1] = arr[i];
// First part of an array (arr[i]) transfer in temp array (temp) then second array (arr[a-i-1) element transfer in first half array (arr[i]) and then temp array (temp) element transfer to second half array(arr[a-i-1]). 

public class array_inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter number of elements: ");
       int a = sc.nextInt();
       int arr [] = new int [a];

       for (int i =0 ; i< a; i++){
        arr[i] = sc.nextInt();
       }
       for (int i = 0; i< a/2; i++){
         int temp = arr[i];
            arr[i] = arr[a - 1 - i];
            arr[a - 1 - i] = temp;
        }

        // Step 3: Print reversed array
        System.out.println("Reversed array:");
        for(int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    


    
}


       