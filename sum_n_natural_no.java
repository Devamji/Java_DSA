package Basic;
import java.util.*;
public class sum_n_natural_no {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;
        int counter = 1;
        while (counter <= n){
            sum = sum + counter;
            counter++;
        }
    }
}
