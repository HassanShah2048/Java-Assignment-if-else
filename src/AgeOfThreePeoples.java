import java.util.Scanner;
public class AgeOfThreePeoples {
    public void calculateAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The age of first Person :");
        int age1=scanner.nextInt();
        System.out.print("Enter the age of second Person :");
        int age2=scanner.nextInt();
        System.out.print("Enter the age of third Person :");
        int age3=scanner.nextInt();
        if (age1>age2 && age1>age3){
            System.out.println("The First person is oldest whoes age is:"+age1);
        } else if (age2>age1 && age2>age3) {
            System.out.println("The Second person is oldest whoes age is :"+age2);
        } else if (age3>age1 && age3>age2) {
            System.out.print("The third person is oldest whoes age is :"+age3);
        }
        if (age1<age2 && age1<age3){
            System.out.println("The first person is youngest whoes age is :"+age1);
        } else if (age2<age1 && age2<age3) {
            System.out.println("The second person is youngest whoes age is :"+age2);
        } else if (age3<age1 && age3<age2) {
            System.out.println("The third person is youngest whoes age is :"+age3);

        }
    }

}
