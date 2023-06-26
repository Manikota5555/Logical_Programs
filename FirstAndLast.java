import java.util.*;
public class FirstAndLast{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int num=sc.nextInt();
    int lastDigit=num%10;
    while(num>10){
      num=num/10;
    }
    System.out.println("The first Digit is "+num);
    System.out.println("The LastDigit is "+lastDigit);
  }
}