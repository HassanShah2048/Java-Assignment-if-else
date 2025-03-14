import java.util.Scanner;

public class Q24 {
    public void checkTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first angle size :");
        double side1 = scanner.nextDouble();
        System.out.print("Enter a second angle size :");
        double side2 = scanner.nextDouble();
        System.out.print("Enter a third angle size :");
        double side3 = scanner.nextDouble();
        double sum=side1+side2+side3;
        if ((side1==side2&&side2==side3)&&(sum<=180)){
            System.out.println("The triangle is  Equilateral");
        } else if ((side1==side2||side1==side3||side2==side3)&&(sum<=180)) {
            System.out.println("The triangle is Isosceles ");
        } else {
            System.out.println("The triangle is Scalene");
        }
    }
}
