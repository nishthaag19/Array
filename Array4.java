import java.util.Scanner;

public class Array4 {
    static int factorial(int n){
        int f=1;
        int z=0;
        for (int i = 1; i <= n; i++) {
            f*=i;
        }
        while(f%10==0) {
            z++;
            f /= 10;
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(factorial(n));
    }
}
