import java.util.Scanner;

public class SecLarge {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter all the elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int large1, large2, temp;
    large1 = arr[0];
    large2 = arr[1];
    if (large1 < large2) {
      temp = large1;
      large1 = large2;
      large2 = temp;

    }
    for (int i = 2; i < arr.length; i++) {
      if (arr[i] > large1) {
        large2 = large1;
        large1 = arr[i];
      } else if (arr[i] > large2) {
        large2 = arr[i];
      }

    }
    System.out.println("The Second large num is " + large2);
  }
}