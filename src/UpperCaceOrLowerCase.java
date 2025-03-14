import java.util.Scanner;

public class UpperCaceOrLowerCase {
    public void checkUpperCaseOrLowerCase(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a character :");
        char chr=scanner.next().charAt(0);
        if (chr>='A' && chr<='Z'){
            System.out.println("The Entered character is in Uppercase ");
        } else if (chr>='a'&&chr<='z') {
            System.out.println("The Entered character is in LowerCase ");
        }
    }
}
