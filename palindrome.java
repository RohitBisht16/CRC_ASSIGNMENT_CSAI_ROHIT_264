import java.util.*;
public class palindrome {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number=");
    int a = sc.nextInt();
    int original = a;
    int reverse = 0;

    while(a>0){
         int digit = a%10;
         reverse = reverse * 10 + digit;
         a =  a / 10;
        
    }
    if(original==reverse){
    System.out.println("it is a palindrome.");
    }else{
        System.out.println("it is not a palindrome");
    }
    sc.close();



}
}
