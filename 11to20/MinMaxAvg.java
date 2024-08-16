
import java.util.Scanner;

public class MinMaxAvg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of n : ");
        int n = sc.nextInt();
        int min,max,avg,sum,no;
        no = sc.nextInt();
        min=max=sum=no;
        for(int i = 1;i<n;i++){
            no = sc.nextInt();
            if(max < no)
                max = no;
            if(min > no)
                min = no;
            sum += no;
        }
        System.out.println("\nMinimum : "+min+"\nMaximum : "+max+"\nAvarage : "+((double)sum/(double)n));
    }
}