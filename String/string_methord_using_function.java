package String;
import java.util.*;
public class string_methord_using_function {
    // Function to take input
    public static String inputString(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.next();
    }

    // Function to print string length
    public static void printLength(String str) {
        System.out.println("Length :: " + str.length());
    }

    // Function to print lowercase & uppercase
    public static void printCases(String str) {
        System.out.println("Lowercase :: " + str.toLowerCase());
        System.out.println("Uppercase :: " + str.toUpperCase());
    }

    // Function to trim spaces
    public static void printTrim(String str) {
        System.out.println("Trimmed :: " + str.trim());
    }

    // Function to print substring
    public static void printSubstring(String str, Scanner sc) {
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        System.out.println("Substring :: " + str.substring(start, end));
    }

    // Function to replace characters
    public static void printReplace(String str) {
        System.out.println("Replace 'a' with 'x' :: " + str.replace("a", "x"));
    }

    // Function to check startsWith & endsWith
    public static void checkStartEnd(String str, Scanner sc) {
        System.out.print("Enter prefix to check: ");
        String prefix = sc.next();
        System.out.println("Starts with? " + str.startsWith(prefix));

        System.out.print("Enter suffix to check: ");
        String suffix = sc.next();
        System.out.println("Ends with? " + str.endsWith(suffix));
    }

    // Function to compare strings
    public static void compareStrings(String str, Scanner sc) {
        System.out.print("Enter another string for comparison: ");
        String other = sc.next();
        System.out.println("Equal? " + str.equals(other));
        System.out.println("Ignore Case Equal? " + str.equalsIgnoreCase(other));
    }

    // Function to demonstrate compareTo
    public static void printCompareTo() {
        String m = "a"; // 97
        String n = "A"; // 65
        System.out.println("CompareTo result (a vs A) :: " + m.compareTo(n));
    }

    // Function to demonstrate indexOf & lastIndexOf
    public static void printIndexes(String str) {
        System.out.println("Index of 'v' in " + str + " :: " + str.indexOf("v"));
        String str3 = "deepak";
        System.out.println("Last index of 'e' in deepak :: " + str3.lastIndexOf("e"));
        System.out.println("First index of 'e' in deepak :: " + str3.indexOf("e"));
    }

    // Function to check contains
    public static void printContains(String str) {
        System.out.println("Contains 'a'? " + str.contains("a"));
    }

    // Function to check charAt
    public static void printCharAt(String str) {
        System.out.println("Character at index 3 in " + str + " :: " + str.charAt(3));
    }

    // Function to demonstrate concat
    public static void printConcat() {
        String a = "Devam";
        String b = "Mishra";
        System.out.println("Concat result :: " + a.concat(b));
    }

    // Function to check isEmpty
    public static void printIsEmpty() {
        String o = "Hello";
        String p = "";
        System.out.println("Is 'Hello' empty? " + o.isEmpty());
        System.out.println("Is '' empty? " + p.isEmpty());
    }

    // Function to demonstrate join
    public static void printJoin() {
        String name1 = String.join(" ", "Devam", "Mishra", "age", "is", "20");
        System.out.println("Join result :: " + name1);
    }

    // Main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        String name = inputString(sc);

        // Call all functions
        printLength(name);
        printCases(name);
        printTrim(name);
        printSubstring(name, sc);
        printReplace(name);
        checkStartEnd(name, sc);
        compareStrings(name, sc);
        printCompareTo();
        printIndexes(name);
        printContains(name);
        printCharAt(name);
        printConcat();
        printIsEmpty();
        printJoin();

    }
}


