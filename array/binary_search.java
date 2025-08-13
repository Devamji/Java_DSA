package Array;

public class binary_search {
    static int binarysearch(int [] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/ 2; //(start + end ) / 2
             
            
            if (target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {18 -18, 2, -45, 3, 8, 2 ,9 , 38, 4, 5, 7, 9};
        int target = 9;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
    }
}
