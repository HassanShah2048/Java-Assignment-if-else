import java.util.Scanner;

public class Q23 {
    public  void checkTemp(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature :");
        int temp=scanner.nextInt();
        if (temp<0){
            System.out.println("Freezing weather ");
        } else if (temp>0 && temp<=10) {
            System.out.println("Very cold weather");
        } else if (temp>10&&temp<=20) {
            System.out.println("Cold weather ");
        } else if (temp>20 && temp<=30) {
            System.out.println("Normal temperature ");
        } else if (temp>30&&temp<=40) {
            System.out.println(" Its Hot");
        } else if (temp>=40) {
            System.out.println("Very Hot");

        }
    }

}
