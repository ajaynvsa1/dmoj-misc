import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 0;
        while(true){
            String command = in.next();
            if(command.equals("EOF")){
                break;
            }
            else if(command.equals("TAKE")){
                if(n==999)
                    n=0;
                n++;
                a++;
            }
            else if(command.equals("SERVE")){
                b++;
            }
            else if(command.equals("CLOSE")){
                System.out.println(a+" "+(a-b)+" "+n);
                a=0;
                b=0;
            }
            
        }
    }
}
