import java.util.*;
public class BasicSalary{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the basic salary");
    int Bsalary=s.nextInt();
    int hra, da,Grosssalary;
    if(Bsalary<=10000){
      hra=(Bsalary*20)/100;
      da=(Bsalary*80)/100;
      Grosssalary=Bsalary+hra+da;
      System.out.println("the Gross salary is " +Grosssalary);
    }
    else if(Bsalary<=20000){
       hra=(Bsalary*25)/100;
      da=(Bsalary*90)/100;
      Grosssalary=Bsalary+hra+da;
      System.out.println("the Gross salary is " +Grosssalary);
    }
    else if(Bsalary>20000){
       hra=(Bsalary*30)/100;
      da=(Bsalary*95)/100;
      Grosssalary=Bsalary+hra+da;
      System.out.println("the Gross salary is " +Grosssalary);
  }
}
}