import java.util.Scanner;

public class Q30 {
    private int num;
    public void setNum(int num){
        this.num=num;
    }
    public int getNum(){
        return num;
    }
    Q30(){

    }
    Q30(int num){
        this.num=num;
    }
    public void checkDivisible(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :");
        setNum(scanner.nextInt());
        if (getNum()%5==0 && getNum()%11==0){
            System.out.println("The number is divisible by 5 and 11");
        }else {
            System.out.println("Thus number is not divisible by 5 and 11");
        }
    }

}