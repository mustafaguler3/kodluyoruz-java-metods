import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = scanner.nextInt();
        int status=isPrime(num,num/2);
        if(status==0)
            System.out.print(num+" is not a prime.");
        else
            System.out.print(num+" is a prime.");
    }

    static int isPrime(int n,int s){

        if(n<2)
            return 0;
        if(s==1)
            return 1;
        else
        {
            if(n % s == 0)
                return 0;
            else
                return isPrime(n, s - 1);
        }

    }
}
