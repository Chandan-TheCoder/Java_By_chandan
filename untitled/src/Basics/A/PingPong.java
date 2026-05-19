class Ping extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Ping");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Pong extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("PONG");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class PingPong {
    public static void main(String[] args) {
        Ping p1 = new Ping();
        Pong p2 = new Pong();

        p1.start();
        p2.start();
    }
}