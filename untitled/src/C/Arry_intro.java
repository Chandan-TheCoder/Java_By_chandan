package C;
import java.util.Scanner;
public class Arry_intro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] x = {2,28,28,3};
        System.out.println(x);// not working


        char[] x1 = {'a',' ', 'b',' ', 's'};
        System.out.println(x1);// working


        char[] x2= new char[5];
        for(int i= 0;i<x2.length;i++){
           x2[i]=sc.next().charAt(0);
        }
        System.out.print(x2);

        String[] x3 = {"Chandan","Dutta","Chandana"};
        System.out.println(x3);// working


        String[] x5= new String[5];
        for(int i= 0;i<x5.length;i++){
           x5[i]=sc.next();
        }
        for(int i= 0;i<x5.length;i++){
          System.out.print(x5[i]+" ");
        }


    }
}
