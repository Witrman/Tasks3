import java.util.Scanner;

public class arifG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),n1=0,n2=0;
        boolean f1 = false;
        for (int i = 1; i < n/2; i++) {
            if(pr(i) && pr(i-1))
            {
                f1=true;
                n1=i;
                n2=n-i;

            }
        }
        if(f1){
            System.out.println(n1+" + "+ n2 + " =" +n);
        } else {
            System.out.println("ne dokazano");
        }
    }
    private static boolean pr(int i)
    {
        boolean f = true;
        for (int j = 2; j < i-1; j++) {
            if(i%2==0) {f=false;}

        }
        return f;
    }
}
