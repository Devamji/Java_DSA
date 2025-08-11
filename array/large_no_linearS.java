package Array;

// array [] = {----------}
// int largest = array[0]
// for(int i =0 ; i <n ; i++)
// if(largest < array[i])
//     largest = array [];
// return Largest;


public class large_no_linearS {
    public static int LinearSLarge(int num[] , int n ){
        // int Largest = Integer.MAX_VALUE;  // it show 2147483647 because it is largest value in integer (integer range is -2147483647 to 2147483647)
        int Largest = num[0];
        for(int i = 0 ; i< n ; i++){
            if (Largest < num[i]){
                Largest = num[i];
            }
        }
        return Largest;
    }
    public static void main(String[] args) {
        int num[] = {1,2,6,3,5};
        System.out.println("Largest number is :" + LinearSLarge(num , 5));    
    }
}
