import java.util.Scanner;
public class DisplayTheValueOfN {
    public void displayN(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of m :");
        int m=scanner.nextInt();
        if (m>0){
            System.out.println("The value of n is 1");
        } else if (m==0) {
            System.out.println("The value of n is 0");
        } else if (m<0) {
            System.out.println("The value of n is -1");
        }
        else {
            System.out.println("error");
        }

    }
}
