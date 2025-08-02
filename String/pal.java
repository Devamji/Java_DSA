package String;
import java.util.*;
import java.util.Scanner;

public class pal {
    public static boolean palindrome(String a) {
        int n = a.length();
        for (int i = 0; i < n / 2; i++) {
            if (a.charAt(i) != a.charAt(n - 1 - i)) {
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

