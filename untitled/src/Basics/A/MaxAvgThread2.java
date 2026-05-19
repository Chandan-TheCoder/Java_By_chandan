import java.util.Scanner;

class MaxThread2 extends Thread {
    int arr[];
    int max;

    MaxThread2(int arr[]) {
        this.arr = arr;
    }

    public void run() {
        max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
    }

    int getMax() {
        return max;
    }
}

class AvgThread2 extends Thread {
    int arr[];
    double avg;

    AvgThread2(int arr[]) {
        this.arr = arr;
    }

    public void run() {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        avg = (double) sum / arr.length;
    }

    double getAvg() {
        return avg;
    }
}

public class MaxAvgThread2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        MaxThread2 t1 = new MaxThread2(arr);
        AvgThread2 t2 = new AvgThread2(arr);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        int max = t1.getMax();
        double avg = t2.getAvg();

        double result = max / avg;

        System.out.println("Maximum Element = " + max);
        System.out.println("Average = " + avg);
        System.out.println("(Max / Avg) = " + result);

        sc.close();
    }
}