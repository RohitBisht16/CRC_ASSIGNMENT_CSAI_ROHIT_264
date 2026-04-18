import java.util.Scanner;

public class PrimeN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int n = sc.nextInt();

      
        
      
        
      for(int  a = 2; a<=  n ; a++){
              int count = 0;
        for (int i = 1; i<=n; i++) {
            if (a % i == 0) {
                count++;
                
           }

            
        }

        if (count == 2) {
          
            System.out.println(a+" ");

        } }

        sc.close();
    }
}