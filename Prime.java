import java.util.*;
public class Prime{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean s=false;
    if(n==0 && n==1){
      System.out.println("not prime number");
    }
    for(int i=2;i<=n/2;i++){
      if(n%i==0){
        s=true;
      }
    }
    if(s==false){
      System.out.println(n+" is a prime");
      
    }
    else{
      System.out.println(n+" is not a prime");
    }
  }
}