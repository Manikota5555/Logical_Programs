import java.util.*;

public  class Grades{
  public static void main(String args[]){
    Scanner s=new Scanner (System.in);
    System.out.println("enter the 5 subjects Marks");
    System.out.println("enter physics marks");
    int Physics=s.nextInt();
    System.out.println("enter the  chhemistry marks");
    int Chemistry=s.nextInt();
    System.out.println("enter the  biology marks");
    int Biology=s.nextInt();
    System.out.println("enter the  mathematics marks");
    int Mathematic=s.nextInt();
   System.out.println("enter the  computer marks");
    int computer=s.nextInt();
    int totalmarks=Physics+Chemistry+Biology+Mathematic+computer;
    System.out.println("Total marks is "+totalmarks);
    int percentage=(totalmarks*100)/500;
    System.out.println("Percentage is "+percentage);
    if(percentage>=90){
      System.out.println("GRADE A");
    }
    else if(percentage>=80){
      System.out.println("GRADE B");
    }
    else if(percentage>=70){
      System.out.println("GRADE C");
      }
      else if(percentage>=60){
      System.out.println("GRADE D");
      }
      else if(percentage>=40){
      System.out.println("GRADE E");
      }
      else if(percentage<40){
      System.out.println("GRADE F");
      }
      
  }
}