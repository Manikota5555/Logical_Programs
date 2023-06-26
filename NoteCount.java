import java.util.Scanner;
public class NoteCount{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the Withdraw amount");
    int amount=s.nextInt();
    if(amount%100==0){
      if(amount<=10000){
        int five=amount/500;
        amount=amount%500;
        int two=amount/200;
        amount=amount%200;
        int one=amount/100;
        amount=amount%100;
        int min=five+two+one;
        System.out.println("five hundreds note count is: "+five);
        System.out.println("two hundreads note count is: "+two);
        System.out.println("one hundreads note count is: "+one);
        System.out.println("total notes of count is: "+min);


      }
    }
    else{
      System.out.println("Entered amount must be in multiples of 100");
    }
  }
}