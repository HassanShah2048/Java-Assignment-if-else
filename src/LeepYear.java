import java.util.Scanner;

public class LeepYear {
    public void checkLeepYear(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year :");
        int year=scanner.nextInt();
        if ((year%4==0  &&  year%100!=0)||(year%400==0)){
            System.out.println("Leep Year");
        }else {
            System.out.println("Not a Leep Year");
        }

    }
}
