import java.util.Scanner;
public class Q33 {
    private double basicSalary;
    public void setBasicSalary(double basicSalary){
        this.basicSalary=basicSalary;
    }
    public double getBasicSalary(){
        return basicSalary;
    }
    Q33 (){

    }
    Q33(double basicSalary){
        this.basicSalary=basicSalary;
    }
    public void checkSalary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your basic salary :");
        double salary=scanner.nextDouble();
        setBasicSalary(salary);
        scanner.nextLine();
        if (basicSalary<=100000){
            double HRA=(getBasicSalary()/100)*20;
            double DA=(getBasicSalary()/100)*80;
            System.out.println("your salary is less or equal to 100000 so the HRA is :"+HRA+"  And  DA is  :"+DA);
        } else if (basicSalary<=200000) {
            double HRA=(getBasicSalary()/100)*25;
            double DA=(getBasicSalary()/100)*90;
            System.out.println("your salary is "+getBasicSalary()+" so the HRA is :"+HRA+"  And the DA is  :"+DA);
        } else {
            double HRA=(getBasicSalary()/100)*30;
            double DA=(getBasicSalary()/100)*95;
            System.out.println("your salary is :"+getBasicSalary()+" So the HRA is :"+HRA+ " And the DA is :"+DA);
        }
    }
}
