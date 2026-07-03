package C;
import java.util.Scanner;
public class Rotate_arry1 {
    public static void main(String[] agrs){
        int [] arr={10,15,45,10};
        for(int element : arr){
            System.out.print(element + " ");
        }
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        d=d%(arr.length);
        int i=0;
        int j=d-1;
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=d;
        j=arr.length-1;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=0;
        j=arr.length-1;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }



        for(int element : arr){
            System.out.print(element + " ");
        }

    }
}
