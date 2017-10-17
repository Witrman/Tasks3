import java.util.Scanner;

public class whileFF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int x = sc.nextInt();
        int k = 1;
        while (a<x)
        {
            a+=a/10;
        k++;
        }


        System.out.println(k);

    }
}
