import java.io.*;
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    long[] x = new long[n];
    int i = 0;
    while(i < n){
        x[i] = in.nextLong();
        i++;
    }
    i = 0;
    while(i < n){
        while(Math.pow(x[i],3) % 1000 != 888){
            x[i]++;
        }
        i++;
    }
    i = 0;
    while(i < n){
        System.out.println(x[i]);
        i++;
    }
    }
}
