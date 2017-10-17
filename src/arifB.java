import java.util.Scanner;

public class arifB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        while (a1 != a2) {
            if (a1 > a2) {
                a1 = a1 - a2;
            } else {
                a2 = a2 - a1;
            }
        }

        System.out.println(a1);

    }
}
