import java.util.Scanner;

public class DeletSpecificInd {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of array:");
    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
      System.out.println("Enter the number " + (i + 1) + ":");
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter the index to delete:");
    int index = sc.nextInt();

    if (index < 0 || index >= arr.length) {
      System.out.println("Invalid index!");
    } else {
      int arr1[] = new int[n - 1];
      int j = 0;

      for (int i = 0; i < arr.length; i++) {
        if (i != index) {
          arr1[j] = arr[i];
          j++;
        }
      }

      System.out.println("Array after deleting element at index " + index + ":");
      for (int i = 0; i < arr1.length; i++) {
        System.out.println(arr1[i]);
      }
    }
  }
}
