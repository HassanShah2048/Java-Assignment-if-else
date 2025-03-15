import java.util.Scanner;

public class Q29 {

    private int number;
    public void setNumber(int number){
        this.number=number;
    }public int getNumber(){
        return number;
    }
    public Q29(){

    }

    Q29(int number) {
        this.number = number;
    }
    public void checkNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :");
        setNumber(scanner.nextInt());
        if (getNumber()<0){
            System.out.println("You entered a negative number");
        } else if (getNumber()>0) {
            System.out.println("You entered a positive number");
        }else {
            System.out.println("You entered a zero");
        }
    }
}
