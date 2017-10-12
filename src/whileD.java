import java.util.Scanner;

public class whileD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        for (int i = 0; i < 100 ; i++) {

            if (a==Math.pow(2,i))
            {
                System.out.println("YES");
return;
            }
        }

            System.out.println("NO");

    }
}
