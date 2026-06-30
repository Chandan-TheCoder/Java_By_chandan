package C;

public class second_maxelement {
    public static void main(String[] args) {
        int[] arr = {10, 15, 5, 17, 02, 555};
        int max = -1;
        int max2 = -1;
        for (int i=0; i< arr.length; i++){
            if(max<arr[i]){
                max2=max;
                max=arr[i];
            }
        }
        System.out.print(max + " "+ max2);
    }
}
