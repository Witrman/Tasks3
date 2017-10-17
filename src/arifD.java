import java.util.Scanner;

public class arifD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (sum !=  n) {
            for (int i = 1; i <= n -sum+2; i++) {
                if (i*i >n -sum)
                {
                    sum+=(i-1)*(i-1);
                    System.out.print(i-1.0+" ");
                    break;
                }
            }
        }
    }
}
