import java.util.*;
public class NaturalNumbers{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n=sc.nextInt();
    System.out.println("Natural numbers from 1 to " + n + " are:");
    int i=1;
    while(i<=n){
      
      System.out.print(i+" ");
      i++;
    }
    
  }
}