package B;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int n1 = 0;
        for (; n != 0; ) {
            n1 = (n1 + (n % 10)) * 10;
            n=n/10;
        }
        System.out.println("Reverse number is "+ n1/10);


    }
}