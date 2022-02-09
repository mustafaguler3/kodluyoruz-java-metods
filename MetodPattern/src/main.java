import java.util.Scanner;

public class main {

    static int pattern(int x, int change, int state) {

        System.out.print(+change+" ");

        if(change<=0 || state==1) {
            while(x!=change){
                return pattern(x, change + 5,1);
            }
            System.exit(0);
        }
        return pattern(x,change-5,0);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.print(pattern(number,number,0));



    }
}
