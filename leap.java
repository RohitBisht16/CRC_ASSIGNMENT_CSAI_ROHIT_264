import java.util.*;
public class leap{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter year=");
        int year = sc.nextInt();
        if(year%400 == 0 ){
            System.out.print("leap year");
        }else if (year%100== 0 ){
            System.out.print(" not a leap year");
        }else if (year%4 == 0 ){
            System.out.print("leap year");
        }else{
        System.out.print("not a leap year");}
        }
        
        }

}