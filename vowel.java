import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("enter character=");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
            System.out.println("it is A vowel");
        
        }else{
            System.out.println("consonant");
        }
         
    }
}
