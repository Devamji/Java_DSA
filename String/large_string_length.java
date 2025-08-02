package String;

public class large_string_length {
    public static void main(String[] args) {
        String str = "Apple,Banana,Mango";
        String[] words = str.split(",");

        int maxLength = 0;
        String longestWord = "";

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i] + " - Length: " + words[i].length());

            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
                longestWord = words[i];
            }
        }

        System.out.println("Longest word: " + longestWord + " - Length: " + maxLength);
    }
}
