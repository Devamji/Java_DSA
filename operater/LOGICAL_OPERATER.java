package Basic;

public class LOGICAL_OPERATER {
    public static void main(String[] args) {
        
        //&& operater
        System.out.println((5 > 3)&&(8>5));
        System.out.println((5>3) && (8<5));

        // || operater
        System.out.println((5 < 3)||(8>5));
        System.out.println((5 > 3)||(8<5));
        System.out.println((5 < 3)||(8<5));

        // ! operater
        System.out.println(!(5 == 3));
        System.out.println(!(5 > 3));
    }
}
