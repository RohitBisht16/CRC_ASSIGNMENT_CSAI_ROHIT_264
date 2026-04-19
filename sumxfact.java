import java.util.Scanner;

public class sumxfact {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = sc.nextInt();

        int original = num;
        int sumxfact = 0;

        while (num > 0) {
            int temp = num % 10;
            int fact = 1;

            for (int i = 1; i <= temp; i++) {
                fact = fact * i;
            }

            sumxfact += fact;
            num = num / 10;
        }

        System.out.println(sumxfact);

        if (original == sumxfact) {
            System.out.println("It is a strong number");
        } else {
            System.out.println("Not a strong number");
        }

        sc.close();
    }
}