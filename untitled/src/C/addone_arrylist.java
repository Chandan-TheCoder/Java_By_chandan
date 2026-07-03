

import java.util.ArrayList;


public class addone_arrylist {
}



    public static void main(String [] args ){
        ArrayList<Integer> arry = new ArrayList<>();
        arry.add(5);
        arry.add(8);
        arry.add(9);

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

        System.out.println(arry);
    }

