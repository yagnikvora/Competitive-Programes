import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary format to convert in decimal : ");
        String binary = sc.next();
        int ans = convertToDecimal(binary);
        if(ans >=0)
            System.out.println("Decimal of "+binary+" is : "+ans);
        else
            System.out.println("Please enter Binary format");
    }

    private static int convertToDecimal(String binary) {
        int res = 0;
        for(int i = binary.length()-1,j=0 ; i>=0 ; i--,j++){
            int bit = Integer.parseInt(String.valueOf(binary.charAt(i)));
            if(bit > 1){
                return -1;
            }
            res += (bit)*Math.pow(2,j);
        }
        return res;
    }
}
