package String;
import java.util.*;
public class Sub_String {
    public static String substring(String str , int si , int ei){
        String substr =" ";
        for (int i=si; i<ei ; i++){
            substr += str.charAt(i);
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
// the is string
