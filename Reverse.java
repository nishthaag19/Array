import java.util.Scanner;
//to reverse an array
public class Reverse {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n= s.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        reverseArr(a,n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "  ");
        }
    }
    static void reverseArr(int a[],int n){
        int f=0,e=n-1;
        while(f<e){
            int temp=a[f];
            a[f]=a[e];
            a[e]=temp;
            f++;
            e--;
        }
    }
}
