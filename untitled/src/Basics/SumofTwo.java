package Basics;

public class SumofTwo {
    public static void main(String []args){
//        System.out.print("Enter The two Number:");
//        Scanner sc =new Scanner(System.in);
//        int r1=sc.nextInt();
//        int r2=sc.nextInt();
//        System.out.print(r1+r2);
        //inplicite type casting
        char ch ='a';
        int  x= ch;
        System.out.println(x);

        char ch2=65;
        System.out.println(ch2);
        //explicite type casting
        System.out.println((int)ch2);

        char ch25 ='2';
        System.out.println((int)ch25);


        char abc='a';
        System.out.println(abc+0);
        // new
            int c=10;
            System.out.println(c++);
            System.out.println(++c);
            //Boolean
        System.out.println(5>3);
        System.out.println(5<3);

        boolean flag=5==5;
        System.out.print(flag);



    }
}
