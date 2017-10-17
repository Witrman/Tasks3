import java.util.Scanner;

public class whileHH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] fib = new int[a*a+5];
        fib[0]=0; fib[1]=1;
        int i = 1;
        while (i !=a )
        {
            i++;
            fib[i]=fib[i-1]+fib[i-2];
        }
        System.out.println(fib[i]);
    }
}
