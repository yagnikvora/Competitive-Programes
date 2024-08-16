import java.util.*;

public class CountOddEvenFromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        countOddEven(n);
        sc.close();
    }

    private static void countOddEven(int n) {
        int odd=0,even=0;
        while(n>0){
            if((n%10)%2 == 0)
                even++;
            else   
                odd++;
            n = n/10;
        }
        System.out.println("Odds : "+odd+"\nEven : "+even);
    }
}
