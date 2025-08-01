package String;
import java.util.*;
public class string {
    public static void main(String[] args) {
        // Implementation of String
        String str = "Devam";
        String str1 = new String ("Aman");

        //take input by user
        Scanner sc = new Scanner(System.in);
        String name ;
        name = sc.next();
        System.out.println("name is ::"+ name);

        // length of string
        System.out.print("string length ::");
        System.out.println(name.length());

        //Return all Lowercase character from the string name 
        System.out.print("convert in lowercase ::"+name);
        System.out.println(name.toLowerCase());

        //Return all Uppercase character from the string name 
        System.out.print("convert in uppercase ::"+name);
        System.out.println(name.toUpperCase());

        //Return a new string after removing all the leading and treaming space from the original string 
        System.out.print("treaming space in string ::"+name);
        System.out.println(name.trim());

        //return a string from start index to the start index is included and end is excluded 
        System.out.println("insert the SubString ::"+name);
        System.out.println(name.substring(sc.nextInt(),sc.nextInt()));

        //return a new string after replacing caracters
        System.out.println(" replace the character ::"+name);
        System.out.println(name.replace(str1, name));

        //(Happy)return true if name start with string--> "Ha" true in this case
        System.out.println("character is present in front or not ::"+name);
        System.out.println(name.startsWith(sc.next()));
        
        //(happy) return true if name end with string "ry" --> false
        System.out.println("end char is not ::");
        System.out.println(name.endsWith(sc.next()));
        
        //return true if given string is equal or not --> it case senstive 
       
        System.out.println(name.equals("enter the string to comparision::"+sc.next()));
    }  
}
