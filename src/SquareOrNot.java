import java.util.Scanner;
public class SquareOrNot {
    public void checkSquare(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter length :");
        int length=scanner.nextInt();
        System.out.print("enter breadth :");
        int breadth=scanner.nextInt();
        if (length==breadth){
            System.out.println("It is square :");
        }else {
            System.out.println("Not a square");
        }
    }
}
