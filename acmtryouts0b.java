import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int z = in.nextInt();
    int i = 0;
    while(i < z){
        int l = in.nextInt();
        int m = l-1;
        int n = l-1;
        String a = in.next();
        String b = in.next();
        char[] x = new char[2*l-1];
        int g = 0;
        while(m+n >= 0){
            if(g % 2 == 0){
                x[g] = b.charAt(n);
                n--;
            }
            else{
                x[g] = a.charAt(m);
                m--;
            }
            System.out.print(x[g]);
            g++;
        }
        System.out.print(a.charAt(0));
        System.out.println();
        i++;
    }
    }
}
