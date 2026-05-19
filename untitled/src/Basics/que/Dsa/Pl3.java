package Basics.que.Dsa;

import java.util.Scanner;
import java.util.*;
//import java.math.*;

public class Pl3 {
    public static void main(String []args ){
//        for(int i=1 ;i<=200;i++){
//            System.out.println((char)i + " "+ i);
//        }
        // factors of a number
        int number;
        System.out.print("Enter The number :");
        Scanner n=new Scanner(System.in);
        number =n.nextInt();
        for(int i=1;i<=Math.sqrt(number);i++){
            if(number%i==0)
            System.out.print(i+" ");
        }
        for(int j=(int)Math.sqrt(number);j>=1;j++){
            if(number%j==0)
                System.out.print(j+" ");

        }
    }
}
