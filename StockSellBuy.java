import java.util.Scanner;
//Stock buy and sell problem
public class StockSellBuy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println(profit(a,n));
    }
    static int profit(int a[],int n){
        int profit=0;
        for (int i = 1; i < n; i++) {
            if (a[i] > a[i - 1]) {
                profit += a[i] - a[i - 1];
            }
        }
        return profit;
    }
}
