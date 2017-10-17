import java.util.Scanner;

public class arifA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int s = a2;
      a2*=b2;
      a1*=b2;
      b1*=s;
      b2*=s;
      int ds= a1+b1;
      s=ds;
        while (s != a2) {
            if (s > a2) {
                s = s - a2;
            } else {
                a2 = a2 - s;
            }
        }

        System.out.println(ds/s+" "+b2/s);

    }

}
