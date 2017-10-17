import java.util.Scanner;

public class whileI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b=0;
        do {
            a=sc.nextInt();
            b++;
        }while (a!=0);
        System.out.println(b-1);
    }
}
