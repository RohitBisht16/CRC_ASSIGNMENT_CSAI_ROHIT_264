import java.util.Scanner;

public class digsum {
      public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number=");
    int num = sc.nextInt();
    int dig = 0 , sum = 0;
    while(num >0){
        dig = num%10;
        sum += dig;
        num = num/10;

    }
    System.out.print(sum);







}}
