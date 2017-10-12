import java.util.Scanner;

public class whileF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b=100000;
        do {
            a=sc.nextInt();
            if (a<b && a!=0){b=a;}
        }while (a!=0);
        System.out.println(b);
    }
}
