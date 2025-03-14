import java.util.Scanner;

public class AbsoluteValue {
    public  void checkAbsoluteValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number :");
        int number=scanner.nextInt();
        if (number<0){
            System.out.println(-number);
        }else {
            System.out.println(number);
        }

    }

}
