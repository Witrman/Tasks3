import java.util.Scanner;

public class whileE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b=0;
        do {
            a=sc.nextInt();
            if (a>b){b=a;}
        }while (a!=0);
        System.out.println(b);
    }
}
