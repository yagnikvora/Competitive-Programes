public class PatternThree {
    public static void main(String[] args) {
        int currentValue = 1;
        for (int i = 1; i <= 5; i++) {
            int value = currentValue;
            for (int j = 1; j <= i; j++) {
                System.out.print(value + " ");
                value += (5 - j);
            }
            currentValue++;
            System.out.println();
        }
    }
}
