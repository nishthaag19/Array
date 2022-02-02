import java.util.Scanner;
import java.util.Arrays;
//to find smallest missing positive number in the array
public class SmallestNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println(PositiveMissing(a, n));
    }
    static int PositiveMissing(int a[], int n) {
        Arrays.sort(a);

        int Min = a[0];
        int Max = a[n - 1];

        if (Min <= 0)
            Min = 1;
        if (Max < 0)
            Max = 0;
        if (Min > 1)
            return 1;

        for (int i = 0; i < n; i++) {
            if (a[i] == Min) Min++;
            else if (a[i] > Min) return Min;
        }
        return Max + 1;
    }
}