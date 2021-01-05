import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhap canh a");
            double sideA = scanner.nextDouble();
            System.out.println("Nhap canh b");
            double sideB = scanner.nextDouble();
            System.out.println("Nhap canh c");
            double sideC = scanner.nextDouble();
            Triangle triangle = new Triangle(sideA, sideB, sideC);
        } catch (IllegalTriangleException c) {
            System.out.println(c.getMessage());
        }
    }
}
