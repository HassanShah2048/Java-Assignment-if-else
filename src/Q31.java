import java.util.Scanner;

public class Q31 {
    //    Scanner scanner = new Scanner(System.in);
    private int MonthNumber;
    public void setMonthNumber(int monthNumber) {
        this.MonthNumber = monthNumber;
    }
    public int getMonthNumber() {
        return MonthNumber;
    }
    Q31(){

    }
    Q31(int monthNumber) {
        MonthNumber = monthNumber;
    }

    public void checkDays() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month number :");
        setMonthNumber(scanner.nextInt());
        if (getMonthNumber() == 1) {
            System.out.println("The number of days in this month are 31");
        } else if (getMonthNumber() == 2) {
            System.out.println("The number of days in this month are 28");
        } else if (getMonthNumber() == 3) {
            System.out.println("The number of days in this month are 31");
        } else if (getMonthNumber() == 4) {
            System.out.println("The number of days in this month are 30");
        } else if (getMonthNumber() == 5) {
            System.out.println("The number of days in this month are 31");
        } else if (getMonthNumber() == 6) {
            System.out.println("The number of days in this month are 30");
        } else if (getMonthNumber() == 7) {
            System.out.println("The number of days in this month are 31");
        } else if (getMonthNumber() == 8) {
            System.out.println("The number of days in this month are 30");
        } else if (getMonthNumber() == 9) {
            System.out.println("The number of days in this month are 30");
        } else if (getMonthNumber() == 10) {
            System.out.println("The number of days in this month are 31");
        } else if (getMonthNumber() == 11) {
            System.out.println("The number of days in this month are 30");
        } else if (getMonthNumber()==12){
            System.out.println("The number of days in this month are 31");
        }
        else {
            System.out.println("you entered a wrong number");
        }
    }
}