public class MaxNum1{
  public static void main(String args[]){
    int num1=42;
    int num2=78;
    int num3=86;
    if (num1 > num2 && num1 > num3) {
      System.out.println("Maxnumber is: " + num1);
    } else if (num2 > num3) {
      System.out.println("Maxnumber is: " + num2);
    } else {
      System.out.println("Maxnumber is: " + num3);
    }
  }
}