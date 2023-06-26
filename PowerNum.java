import java.util.Scanner;
public class PowerNum{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Base Number");
    int base=sc.nextInt();
    System.out.println("Enter the Exponent");
    int exponent=sc.nextInt();
    long power=1;
    for(int i=1;i<=exponent;i++){
      power=power*base;
    }
    System.out.println(base +" to the power  " +exponent + " is: "+power);  
  }
}