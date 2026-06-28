package B;
import java.util.Scanner;
public class ASCII {
    public static void main(){
        // PRINT ASCII VALUE AND  LETTER
//        for(int i=65;i<=90;i++){
//            System.out.println((char)i +" " +  i);
//        }

        // PRIME NUMBER
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number");
//        int n=sc.nextInt();
//        for(int i=2;i<=Math.sqrt(n);i++){
//          if(n%i==0){
//              System.out.println("Not prime");
//              break;
//          }
//
//        }

        //one to 100 prime number
        for(int j=2;j<=100;j++){
            for(int i=2;i<=Math.sqrt(j);i++){
           if(j%i==0){
             System.out.println(j + " is Not prime");
            break;
           }
        }
    }
}}
