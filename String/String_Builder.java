package String;
import java.util.*;
public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0 
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // insert in string
        sb.insert(2,'n');
        System.out.println(sb);

        //delet the extera 'n'
        sb.delete(2,4);
        System.out.println(sb);

        //append the string or character
        sb.append("a");
        System.out.println(sb);

        
    }
}
