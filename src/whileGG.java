import java.util.Scanner;

public class whileGG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int x = sc.nextInt();
        int k = 0;
        int e=1;
        while (k<x)
        {
            a+=a/10;
            k+=a;
            e++;
        }


        System.out.println(e);

    }
}
