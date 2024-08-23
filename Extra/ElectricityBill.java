import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Units : ");
        float units = sc.nextInt();
        float amount = 0.0F;

        //less than or equal  200
        if(units <= 200)
            amount = (float) (units * 0.80);

        //less than or equal 300
        if(units > 200 && units <= 300)
            amount = (200F * 0.8F) + (float) ((units-200)*0.90);

        //greater than 300
        if(units > 300)
            amount += (200F * 0.8F) + (100F * 0.9F) + (units-300);

        //meter charge
        amount += 100;

        //surcharge above 300 paisa
        if(amount > 300)
            amount += (float) ((amount*12.36)/100);

        System.out.println("-------------------------\nTotal Amount : "+amount+"\n-------------------------");
    }
}
