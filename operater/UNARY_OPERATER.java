package Basic;

import java.util.Scanner;

public class UNARY_OPERATER {
    public static void main (String args[]){

        // declare variable
        Scanner sc = new Scanner (System.in); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result1, result2, result3, result4;
        
        //original value
        System.out.println("Value of a::"+a);

        // pre increment operater
        result1 = ++a;
        System.out.println("After increment::"+ result1);

        //post increment operater
        result2 = a++;
        System.out.println("Before increment::"+ result2);

        //per decrement operater
        result3 = --b;
        System.out.println("After decrement::" + result3);

        //post decrement operater
        result4 = b--;
        System.out.println("Before decrement::"+result4);
    }
}
