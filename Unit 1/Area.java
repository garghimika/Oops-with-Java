import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int r = sc.nextInt();
        float area = 3.14f * r * r;
        System.out.println("Area : "+area);
        sc.close();

    }
}
