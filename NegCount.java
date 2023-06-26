import java.util.*;
public class NegCount {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter how many numbers do you want");
    int n=sc.nextInt();
    int arr[]=new int[n];
    int count=0;
    for(int i=0;i<n;i++){
      System.out.println("Enter the numbers");
      arr[i]=sc.nextInt();
      
    }
    for(int i=0;i<n;i++){
      if(arr[i]<0){
        count++;
       
    }
    }
     System.out.println(count);
    
    
  }
}