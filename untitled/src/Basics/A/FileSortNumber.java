import java.io.*;
import java.util.*;

class FileSortNumber {
    public static void main(String args[]) {
        try {
            // Create files and write numbers
            FileWriter f1 = new FileWriter("file1.txt");
            f1.write("30 10 50");
            f1.close();

            FileWriter f2 = new FileWriter("file2.txt");
            f2.write("20 40 60");
            f2.close();

            // Read numbers
            Scanner s1 = new Scanner(new File("file1.txt"));
            Scanner s2 = new Scanner(new File("file2.txt"));

            int a = s1.nextInt();
            int b = s1.nextInt();
            int c = s1.nextInt();
            int d = s2.nextInt();
            int e = s2.nextInt();
            int f = s2.nextInt();

            // Simple sorting
            int temp;
            if(a>b){temp=a;a=b;b=temp;}
            if(a>c){temp=a;a=c;c=temp;}
            if(b>c){temp=b;b=c;c=temp;}

            if(d>e){temp=d;d=e;e=temp;}
            if(d>f){temp=d;d=f;f=temp;}
            if(e>f){temp=e;e=f;f=temp;}

            System.out.println("Sorted numbers:");
            System.out.println(a+" "+b+" "+c);
            System.out.println(d+" "+e+" "+f);

            s1.close();
            s2.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("File not found");
        }
        catch(IOException ex) {
            System.out.println("File error");
        }
    }
}