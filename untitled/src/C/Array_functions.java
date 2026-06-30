package C;

import java.util.Scanner;
import java.util.Arrays;
public class Array_functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 28, 28, 3};

        int[] arr1;//ok
        //arr1={10,11}; not ok

        int[] arr2={};//ok

        int[] arr3;
        arr3=new int[6];//ok

        print(arr);
        int[] deep= Arrays.copyOf(arr,arr.length);
        print(deep);
        Arrays.sort(deep);
        print(deep);
        if(true){// if take only boolean funtion
            System.out.print("hi");
        }
//        if(1){// not ok
//            System.out.print("hi");
//        }

     }
     static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] +" ");
        }
        System.out.println();
    }
    }
