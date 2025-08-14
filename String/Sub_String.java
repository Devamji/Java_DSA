package String;
import java.util.*;

// string sub = " "
// for (i = si; i< ei ; i++)
//     substr += str.charAt(i);

public class Sub_String {
    public static String substring(String str , int si , int ei){
        String substr =" ";                         // make empty string
        for (int i=si; i<ei ; i++){                 // si se le ke ei-1 tak chelega
            substr += str.charAt(i);                // String ke i number index ka character deta hai
        }
        return substr;
    }

    public static void main(String[] args) {
        Scanner sc = new  Scanner (System.in);
        System.out.print("enter the string ::");
        String str = sc.next();
        System.out.println(str.substring(0,5));
    }
}


