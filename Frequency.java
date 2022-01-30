import java.util.Scanner;
//to count the frequency of an element in sorted array
public class Frequency {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n= s.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        count(a,n);
    }
    static  void count(int a[],int n){
        int f=1,i=1;
        while(i<n){
            while(i<n &&a[i]==a[i-1])
            {
                f++;
                i++;
            }
            System.out.println(a[i-1]+" "+f);
            i++;
            f=1;
        }
    }
}
