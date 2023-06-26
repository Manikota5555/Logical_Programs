import java.util.*;
public class FiveAndEleven{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    if(n%5==0 || n%11==0){
      System.out.println("number is divisible by '5' & '11'");
    }
    else{
      System.out.println("number is not divisible by '5' & '11'");

    }
  }
}