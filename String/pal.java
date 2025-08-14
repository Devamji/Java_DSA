package String;
import java.util.*;
import java.util.Scanner;

// for (i = 0 ; i < a.length/2 ; i++)
// if (a.carAt(i) != a.charAt(n-1-i)
//  return false


public class pal {
    public static boolean palindrome(String a) {
        int n = a.length();                            // isme hum length find karte hai
        for (int i = 0; i < n / 2; i++) {              // hum isme string ko half se brack kar rahe hai 
            if (a.charAt(i) != a.charAt(n - 1 - i)) {  // a.charAt(i) : string ka left side se i-th character le raha hai and a.charAt(n - 1 - i): string ka right side se i-th character le raha hai
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.next();
        System.out.println("Is palindrome? " + palindrome(a));
    }
}


