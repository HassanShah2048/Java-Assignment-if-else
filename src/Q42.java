import java.util.Scanner;

public class Q42 {
    private double centimeter;
    private double meter;
    private double kilometers;
    public double getCentimeter() {
        return centimeter;
    }

    public void setCentimeter(double centimeter) {
        this.centimeter = centimeter;
    }

    public double getMeter() {
        return meter;
    }

    public void setMeter(double meter) {
        this.meter = meter;
    }

    public double getKilometers() {
        return kilometers;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    Q42(){}
    Q42(double centimeter){
        this.centimeter=centimeter;
    }
    Q42(double centimeter,double meter)
    {
        this.centimeter=centimeter;
        this.meter=meter;
    }
    Q42(double centimeter,double meter,double kilometers){
        this.centimeter=centimeter;
        this.meter=meter;
        this.kilometers=kilometers;
    }
    public void checkCentimeter(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number in centimeters :");
        setCentimeter(scanner.nextDouble());
        System.out.print("if you want to calculate in meters press  "+1+"  ");
        setMeter(scanner.nextDouble());
        System.out.print("if you want to calculate in kilometers press "+2+" "  );
        setKilometers(scanner.nextDouble());

        double meters=getCentimeter()*100;
        double kilometer=getCentimeter()*100000;
        if (getMeter()==1){
            System.out.println("your centimeters in meter is :"+meters);
        }else {
            System.out.println("nothing to print for meters");
        }
         if (getKilometers()==2) {
            System.out.println("your centimeter in kilometers are :"+kilometer);
        }else {
            System.out.println("nothing to print for kilometers");
        }
    }
}
