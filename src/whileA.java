import java.util.Scanner;

public class whileA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i*i<=a)
            {
                System.out.println(i*i);
            }
            else { break;}
        }
    }
}
