import java.util.Scanner;

public class FirstPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = 1;
        char alphabet = 'A';

        System.out.print("Enter no of rows : ");
        int n = sc.nextInt();

        for(int i = 1; i<=n;i++){
            int flag = 1;
            for(int j = 1;j<=2*n-1;j++){
                if(j>=n+1-i && j<=n-1+i && flag == 1){
                    if(i%2 != 0){
                        System.out.print(no);
                        no++;
                    }
                    else{
                        System.out.print(alphabet);
                        alphabet++;
                    }
                    flag = 0;
                }
                else{
                    System.out.print(" ");
                    flag = 1;
                }
            }
            System.out.println();
        }
    }
}
