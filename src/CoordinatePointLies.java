import java.util.Scanner;

public class CoordinatePointLies {
    public void checkCoordinatePointLies(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x point :");
        int x=scanner.nextInt();
        System.out.print("Enter the value of y point :");
        int y=scanner.nextInt();
        if (x>0 && y>0){
            System.out.println("it is lies in first quadrant");
        } else if (x<0 && y>0) {
            System.out.println("it is lies in second quadrant");
        } else if (x<0 && y<0) {
            System.out.println("it is lies in third quadrant");
        } else if (x>0 && y<0) {
            System.out.println("it is lies in fourth quadrant");
        }else {
            System.out.println("lies in origin");
        }

    }
}
