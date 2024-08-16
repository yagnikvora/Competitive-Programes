import java.util.Scanner;

public class ArmstrongNumber {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        isArmstrong(n);
        sc.close();
   }

    private static void isArmstrong(int n) {
        int len = (int)Math.log10(n)+1;
        int sum = 0,temp = n;
        while(temp>0){
            sum += (int)Math.pow((double)temp%10, (double)len);
            temp = temp/10;
        }
        if(sum == n)
            System.out.println("Number is Armstrong");
        else
            System.out.println("Number is not Armstrong");
    }
}