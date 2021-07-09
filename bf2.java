import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int temp;
        String s = in.next();
        int k = in.nextInt();
        temp = k;
        char[] x = new char[k];
        int counter = 0;
        String[] str = new String[s.length()-k];
        int g = 0;
        while(k < s.length()){
            while(counter < temp){
                x[counter] = s.charAt(i);
                i++;
                counter++;
            }
            str[g] = new String(x);
            //System.out.println(str[g]);
            g++;
            counter = 0;
            k++;
            i= i-(temp)+1;
        }
        Arrays.sort(str);
        System.out.print(str[0]);
    }
}
