import java.util.Scanner;

public class DigitCount{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the digit");
    int n=s.nextInt();
    int rem=0;
    while(n!=0){
      n=n/10;  
      rem=rem+1;
    }
    System.out.println(rem);
  }
}