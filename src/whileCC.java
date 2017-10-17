import java.util.Scanner;

public class whileCC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        do {

            System.out.println(b);
            b*=2;
        }while (b<a);
    }
}
