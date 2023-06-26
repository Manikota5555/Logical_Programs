import java.util.*;

public class EleUnitCharges{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the unit consumed");
    int unit=s.nextInt(); 
    Double amt1,amt2,amt3,amt4;
    Double surcharge;
    if(unit<=50){
      amt1=0.50*unit;
     System.out.println("the bill amount is" +amt1);
      surcharge=(amt1/100)*20+amt1;
      System.out.println("the additional surcharge of 20% is added to the bill   " );
      System.out.println("the bill is   " +surcharge);
    }
     else if(unit>=50 && unit<=100){
       unit=unit-50;
       amt2=unit*0.75+(50*0.50);
       surcharge=(amt2/100)*20+amt2;
         System.out.println("the bill amount is" +amt2);
      System.out.println("the additional surcharge of 20% is added to the bill   " );
      System.out.println("the bill is   " +surcharge);
    }
    else if(unit>=100 && unit<=250){
      unit=unit-100;
      amt3=unit*1.20+(50*0.50)+(100*0.75);
      surcharge=(amt3/100)*20+amt3;
        System.out.println("the bill amount is" +amt3);
      System.out.println("the additional surcharge of 20% is added to the bill   " );
      System.out.println("the bill is   " +surcharge);
    }
    else if(unit>=250){
      unit=unit-250;
      amt4=unit*1.50+(0.50*50)+(0.75*100)+(1.20*150);
      surcharge=(amt4/100)*20+amt4;
        System.out.println("the bill amount is" +amt4);
      System.out.println("the additional surcharge of 20% is added to the bill   " );
      System.out.println("the bill is   " +surcharge);
    }
    
    }
  }