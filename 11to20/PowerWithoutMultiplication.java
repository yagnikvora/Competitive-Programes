import java.util.Scanner;

public class PowerWithoutMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base : ");
        int base = sc.nextInt();
        System.out.print("Enter Power : ");
        int power = sc.nextInt();
        int ans = calculate(base,power);
        if(ans < 0)
            System.out.println("Please enter small inputs, This program is not made for big inputs");
        else
            System.out.println(base+"^"+power+": "+ans);

    }

    private static int calculate(int base, int power) {

        if(base == 0)
            return 0;

        if(power == 0)
            return 1;

        if(power == 1)
            return base;

        int ans=base;
        int b = base;
        for(int i = 1;i<power;i++){
            for(int j = 1;j<base;j++)
                ans += b;
            b = ans;
        }
        return ans;
    }
}
