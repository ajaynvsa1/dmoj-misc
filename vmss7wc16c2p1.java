import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String a = "GGGGG";
        String b = "G";
        String c = "....";
        String d = "..";
        String e = "GG";
        String f = "...";
        int i = 0;
        int g = 0;
        //First Chonk
        while(i<n){
            while(g<n){
                System.out.print(a);
                g++;
            }
            g=0;
            System.out.print("\n");
            i++;
        }
        i=0;
        g=0;
        //Second Chonk
        while(i<n){
            while(g<n){
                System.out.print(b);
                g++;
            }
            g=0;
            while(g<n){
                System.out.print(c);
                g++;
            }
            g=0;
            System.out.print("\n");
            i++;
        }
        i=0;
        g=0;
        //Third Chonk
        while(i<n){
            while(g<n){
                System.out.print(b);
                g++;
            }
            g=0;
            while(g<n){
                System.out.print(d);
                g++;
            }
            g=0;
            while(g<n){
                System.out.print(e);
                g++;
            }
            g=0;
            System.out.print("\n");
            i++;
        }
        i=0;
        g=0;
        //Fourth Chonk
        while(i<n){
            while(g<n){
                System.out.print(b);
                g++;
            }
            g=0;
            while(g<n){
                System.out.print(f);
                g++;
            }
            g=0;
            while(g<n){
                System.out.print(b);
                g++;
            }
            g=0;
            System.out.print("\n");
            i++;
        }
        i=0;
        g=0;
        //Fifth Chonk
        while(i<n){
            while(g<n){
                System.out.print(a);
                g++;
            }
            g=0;
            if(i<n-1){
            System.out.print("\n");
            }
            i++;
        }
        i=0;
        g=0;
    }
}
