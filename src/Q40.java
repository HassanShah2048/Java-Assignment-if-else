import java.util.Scanner;

public class Q40 {
    private int days;

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    Q40(){}
    Q40(int days){
        this.days=days;
    }
    public void checkFine(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number of late days :");
        setDays(scanner.nextInt());
        if (getDays()>=1 && getDays()<=5){
            System.out.println("Your fine is 50 paisa");
        } else if (getDays()>=6 && getDays()<=10){
            System.out.println("your fine is 1 rupee");
        } else if (getDays()>10&& getDays()<=29){
            System.out.println("your fine is 5 rupees");
        } else if (getDays()>=30){
            System.out.println("your membership is cancelled because you return the book after 30 days");
        }else {
            System.out.println("error");
        }
    }
}
