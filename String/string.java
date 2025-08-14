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

        // if we want to ignore the upper and lower case in the string then we use.
        
        System.out.println(str.equalsIgnoreCase(str2));

        String m = "a";//ASIC value is 97
        String n = "A";// ASIC value is 65    // isko ye first convert karega ASIC value mai then compair karega ( 97 - 65)
        // in this case if 0 come then m = n 
        // if positive value come then m > n
        // if negative value come then m < n
        System.out.println(m.compareTo(n));

        //indexOf() mathord is used to give the index position of the character or string 
        System.out.println(str.indexOf("v"));

        // lastIndexOf() mathord is use to find the index from the last element 
        String str3 = "deepak";
        System.out.println(str3.lastIndexOf("e")); 
        System.out.println(str3.indexOf("e"));

        //contains() methord is use to shearch the element in string 
        System.out.println(str.contains("a"));

        //charAt() matherd is used to find the element or characher 
        System.out.println(str.charAt(3)); // it ask index 3 par kya hai.
    
        //Cancatination are use to mearge the two different string or characters in one string
        String a= "Devam";
        String b = "mishra";
        System.out.println(a.concat(b));

        //isEmpty() meathord is use to see the given string are empty or not
        String o = "Hello";
        String p = "";
        System.out.println(o.isEmpty());
        System.out.println(p.isEmpty());

        //join() meathord is use to join the multiple string or character in one string.
        // delimiter is use to seprate the element. 
        String name1 = String.join(" ", "Devam", "Mishra", "age", "is","20");
        System.out.println(name1);
    }  
}


