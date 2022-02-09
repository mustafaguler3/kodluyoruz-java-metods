import java.util.Scanner;

public class main {

    static boolean isPalindrom(int number){
        int temp = number,reverseNumber = 0,lastNumber;
        while(temp !=0 ){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber){
            System.out.println(number +" Number is a Palindrome Number.");
            return true;
        }else{
            System.out.println(number +" Number is not a Palindrome Number.");
            return false;
        }
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        isPalindrom(n);



    }

}
