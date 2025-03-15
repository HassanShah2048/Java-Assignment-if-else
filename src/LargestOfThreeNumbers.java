public class LargestOfThreeNumbers {
    public int firstNumber = 120938;
    public int secondNumber = 25894;
    public int thirdNumber = 52244562;

    public void findLargestNumber() {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("First number is greater ");
        } else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
            System.out.println("Second number is greater ");
        } else if (thirdNumber>firstNumber && thirdNumber>secondNumber) {
            System.out.println("third number greater");
        }else {
            System.out.println("error");
        }
    }
}