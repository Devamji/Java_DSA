package Basic;
import java.util.*;

// temp , a , b 
//temp <= a
// a <= b
// b <= temp

public class swap {
    public static void swapno(int a , int b) {
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b= sc.nextInt();
        swapno(a, b);
    }
}


