import java.util.Scanner;
    public class StudentAttendance {
        public void calculateAttendance1() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter held classes :");
            double heldClasses = scanner.nextInt();
            System.out.print("Enter the attended classes :");
            double attendedClasses = scanner.nextInt();
            double percentage = (attendedClasses / heldClasses) * 100;
            System.out.println(percentage);
            if (percentage < 75) {
                System.out.println("The percentage of Attendance is :"+percentage+" So This student is not allowed to sit in exam ");
            } else if (percentage>=75) {
                System.out.println("The percentage of Attendance is :"+percentage+"  So This student is allowed to sit in exam");
 }
    }
}
