import java.util.Scanner;
public class EvenOdd {
    public void checkEvenOdd(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number :");
        int number=scanner.nextInt();
        if (number%2==0){
            System.out.println("The number is Even");
        }else {
            System.out.println("the number is Odd");
        }
    }
}
