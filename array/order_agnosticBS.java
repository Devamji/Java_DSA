package Array;

public class order_agnosticBS {
    static int orderAgnosticBS(int arr[], int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc;
        if (arr[start] < arr[end]){
            isAsc = true;                   //or
        }else{                        //boolean isAsc = arr[start] < arr[end]
            isAsc = false;
        }
        while(start <= end){
            int mid = start + (end - start)/ 2; //(start + end ) / 2
             if (arr[mid] == target){
                return mid;
             }
            
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }else{
                if (target > arr[mid]){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {18 -18, 2, -45, 3, 8, 2 ,9 , 38, 4, 5, 7, 9};
        int target = 9;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
}
        
   
