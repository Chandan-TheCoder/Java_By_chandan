package Basics;


import java.util.Scanner;

public class sphare {
    public static void main(){
        //double r=5;
        System.out.print("Enter The Radious ");

        Scanner sc=new Scanner(System.in);
        double r =sc.nextDouble();

        double volume =3.141592*r*r;
        System.out.println(volume);
     //_ or alphabet or $ it can stating at the front of veriable
        System.out.print("Enter  The number the to square:");

        Scanner sc1 = new Scanner(System.in);
        double r1=sc1.nextDouble();

        System.out.print(r1*r1);



    }
}
