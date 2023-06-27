import java.util.*;
public class StrLastOcc{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String");
    String str=sc.nextLine();;
    System.out.println("The Last occcured character is: "+str.charAt(str.length()-1));
  }
}