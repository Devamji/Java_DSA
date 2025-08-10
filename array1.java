package Array;
import java.util.*;
// we making array and take input with user
// In this, We take input with user in different different subject and then seek that marks in front of his subject.  
public class array1 {
    public static void main(String[] args) {
        int marks[] = new int [100];
        Scanner sc =new Scanner (System.in);
        marks [0] = sc.nextInt();
        marks [1] = sc.nextInt();
        marks [2] = sc.nextInt();
        System.out.println("phy :" +  marks[0]);
        System.out.println("Chem :" +  marks[1]);
        System.out.println("maths :" +  marks[2]);

    }
}
