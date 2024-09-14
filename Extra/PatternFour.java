//Enter value of counter: 4
//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4

import java.util.Scanner;

public class PatternFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of counter: ");
        int counter = scanner.nextInt();
        int size = 2 * counter - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int value = counter - Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

}
