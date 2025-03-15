import java.util.Scanner;

public class Q45 {
    private double number1;
    private double number2;
    //    private double number3;
    private char operator;

    Q45(){

    }
    Q45(double number1){
        this.number1=number1;
    }
    Q45(double number1 , double number2){
        this.number1=number1;
        this.number2=number2;
    }
    Q45(double number1,double number2,char operator){
        this.number1=number1;
        this.number2=number2;
        this.operator=operator;
    }
    public void  setNumber1(double number1){
        this.number1=number1;
    }public double getNumber1(){
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    public double getOperator() {
        return operator;
    }
    public void setOperator(char operator) {
        this.operator = operator;
    }
    public void makeCalculator1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first number :");
//        double number11=scanner.nextDouble();
        setNumber1(scanner.nextDouble());
        System.out.print("Enter a second number :");
//        double number22=scanner.nextDouble();
        setNumber2(scanner.nextDouble());
        System.out.print("Enter the operator you want to calculate value :");
//        char operator1=scanner.next().charAt(0);
        setOperator(scanner.next().charAt(0));
        if (getOperator()=='+'){
            double add=getNumber1()+getNumber2();
            System.out.println("The answer is :"+add);
        } else if (getOperator()=='-') {
            double negative=getNumber1()-getNumber2();
            System.out.println("The answer is :"+negative);
        } else if (getOperator()=='*') {
            double multiply=getNumber1()*getNumber2();
            System.out.println("The answer is :"+multiply);
        } else if (getOperator()=='/') {
            double division=getNumber1()/getNumber2();
            System.out.println("The answer is :"+division);
        } else {
            System.out.println("Error");
        }
    }

}


