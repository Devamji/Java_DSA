package Array;
import java.util.*;
import Basic.number;
// in this we first take an array and also key (vo number jo shearch karna hai), key ko user se lenge 
// then find the length of that array and make indexing  
           // for (int i = 0 ; i < num.length ; i++)
// maching the key in my given array
           // if (num[i] == key ){
           //    return 1;
           //}
           //return -1;
// ager mil baya key array mai then print found otherwise not found 
           // if (index == -1){
           //     sop("not  found");
           //} else{
           //    sop("found")
           //}
public class Linear_Shearch {
    public static int LinearShearch(int num[], int key) {
        for(int i = 0 ; i< num.length ; i++){
            if (num[i] == key ){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num [] = {2,4,6,8,10,12,14,16};
        Scanner sc = new Scanner (System.in);
        int key = sc.nextInt();
        int index = LinearShearch(num, key);

        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println("key is at index" + index);
        }
    }

}
