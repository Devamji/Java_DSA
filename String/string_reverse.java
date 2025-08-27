package String;

public class string_reverse {
    public static String reverse(String str) {
        String reversed = "";                           
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);  
        }
        return reversed;
    }

    public static void main(String[] args) {
        String str = "hello";

        String result = reverse(str);
        
        System.out.println("normal String: " + str);
        System.out.println("reversed String: " + result);
    }
}



   


