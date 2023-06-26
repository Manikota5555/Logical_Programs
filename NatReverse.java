import java.util.Scanner;

public class NatReverse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n:");
    int n = sc.nextInt();

    System.out.println("Enter the values:");
    int[] num = new int[n];
    int i = 0;
    while (i < n) {
      num[i] = sc.nextInt();
      i++;
    }

    System.out.println("Reversed values:");
    i = n - 1;
    
    while (i >= 0) {
      System.out.println(num[i]); 
      i--;
    }
  }
}
