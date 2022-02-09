import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String menu = "1- Addition\n"
                + "2- Substraction (-)\n"
                + "3- Multiplication (*)\n"
                + "4- Division (/)\n"
                + "5- Take Exponential (^)\n"
                + "6- Take Mod (%)\n"
                + "0- Exit";

        System.out.println(menu);
        while (true) {
            System.out.print("please choose a process :");
            int select = scan.nextInt();

            if (select==0) {
                System.out.println("exited.");
                break;
            }

            System.out.print("enter first: ");
            int n1 = scan.nextInt();
            System.out.print("enter second: ");
            int n2 = scan.nextInt();


            switch (select) {
                case 1:
                    plus(n1,n2);
                    break;
                case 2:
                    minus(n1,n2);
                    break;
                case 3:
                    times(n1,n2);
                    break;
                case 4:
                    divided(n1,n2);
                    break;
                case 5:
                    power(n1,n2);
                    break;
                case 6:
                    mod(n1,n2);
                    break;
                default:
                    System.out.println("no valid process.");
            }

        }

    }
    static void plus(int s1, int s2) {
        int result = s1 + s2;
        System.out.println("Result: " + result);
    }

    static void minus(int s1, int s2) {
        int result = s1 - s2;
        System.out.println("Result: " + result);
    }

    static void times(int s1, int s2) {
        int result = s1 * s2;
        System.out.println("Result: " + result);
    }

    static void divided(int s1, int s2) {
        if (s2 == 0) {
            System.out.println("second number can not be zero!");
        } else {
            int result = s1 / s2;
            System.out.println("Result: " + result);
        }
    }

    static void power(int s1, int s2) {
        int result = 1;
        for (int i = 1; i <= s2; i++) {
            result *= s1;
        }
        System.out.println("Result: " + result);
    }

    static void mod(int s1, int s2) {
        int result = s1 % s2;
        System.out.println("Result: "+result);
    }
}
