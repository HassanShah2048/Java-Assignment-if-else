import java.util.Scanner;
public class ModifyAttandance {
    public void calculateAttendance() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter held classes :");
        double heldClasses = scanner.nextInt();
        System.out.print("Enter the attended classes :");
        double attendedClasses = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Any medical issue enter 1 otherwise 0 :");
        int medicalIssue=scanner.nextInt();
        double percentage = ( attendedClasses / heldClasses) * 100;
         if (percentage>=75) {
            System.out.println("The percentage of Attendance is :"+percentage+"  So This student is allowed to sit in exam");
        } else if (medicalIssue==1 && percentage<75) {
            System.out.println("This student is allowed in exam");
        }else if (medicalIssue==0){
            System.out.println("This student is not allowed in exam");
        }
    }
}