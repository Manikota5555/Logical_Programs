import java.util.*;
public class EvenOddCount{
 public static void main(String args[]){
    Scanner s=new Scanner (System.in);
    System.out.println("enter the length of the array ");
    int n=s.nextInt();
    System.out.println("enter  the elements of the array");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
   int evencount=0;
   int oddcount=0;
   for(int i=0;i<n;i++){
     if(arr[i]%2==0){
       evencount=evencount+1;
     }
     else if(arr[i]%2!=0){
       oddcount=oddcount+1;
     }
   }
   System.out.println("the even count in an array" +evencount);
      System.out.println("the odd count in an array" +oddcount);
 }
}