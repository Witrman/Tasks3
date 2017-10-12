import java.util.Scanner;

public class whileAA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = 0;
        int m = 0;
        while (a>10){
            s  = a%10;
            a/=10;
            if (s>a%10 && s>m)
            {
                m=s;
            }
        }
        System.out.println(m);

    }
}
