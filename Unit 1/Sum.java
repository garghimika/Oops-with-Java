import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        int sum = (a % 10) + (a / 10 % 10) + (a / 100);
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
