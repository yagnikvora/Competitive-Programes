import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimension of First Matrix (Row X Column)");
        int i1 = sc.nextInt();
        int j1 = sc.nextInt();
        System.out.println("Enter dimension of Second Matrix (Row X Column)");
        int i2 = sc.nextInt();
        int j2 = sc.nextInt();

        if (j1 != i2) {
            System.out.println("Please enter valid dimension");
            System.exit(0);
        }
        int a[][] = new int[i1][j1];
        System.out.println("Enter data of First Matrix");
        for (int i = 0; i < i1; i++) {
            for (int j = 0; j < j1; j++) {
                System.out.print("a[" + i + "][" + j + "]:");
                a[i][j] = sc.nextInt();
            }
        }
        int b[][] = new int[i2][j2];
        System.out.println("Enter data of Second Matrix");
        for (int i = 0; i < i2; i++) {
            for (int j = 0; j < j2; j++) {
                System.out.print("b[" + i + "][" + j + "]:");
                b[i][j] = sc.nextInt();
            }
        }

        int c[][] = new int[i1][j2];
        for(int i =0 ; i< a.length ; i++){
            for(int j = 0 ; j < b[0].length; j++){
                for(int k = 0 ; k<a[0].length; k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("---------Result--------");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}