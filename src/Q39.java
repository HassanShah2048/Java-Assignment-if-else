import java.util.Scanner;

public class Q39 {
    private  float hours;

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }
    Q39(){

    }
    Q39(float hours){
        this.hours=hours;
    }
    private void scanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a working hours :");
        setHours(scanner.nextFloat());
    }
    public void checkHours(){
        scanner();
        if (getHours()>=2 && getHours()<3){
            System.out.println("your are highly efficient :");
        } else if (getHours()>=3 && getHours()<4) {
            System.out.println("you are need to improve your speed");
        } else if (getHours()>=4 && getHours()<5) {
            System.out.println("you are need a training and improve your speed ");
        } else if (getHours()>=5) {
            System.out.println("you are using too much time so  you leave a company");
        }else {
            System.out.println("error");
        }
    }
}
