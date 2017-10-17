import java.util.Scanner;

public class whileL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 1;
        for (int i = 1; i <= n; i++) {
            sum+=1.0/(fackt(i));
        }
        System.out.println(sum);
    }

    public static int fackt(int r) {
        int d = 1;
        for (int i = 1; i <= r; i++) {
            d*=i;
        }
        return d;
    }
}
