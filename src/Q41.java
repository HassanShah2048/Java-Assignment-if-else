import java.util.Scanner;

public class Q41 {
    private double angle;
    private double angle2;
    private double angle3;
    public double getAngle2() {
        return angle2;
    }
    public void setAngle2(double angle2) {
        this.angle2 = angle2;
    }
    public double getAngle3() {
        return angle3;
    }
    public void setAngle3(double angle3) {
        this.angle3 = angle3;
    }
    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
    Q41(){}
    Q41(double angle){
        this.angle=angle;
    }
    public void checkTriangle(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter angle 1 :");
        setAngle(scanner.nextDouble());
        System.out.print("enter angle 2 :");
        setAngle2(scanner.nextDouble());
        System.out.print("enter angle 3 :");
        setAngle3(scanner.nextDouble());
        double sum=getAngle()+getAngle2()+getAngle3();
        if (sum==180){
            System.out.println("the triangle is valid");
        }else {
            System.out.println("the triangle is not valid");
        }


    }
}
