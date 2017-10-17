import java.util.Scanner;

public class arifC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        int i = 1;
        int sum = 1;
        while (sum<s){
            i++;
            if (s%i==0    )
            {
                sum*=i;
                System.out.print (i+"  ");
            }
        }
    }
}
