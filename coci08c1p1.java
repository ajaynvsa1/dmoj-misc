import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] x = new int[3];
    x[0] = in.nextInt();
    x[1] = in.nextInt();
    x[2] = in.nextInt();
    int a = x[0];
    int b = x[1];
    int c = x[2];
    int counter = 0;
    /*while(true){
        Arrays.sort(x);
        if(x[0]+1==x[1]&&x[1]+1==x[2]){
            break;
        }
        if(x[1]-x[0]>=x[2]-x[1]){
            x[2]=x[1]-1;
        }
        if(x[1]-x[0]<x[2]-x[1]){
            x[2]=x[1]+1;
        }
        counter++;
    }*/
    if(a-b<=b-c){
        System.out.println(b-a-1);
    }
    else{
        System.out.println(c-b-1);
    }
    //System.out.print(a+" "+b+" "+c);
    
    
    }
}
