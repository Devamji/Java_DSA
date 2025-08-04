package pattern;

public class Invert_half_triangle_no {
    public static void invert_triangle(int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i+1 ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invert_triangle(5);
    }
}
