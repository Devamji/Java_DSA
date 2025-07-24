package Basic;
import java.util.*;
public class number {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int count = 1;
        while (count <= a){
            System.out.println(count +" ");
            count++;
        }
        System.out.println();
    }
}
