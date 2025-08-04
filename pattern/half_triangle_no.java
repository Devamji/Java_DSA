package pattern;

public class half_triangle_no {
    public static void half_number_triangle(int n){
        for (int i = 1; i<=n ; i++){
            for(int j= 1; j<= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        half_number_triangle(5);
    }
}
