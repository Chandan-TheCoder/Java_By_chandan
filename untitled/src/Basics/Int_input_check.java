package Basics;
import java.util.Scanner;
public class Int_input_check {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number");
        double r = sc.nextDouble();
        if(r%1==0){
            System.out.print("Integer");
        }
    else { System.out.print("Not Integer");}


    }
}
