package Basics.A;
class movie_book{
  static   int seat=20;
    synchronized static void bookseat(int givenseat){
        if(givenseat<=seat){
            System.out.println("Seat book sucessfully");
            seat=seat-givenseat;
            System.out.println("seat remaning"+seat);
        }
        else{
            System.out.println("Not possibble");
        }
    }
}
class mythread extends Thread{
    movie_book b;
    int seat;
    mythread(movie_book b, int seat){
        this.b=b;
        this.seat=seat;
    }
    public void run(){
        b.bookseat(seat);
    }}
    // two diffent object
   class mythread1 extends Thread{
    movie_book b;
    int seat;
    mythread1(movie_book b, int seat){
        this.b=b;
        this.seat=seat;
    }
    public void run(){
        b.bookseat(seat);
    }

}

public class Static_syn {
public static void main(){
    movie_book b1 =new movie_book();
    mythread t1 =new mythread(b1,7);
    t1.start();
    mythread t2 =new mythread(b1,5);
    t2.start();

    movie_book b2 =new movie_book();
    mythread1 t3 =new mythread1(b2,1);
    t3.start();
    mythread1 t4 =new mythread1(b2,10);
    t4.start();
}
}

