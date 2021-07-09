import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] x = new int[5];
        int i = 0;
        while(i < 5){
            x[i] = in.nextInt();
            i++;
        }
        i = 0;
        int g = 2;
        int sum = 0;
        int n = 2;
        boolean isPrime = true;
        while(i < 5){
            while(g <= x[i]){
                while(n <= g/2){
                    if(g % n == 0 && g != 2){
                        isPrime = false;
                        break;
                    }
                    n++;
                }
                if(isPrime){
                    sum += g;
                }
                g++;
                isPrime = true;
                n = 2;
            }
            System.out.println(sum);
            sum = 0;
            g = 2;
            n = 2;
            isPrime = true;
            i++;
        }
    }
}
