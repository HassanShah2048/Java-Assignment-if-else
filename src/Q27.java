import java.util.Scanner;

public class Q27 {
    public  void checkVowel(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a character :");
        char chr=scanner.next().charAt(0);
        if (chr=='a'||chr=='A'||chr=='e'||chr=='E'||chr=='i'||chr=='I'||
                chr=='o'||chr=='O'||chr=='u'||chr=='U'){
            System.out.println("VOWEL");
        }else {
            System.out.println("consonant");
        }
    }
}
