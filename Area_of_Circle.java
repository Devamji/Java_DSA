package Basic;

import java.util.Scanner;

public class Area_of_Circle {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        float rad = sc.nextFloat();
        float area = 3.14f*rad*rad;
        System.out.println(area);
    }
}
