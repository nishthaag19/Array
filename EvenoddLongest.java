import java.util.Scanner;

public class EvenoddLongest {
    static int maxCount(int a[],int n){
        int res=1;
        int c=1;
        for (int i = 1; i < n; i++) {
           if((a[i]%2==0 && a[i-1]%2!=0)||(a[i]%2!=0 && a[i-1]%2==0))
            {
                c++;
                res=Math.max(res,c);
            }
            else
                c=1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        System.out.println(maxCount(a,n));
    }
}
