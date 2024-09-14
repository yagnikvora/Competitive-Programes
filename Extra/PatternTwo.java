//Enter a String : yagnik
//        y
//        y a
//        y a g
//        y a g n
//        y a g n i
//        y a g n i k
import java.util.Scanner;

public class PatternTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.next();
        for(int i= 0; i< str.length();i++){
            for(int j = 0; j<=i; j++){
                System.out.print(str.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}
