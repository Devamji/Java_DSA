package pattern;

public class rectangle_ok {

    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line after each row
        }
    }


}
