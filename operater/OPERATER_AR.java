package Basic;
import java.util.*;
public class OPERATER_AR {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        String d = sc.next();

        // Arthmetic Operater --> Binary operater --> Add
        int m = a+b; // Adding two integer value
        System.out.println("Sum of number::"+m);
        String x = c+d; // concatinate two string value
        System.out.println("Add two string::"+x);

        // Sub
        int n = a-b;// subtracting two integer
        System.out.println("Substract of two no. ::"+n);
        
        //multiplication
        int o = a*b;
        System.out.println("multiplication of two no. ::"+o);

        //Division
        int p = a/b;
        System.out.println("Division of two number::"+p);
        
        // modulo operater
        int q = a%b;
        System.out.println(" modulos of a and b:: "+q);
    }
}
 