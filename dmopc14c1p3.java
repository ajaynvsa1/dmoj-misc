import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int[] x = new int[i];
        int n = 0;
        while(n < i){
            x[n] = in.nextInt();
            n++;
        }
        n = 0;
        int s = in.nextInt();
        int[] y = new int[s];
        while(n < s){
            y[n] = in.nextInt();
            n++;
        }
        n = 0;
        int m = 0;
        double sumInit = 0;
        while(n < i){
            sumInit += x[n];
            n++;
        }
        while(m < s){
            sumInit += y[m];
            double result = (sumInit)/(m+i+1);
            String z = String.format("%.3f", result);
            System.out.println(z);
            m++;
        }
    }
}
