import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
      int n=0;
        int[] arr = new int[10]; 

        while (num != 0) {
            int lastDigit = num % 10;
           arr[lastDigit]++;
            num = num / 10; 
        }

        System.out.println("Frequency of digits:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println(i + ": " + arr[i]);
            }
        }
    }
}
