import java.util.*;

public class StringIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to check : ");
        String str = sc.nextLine();
        isPalindrome(str);
        sc.close();
        
    }
    public static void isPalindrome(String str) {
        int i, j;
        for (i = str.length() - 1, j = 0; i >= 0 && j < str.length(); i--, j++) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("String is not Palindrom");
                return;
            }
        }
        System.out.println("String is Palindrom");
    }
}
