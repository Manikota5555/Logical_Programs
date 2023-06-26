import java.util.*;
public class SumOfNatNum{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value of n");
    int n=sc.nextInt();
    int sum=0;
    int num=1;
    while(num<=n){
      sum=sum+num;
      num=num+1;
    }
    System.out.println(sum);
  }
}

