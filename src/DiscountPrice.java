import java.util.Scanner;
public class DiscountPrice {
    public void calculateDiscount(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter quantity :");
        int quantity=scanner.nextInt();
        int oneUnit=quantity*100;
        int discount=(oneUnit/100)*10;
        if (oneUnit>1000){
            System.out.println("total price is :"+oneUnit+" And Discount is :"+discount);
        }else {
            System.out.println("the total price is :"+oneUnit+"  And not discount");
        }
    }
}
