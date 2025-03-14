import java.util.Scanner;
public class EligibleForVote {
    public  void checkEligibilityForVote(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age=scanner.nextInt();
        if (age>=18){
            System.out.println("You are eligible for Vote");
        }
        else {
            System.out.println("You are not eligible for vote ");
        }

    }
}
