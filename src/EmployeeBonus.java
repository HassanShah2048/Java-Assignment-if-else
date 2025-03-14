import java.util.Scanner;

public class EmployeeBonus {
    public void setBonus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your current salary :");
        int salary = scanner.nextInt();
        System.out.print("Enter service in Company :");
        int service = scanner.nextInt();
        scanner.nextLine();
        if (service > 5) {
            int bonus=(salary/100)*5;
            int totalSalary= bonus+salary;
            System.out.println("your experience is more then five years so now your Salary is :"+totalSalary+"  And the bonus is :"+bonus);
        }else {
            System.out.println("your experience si less than five years so your salary is :"  +salary+" And No bonus added");
        }
    }
}