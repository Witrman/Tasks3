import java.util.Scanner;

public class whileDD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = 0;
        while (a>10){
           s+=a%10;
            a/=10;

        }
        s+=a ;
        System.out.println(s);

    }
}
