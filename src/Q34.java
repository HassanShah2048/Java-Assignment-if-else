import java.util.Scanner;

public class Q34 {
    private double units;
    public void setUnits(double units){
        this.units=units;
    }public double getUnits(){
        return units;
    }
    Q34(){

    }
    Q34(double units){
        this.units=units;
    }
    double bill;
    public void checkUnits(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter consumed units :");
        double unit1=scanner.nextDouble();
        setUnits(unit1);
        if (getUnits()>=1 && getUnits()<=50){
            bill=getUnits()*0.50;
            double tax=(bill/100)*20;
            System.out.println("your bill is :"+bill);
            System.out.println("And your tax is :"+tax);
            System.out.println("And your total bill with tax is :"+(bill+tax));
        } else if (getUnits()>50&&getUnits()<=100) {
            bill=getUnits()*0.75;
            double tax=(bill/100)*20;
            System.out.println("your bill is :"+bill);
            System.out.println("And your tax is :"+tax);
            System.out.println("And your total bill with tax is :"+(bill+tax));
        } else if (getUnits()>100&&getUnits()<=200) {
            bill=getUnits()*1.20;
            double tax=(bill/100)*20;
            System.out.println("your bill is :"+bill);
            System.out.println("And your tax is :"+tax);
            System.out.println("And your total bill with tax is :"+(bill+tax));
        }else if (getUnits()>250){
            bill=getUnits()*1.50;
            double tax=(bill/100)*20;
            System.out.println("your bill is :"+bill);
            System.out.println("And your tax is :"+tax);
            System.out.println("And your total bill with tax is :"+(bill+tax));
        }else {
            System.out.println("you entered a wrong ");
        }


    }
}
