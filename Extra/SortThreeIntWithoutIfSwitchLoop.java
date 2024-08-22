import java.util.Scanner;

public class SortThreeIntWithoutIfSwitchLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();
        System.out.print("Enter C : ");
        int c = sc.nextInt();

        int first = (a<b && a<c) ? a : (b<c) ? b : c;
        int last = (a>b && a>c) ? a : (b>c) ? b : c;
        int middle = (a>first && a<last) ? a : (b>first && b<last) ? b : c;

        System.out.println(first+","+middle+","+last);
    }
}
