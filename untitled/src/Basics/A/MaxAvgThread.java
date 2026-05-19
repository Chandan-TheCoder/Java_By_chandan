class MaxThread extends Thread {
    int arr[];
    int max;

    MaxThread(int arr[]) {
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

class AvgThread extends Thread {
    int arr[];
    double avg;

    AvgThread(int arr[]) {
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

public class MaxAvgThread {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        MaxThread t1 = new MaxThread(arr);
        AvgThread t2 = new AvgThread(arr);

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
    }
}
