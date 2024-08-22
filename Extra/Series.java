import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of steps : ");
        int n = sc.nextInt();
        generateSeries(n);
    }

    private static void generateSeries(int n) {
        int value = 0;
        for(int i=1;i<=n;i++){
            value += i;
            System.out.print(value+",");
        }
    }
}
