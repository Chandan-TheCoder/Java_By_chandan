package B;

public class pattern4 {
    public static void main(String [] args){
        int n=5;
        // * print by stars
        int x= n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j||(j-i)==x)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            x=x-2;
            System.out.println();
        }

    }
}