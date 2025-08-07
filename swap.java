package Basic;
import java.util.*;

// this program we first make (temp , a , b) three variable
// temp is a empty shell or a box and a,b contain a value.
//we put "a " value in "temp" box (temp <= a)
// then we transfer b value in "a" box (a <= b)
// then we transfer tamp value in "b" box b <= temp

// then we observe that a's value is moved in temp box (a box become empty) and b's value is moved in a's box (b box are now empty) then temp value moved in b's box (now temp is empty)
// now a's value become b's and b's value become a's.
// by the help of this process we successfully swap that value. 


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



