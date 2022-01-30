import java.util.Scanner;
//Leaders in the array
public class Leader {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        leader(a, n);
    }
    static void leader(int a[],int n){
        int temp=a[n-1];
        System.out.println(temp);
        for (int i = n-2; i >=0 ; i--) {
            if(a[i]>temp){
                temp=a[i];
                System.out.println(temp+ "  ");
            }
        }
       // System.out.println(temp);
    }
}
