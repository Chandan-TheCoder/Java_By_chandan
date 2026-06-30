package C;

public class Each_for {
    public static void main(String[] agrs){
        int [] arr={10,15,45,10,16};
        for(int element : arr){
            System.out.print(element + " ");
        }
        for(int element : arr){
            element=element*2;
        }
        for(int element : arr){
            System.out.print(element + " ");
        }

    }
}
