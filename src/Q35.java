import java.util.Scanner;

public class Q35 {
    private double price;
    private double quantity;

    public void  setPrice(double price){
        this.price=price;
    }  public double getPrice(){
        return price;
    }
    public void setQuantity(double quantity){
        this.quantity=quantity;
    }
    public double getQuantity(){
        return quantity;
    }
    Q35(){

    }
    Q35(double price){
        this.price=price;
    }
    Q35(double price,double quantity){
        this.price=price;
        this.quantity=quantity;
    }
    public void checkRevenue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product price :");
        double price1=scanner.nextDouble();
        setPrice(price1);
        System.out.print("Enter quantity :");
        double quantity1=scanner.nextDouble();
        setQuantity(quantity1);
        double revenue=getPrice()*getQuantity();
        if (revenue>5000){
            double discount=(revenue/100)*10;
            double totalRevenue=revenue-discount;
            System.out.println("your net payment is :"+revenue);
            System.out.println("And your discount is :"+discount);
            System.out.println("And now your payment with discount is :"+totalRevenue);
        }else {
            System.out.println("your payment is :"+revenue);
        }
    }

}
