import java.util.*;
public class StrConcate{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first String");
    String str1=sc.nextLine();
    System.out.println("Enter Second string");
    String str2=sc.nextLine();
    String concate=str1.concat(str2);
    System.out.println(concate);
  }
}