import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        float b = sc.nextFloat();
        System.out.print("Enter d : ");
        double d = sc.nextDouble();
        System.out.println("The numbers are : "+a+" "+b+" "+d);
        sc.close();

    }
    
}
