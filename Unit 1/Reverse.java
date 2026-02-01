import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        int reverse = (a % 10) * 100 + (a / 10 % 10) * 10 + (a / 100);
        System.out.println("Reverse = " +reverse);
        sc.close();
        
    }
}
