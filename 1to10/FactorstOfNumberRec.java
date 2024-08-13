import java.util.*;

public class FactorstOfNumberRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        System.out.print("Factors : ");
        printFactors(n, 1);
        sc.close();
    }

    private static void printFactors(int n, int i) {
        if (i > n)
            return;

        if(n%i ==0)
            System.out.print(i+",");

        printFactors(n, i+1);
    }
}
