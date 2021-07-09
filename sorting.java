import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] x = new int[n];
    int i = 0;
    while(i < n){
        x[i] = in.nextInt();
        i++;
    }
    i = 0;
    int g = 0;
    int temp = 0;
    while(i < n){
        while(g < n){
            if(x[g] < x[i]){
                temp = x[i];
                x[i] = x[g];
                x[g] = temp;
            }
            g++;
        }
        i++;
        g = i;
    }
    i = 0;
    while(i < n){
        System.out.println(x[i]);
        i++;
    }
    }
}
