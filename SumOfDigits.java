import java.util.*;

public class SumOfDigits{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number");
    int n=s.nextInt();
    int sum=0,rem=0;
    while(n>0){
       rem=n%10;
      sum=sum+rem;
      n=n/10;

    }
     System.out.println("the sum of digits is: " +sum);
  }

}