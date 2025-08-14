package String;

// for (i=1, i< str.length; i++)
// if(largest.compare To (str[i]<0)
//largest = str[i]

public class Largest_string {
    public static void main(String[] args) {
        String str[] = {"Apple","Banana","mango"};  // we make a string 
        String largest = str[0];  //initialize kar rahe hai str ke char ko 0
        for(int i=1; i< str.length; i++){      // i, 1 se le ke str.length tak chalaga aur baad mai i ka increment kar dange (i++) se " i++" is i = i+1
            if (largest.compareTo(str[i])< 0){  // largest aur str[i] ko alphabetically compare karenge. compareTo() agar < 0 deta hai, iska matlab largest chhota hai aur str[i] bada hai
                largest = str[i];
            }
        }
        System.out.println(largest);
    }

}
