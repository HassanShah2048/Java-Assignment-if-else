import java.util.Scanner;

public class Q43 {
    private int hours;
    private float mints;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public float getMints() {
        return mints;
    }

    public void setMints(float mints) {
        this.mints = mints;
    }
    Q43(){

    }
    Q43(int hours){
        this.hours=hours;
    }
    Q43(int hours,float mints){
        this.hours=hours;
        this.mints=mints;
    }
    public  void checkAmOrPm(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter a hour :");
        setHours(scanner.nextInt());
        System.out.print("Enter mints :");
        setMints(scanner.nextFloat());
        if (getHours()<=12 && getMints()>=1 &&getMints()<59){
            System.out.println("you entered a time in AM ");
        } else if (getHours()>12&&getHours()<=24&& getMints()>=1 &&getMints()<59) {
            System.out.println("you entered a time in PM");
        }else {
            System.out.println("pleas enter a correct hour or mints");
        }
    }

}
