import java.util.Scanner;

public class Q26 {
    public void check(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any character :");
        char chr=scanner.next().charAt(0);
        if ((chr>='a'&&chr<='z')||(chr>='A'&&chr<='Z')){
            System.out.println("You entered a Alphabet ");
        } else if (chr>='0'&&chr<='9') {
            System.out.println("you entered a digit");
        }else {
            System.out.println("you entered any special character");
        }
    }
}