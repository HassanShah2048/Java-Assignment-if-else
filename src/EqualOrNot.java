import java.util.Scanner;
public class EqualOrNot {
    public void checkInteger(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter first integer  :");
        int firstInteger=scanner.nextByte();
        System.out.print("enter second integer :");
        int secondInteger=scanner.nextInt();
        if (firstInteger-secondInteger==0){
            System.out.println("The entered two numbers are equal");
        }else {
            System.out.println("The entered two numbers are not equal ");
        }
    }

}
