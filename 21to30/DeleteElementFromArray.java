import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int[] a = new int[size];

        for(int i = 0;i<size;i++){
            System.out.print("a["+i+"]:");
            a[i]=sc.nextInt();
        }

        System.out.print("Enter value to delete : ");
        int val = sc.nextInt();

        int res = deleteElement(a,val);

        if(res == 1){
            System.out.println("Element is Deleted\n");
            printArray(a,a.length-1);
        }
        else{
            System.out.println("Element is not found\n");
            printArray(a,a.length);
        }
    }


    private static int deleteElement(int[] a, int val) {
        for(int i = 0; i<a.length ; i++){
            if(a[i] == val){
                int temp = i;
                while(temp < a.length-1){
                    a[temp] = a[temp+1];
                    temp++;
                }
                return 1;
            }
        }
        return 0;
    }
    private static void printArray(int[] a, int length) {
        for (int i = 0 ; i<length;i++)
            System.out.print(a[i] + ",");

    }
}
