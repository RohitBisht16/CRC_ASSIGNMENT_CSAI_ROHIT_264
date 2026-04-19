import java.util.Scanner;

public class armstrong {
      public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number=");
    int num = sc.nextInt();
    int original = num;
    int rem = 0;
    while(num>0){  
    int digit = num%10;
    rem += (digit)*(digit)*(digit);
        num = num/10;
    }
 if (original == rem) {
            System.out.println("It is an Armstrong number.");
        } else {
            System.out.println("It is not an Armstrong number.");
        }

}
}
