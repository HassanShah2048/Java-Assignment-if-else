import java.util.Scanner;

public class Q28 {
    public void calculateElectricityBill(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter your id :");
        String id=scanner.next();
        scanner.nextLine();
        System.out.print("Enter your name :");
        String name=scanner.next();
        scanner.nextLine();
        System.out.print("Enter Consumed Units :");
        double units=scanner.nextInt();
        double bill ;
        if (units<=199){
            bill=units*1.20;
            System.out.println("You consumed a "+ units +" Units And your Electricity bill is :"+bill);
        } else if (units>=200&&units<=400) {
            bill =units*1.50;
            System.out.println("You consumed a "+ units+ " Units And your Electricity bill is :"+bill);
        } else if (units>=400&&units<=600) {
            bill=units*1.80;
            System.out.println("You consumed a "+ units+" Units And your Electricity bill is :"+bill);
        } else {
            bill=units*2.00;
            System.out.println("You consumes a "+units+ " Units  And your Electricity bill is :"+bill);
        }
        if (bill > 400){
            System.out.println(bill+(bill/100)*15+"  is your total bill");
            bill =(bill/100)*15;
            System.out.println("Your bill is greater than 400 so the 15% tax  is :  "+bill);
        }if(bill<100){
            bill=100;
            System.out.println("Your total  bill is : "+bill);
  }
    }
}
