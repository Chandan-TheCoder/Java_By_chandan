package Basics.A;
// this is the implementaion of thread using ruanble
class text_to implements Runnable{
    public void run(){
        while(true){
        System.out.println("text to .....");}

    }
}class love_to implements Runnable{
    public void run(){
        System.out.println("love to .....");

    }
}
public class Runnable_19_05 {
    public static void main( String [] args){
    text_to text =new text_to();
    Thread t1=new Thread(text);//this is the implemtation
        love_to love =new love_to();
        Thread t2=new Thread(love);
        t1.start();
        t2.start();
    }
}
