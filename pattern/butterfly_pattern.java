package pattern;

public class butterfly_pattern {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1; i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //space
            for(int j= 1;j<= 2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j =1 ; j<= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for(int i = n-1 ; i>=1; i--){
            for(int j= 1; j<=i; j++){
                System.out.print("*");
            }
            //Space
            for(int j=1;j<= 2*(n-i);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
