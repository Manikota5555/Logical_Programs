import java.util.Scanner;

public class StrAlphaDigSpcl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int alpCount = 0;
        int digitsCount = 0;
        int specialCharacterCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                System.out.println(ch + " is an alphabet.");
                alpCount++;
            } else if (Character.isDigit(ch)) {
                System.out.println(ch + " is a digit.");
                digitsCount++;
            } else {
                System.out.println(ch + " is a special character.");
                specialCharacterCount++;
            }
        }

        System.out.println("Alphabets count: " + alpCount);
        System.out.println("Digits count: " + digitsCount);
        System.out.println("Special characters count: " + specialCharacterCount);
    }
}
