package pattern;

public class Hollow_rectrangle {
    public static void hollow () {
        for (int i = 1; i<=5; i++){
            for(int j = 1 ; j<= 5 ; j++){
                if (i==1 || i == 5 || j == 1|| j == 5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        
    }
    public static void main(String[] args) {
        hollow();
    }
}
