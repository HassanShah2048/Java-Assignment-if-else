import java.util.Scanner;
public class Q22 {
    public void calculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name :");
        String name = scanner.next();
        scanner.nextLine();
        System.out.print("Enter your rollNo :");
        double rollNo = scanner.nextDouble();
        System.out.print("Enter your obtained marks in subject 1 :");
        double marks1 = scanner.nextDouble();
        System.out.print("Enter your obtained marks in subject 2 :");
        double marks2 = scanner.nextDouble();
        System.out.print("Enter your obtained marks in subject 3 :");
        double marls3 = scanner.nextDouble();
        System.out.print("Enter your total marks :");
        double totalMarks = scanner.nextDouble();
        double totalObtainedMarks = marks1 + marks2 + marls3;
        double percentage = (totalObtainedMarks / totalMarks) * 100;
        if (percentage >= 85) {
            System.out.println(" congratulation you have firstDivision   And your percentage is :" + percentage);
        } else if (percentage > 75 && percentage < 85) {
            System.out.println("you have secondDivision And your percentage is :" + percentage);
        } else if (percentage > 65 && percentage < 75) {
            System.out.println("You have thirdDivision  And your percentage is :" + percentage);
        } else {
            System.out.println("Fail ");
        }
    }
}
