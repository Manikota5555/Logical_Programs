import java.util.*;
public class UppLowcase{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Character");
    char ch=sc.next().charAt(0);
    if(ch>='A' && ch<='Z'){
      System.out.println(ch+" The Character is Upper case");
    }
    else if(ch>='a' && ch<='z'){
      System.out.println(ch+" The Character is Lower Case");
    }
    else{
      System.out.println("given character is not an alphabet");
    }
  }
}