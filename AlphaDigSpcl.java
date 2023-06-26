import java.util.Scanner;
public class AlphaDigSpcl{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a character");
    String str=sc.nextLine();
		int alpcount=0;
		int digitscount=0;
		int specialcharactercount=0;
		int n=0;
		for(int i=0;i<str.length();i++) {
			char ch=Character.toLowerCase(str.charAt(i));
			if(ch>='a' && ch<='z') {
				System.out.println(ch+" given character is alphabet");
			}
			else if(n==0) {
        for(int j=0;j<n;j++){
          n++;
        }
				System.out.println(ch+" given character is digits");
			}
			else {
				System.out.println(ch+" given character is special character");
			}
		}
		
		
		

  }
}