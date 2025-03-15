import java.util.Scanner;
public class Q44 {
  void  check(){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a number: ");
      String number = scanner.next();
      char lastChar = number.charAt(number.length() -1);
      System.out.println(lastChar);
      int nu=lastChar%3;
      if (nu==0){
          System.out.println("last digit of number is divide by 3");
      }else {
          System.out.println("last digit of number is not divisible by 3");
      }
  }

}
