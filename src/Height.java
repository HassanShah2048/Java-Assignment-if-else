import java.util.Scanner;

public class Height {
    public void calculateHeight(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your height in cm :");
        float height=scanner.nextFloat();
        if (height<=150){
            System.out.println("your height is small");
        } else if (height>=150 && height<=180) {
            System.out.println("your height is normal");
        }else {
            System.out.println("you are tall");
        }

    }
}
