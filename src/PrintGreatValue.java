import java.util.Scanner;

public class PrintGreatValue {
    public void checkGeatValue(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter first number :");
        int number1=scanner.nextInt();
        System.out.print("enter second number :");
        int number2=scanner.nextInt();
        if (number1>number2){
            System.out.println(number1+ " is greater number");
        }else if (number2>number1){
            System.out.println(number2+ " is greater number");
        }else {
            System.out.println("both are equal");
        }

    }
}
