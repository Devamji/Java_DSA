package Basic;
import java.util.*;
public class OPERATER_ASSIGNMENT{
    public static void main(String[] args) {
        // creat variables
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int var;

        // assign value using =
        var =a;
        System.out.println("var using = ::"+ var);

        // assign value using +=
        var += a;
        System.out.println("var using += ::"+ var);

         // assign value using *=
        var *= a;
        System.out.println("var using *=::"+ var);

         // assign value using /=
        var /= a;
        System.out.println("var using /=::"+ var);

         // assign value using -=
        var -= a;
        System.out.println("var using -=::"+ var);
    }
}