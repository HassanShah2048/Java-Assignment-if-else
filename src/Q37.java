import java.util.Scanner;

public class Q37 {
    private int num1;
    private int num2;

    private int num3;

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    Q37(){

    }
    Q37(int num1){
        this.num1=num1;
    }
    Q37(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public void check(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number 1 :");
        int num11=scanner.nextInt();
        setNum1(num11);
        System.out.print("enter number 2 :");
        int num22=scanner.nextInt();
        setNum2(num22);
        System.out.print("enter number 3 :");
        int num33=scanner.nextInt();
        setNum3(num33);
        if (getNum1()>getNum2()&&getNum2()>getNum3()){
            System.out.println("The number is in decreasing order");
        }else if (getNum1()<getNum2()&&getNum2()<getNum3()){
            System.out.println("The number is in increasing order");
        }else {
            System.out.println("error because the entered numbers are not both increasing or decreasing form");
        }
    }
}
