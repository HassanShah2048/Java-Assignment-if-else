import java.util.Scanner;

public class Q36 {
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    Q36(){

    }

     Q36(int length){
        this.length=length;
    }

    Q36(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public  void  checkArea(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter value of length :");
        int length1=scanner.nextInt();
        setLength(length1);
        System.out.print("enter the value of breath");
        int breath1=scanner.nextInt();
        setBreadth(breath1);
        int area=getLength()*getBreadth();
        int perimeter=2*(getLength()+getBreadth());
        if (area>perimeter){
            System.out.println("Area is greater ");
        }else {
            System.out.println("Area is not greater ");
        }
    }
}
