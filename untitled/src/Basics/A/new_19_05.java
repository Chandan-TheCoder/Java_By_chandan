package Basics.A;
// normal implimantaion of thread
class text_her extends Thread{
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("Text her !");
            i++;
        }
    }
}class loving_her extends Thread{
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("Loving her !");
            i++;
        }
    }
}

public class new_19_05 {
    public static void main(String [] args ){
      text_her text =new text_her();
      loving_her love =new loving_her();

      text.start();
      love.start();
    }
}
