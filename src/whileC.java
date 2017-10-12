import java.util.Scanner;

public class whileC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = 1;
        while (a>10){
           a/=10;
           s++;
        }
        System.out.println(s);

    }
}
