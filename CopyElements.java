import java.util.Scanner;

public class CopyElements {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("How many values do you want to enter");
    int n = s.nextInt();

    int arr[] = new int[n];
    System.out.println("Enter " + n + " values");
    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
    }

    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}