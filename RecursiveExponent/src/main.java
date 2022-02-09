import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter first number ");
            int s1 = scanner.nextInt();
            System.out.print("Enter second number ");
            int s2 = scanner.nextInt();
            power(s1, s2);
            System.out.println(power(s1,s2));

        }



    }
    static int power(int s1,int s2){

        if (s2 == 0){
            return 1;
        }else {
            return s1 * power(s1,s2-1);
        }

    }
}
