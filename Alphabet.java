import java.util.Scanner;
public class Alphabet{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Alphabet");
    String str=sc.nextLine();
    //int alpha=0;
    
     for(int i=0;i<str.length();i++){
        Character ch=str.charAt(i);
       if ((ch >= 'a' &&  ch <= 'z') || (ch>= 'A' &&  ch <= 'Z')){
       System.out.println("given character is alphabet");
//alpha++;
     }else{
       System.out.println("given character is not alphabet");
     }
     }
  }
}