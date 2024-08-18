import java.util.Scanner;

public class AngleOfTimeInWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hour(Upto 12 hr.)  : ");
        int h = sc.nextInt();
        System.out.print("Enter Hour(Upto 60 min.)  : ");
        int m = sc.nextInt();

        if(h>12 || h<0|| m>=60 || m<0 ){
            System.out.println("Please Enter valid Time");
            System.exit(0);
        }

        calculateAngle(h,m);
    }

    private static void calculateAngle(int h, int m) {
        double angle = Math.abs((30*h)-(5.5*m));
        System.out.println("Angle : "+angle+"°");
    }
}
