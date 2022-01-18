import java.util.*;
import java.io.*;
// sliding window problem
public class Array6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(find(arr, n, k));
    }
    static int find(int arr[], int n, int k) {
        if (k > n) {
            return -1;
        }
        else {
            int sum = 0;
            for (int i = 0; i < k; i++) {
                sum += arr[i];
            }
            int max = sum;
            for (int i = k; i < n; i++) {
                max += (arr[i] - arr[i - k]);
            }
            return max;
        }
    }
}

