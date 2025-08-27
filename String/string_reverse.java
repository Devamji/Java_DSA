package String;

public class string_reverse {
        // public static void main(String[] args) {
        //     StringBuilder sb = new StringBuilder("hello");
        //     for (int i=0; i<sb.length()/2; i++){
        //         int front = i;
        //         int back = sb.length() -1 - i;

        //         char frontChar = sb.charAt(front);
        //         char backChar = sb.charAt(back);

        //         sb.setCharAt(front,   backChar);
        //         sb.setCharAt(back, frontChar);
        //     }

        //     System.out.println(sb);
        // }

   
    
    
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



   

