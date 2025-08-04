package pattern;

public class demo_2 {
    public static void half_number_triangle(int n){
        for (int i = 1; i<=n ; i++){
            for(int j= 1; j<= n-i+1 ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        half_number_triangle(5);
    }
}
