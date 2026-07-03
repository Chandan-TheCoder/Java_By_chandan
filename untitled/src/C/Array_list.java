package C;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array_list {
    public static void main(String [] args ){
        ArrayList<Integer> arry = new ArrayList<>();
        arry.add(12);
        arry.add(10);
        arry.add(16);
        arry.add(15);
        arry.add(10);
        arry.add(18);
        arry.add(14);
        System.out.println(arry.get(2));//same as arr[2];

        arry.set(2,26);// arr[2]=26
        System.out.println(arry.get(2));
        System.out.println(arry);// Full Arry list print
        for(int i=0;i<arry.size();i++){//arr.length== arry.size()
            System.out.print(arry.get(i)+ " ");
        }
        arry.add(1,69);
        System.out.println(arry);
        arry.remove(arry.size()-1);//last element Remove
        System.out.println(arry);
        Collections.reverse(arry);
        System.out.println(arry);
        int carry=1;
        int a;
        for(int i=arry.size()-1;i>=0;i--){
            a=arry.get(i);
            arry.set(i,(arry.get(i)+1)%10);
            if((a+carry)%10==0&&carry==1)carry=1;
            else carry=0;
        }
        if(carry==1){
            arry.add(0,1);
        }


    }
}
