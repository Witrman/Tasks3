import java.util.Scanner;

public class whileEE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        int x=1;
 while (x<a)
 {
     b++;
     x<<=1;
 }
        System.out.println(b);
    }
}
