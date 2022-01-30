import java.util.Scanner;
//to count maximum consecutive 1 in the array
//inputs are 0 and 1 only
public class MaxConsOne {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println(count(a, n));
    }

    static int count(int a[], int n) {
        int c = 0, ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                c = 0;
            else {
                c++;
                ans = Math.max(ans, c);
            }
        }
        return ans;
    }
}
