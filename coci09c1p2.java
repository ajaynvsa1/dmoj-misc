public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int i = 0;
    int sum = 0;
    while(i<=n+1){
        sum = sum+i;
        i++;
    }
    System.out.println(sum*n);
    }
}
