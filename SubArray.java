import java.util.Scanner;
//to find maximum sum of a subarray
public class SubArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println(maximum(a,n));
    }
    static int maximum(int a[],int n){
        int c=a[0];
        int max=a[0];
        for (int i = 1; i < n; i++) {
            max=Math.max(max + a[i],a[i]);
            c=Math.max(max,c);
        }
        return  c;
    }
}
