import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int[] g = new int[n];
        int i = 0;
        while(i<n){
            g[i]=in.nextInt();
            i++;
        }
        i = 0;
        int sum = x;
        while(i<n){
            sum=sum+(x-g[i]);
            i++;
        }
        System.out.println(sum);

    }
}
