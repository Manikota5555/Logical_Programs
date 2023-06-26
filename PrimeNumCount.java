import java.util.*;
public class PrimeNumCount{
   public static void main (String[] args) {		
     Scanner s=new Scanner (System.in);
     System.out.println("enter the number");
     int n=s.nextInt();
       int num =0;
       int primeNumbers=0;
       for (int i=1;i<=n; i++){ 		  	  
          int count=0; 	  
          for(num =i; num>=1; num--){
            if(i%num==0){
              count=count+1;
            }
          }
         if (count==2){
           primeNumbers = primeNumbers + i;
         }
       }	
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers);
   }
}