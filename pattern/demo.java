package pattern;

public class demo {
    public static void half_number_triangle2(int n){
        for (int i = 1; i<=n ; i++){
            for(int j= 1; j<= i ; j++){
                
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        half_number_triangle2(5);
    }
}
