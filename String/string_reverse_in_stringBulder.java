package String;

public class string_reverse_in_stringBulder {
        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder("hello");
            for (int i=0; i<sb.length()/2; i++){              // string ko half mai divided kar denge 
                int front = i;
                int back = sb.length() -1 - i;                // dono part ko reverse kar arhe hai. 

                char frontChar = sb.charAt(front);
                char backChar = sb.charAt(back);

                sb.setCharAt(front,   backChar);
                sb.setCharAt(back, frontChar);
            }

            System.out.println(sb);
        }
}

