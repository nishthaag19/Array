import java.util.*;
//to find the median of two sorted arrays
public class MedianOfArray{
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1= s.nextInt();
        int n2= s.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++){
        arr1[i]=s.nextInt();
        }
        for(int i=0;i<n2;i++){
        arr2[i]=s.nextInt();
        }
        System.out.println(findMedian(arr1,arr2,n1,n2));
    }
   static double findMedian(int num1[],int num2[],int n1,int n2) {
        double m;
        int j = 0;
        int num[] = new int[n1 + n2];
        for (int i = 0; i < num.length; i++) {
                if (i < n1) {
                        num[i] = num1[i];
                }
                else {
                        if (j < n2) {
                                num[i] = num2[j];
                                j++;
                        }
                }
        }
        Arrays.sort(num);
        if (num.length % 2 != 0) {
                int a = num.length / 2;
                m = num[a];
        }
        else {
                int a = num.length / 2 - 1;
                int b = a + 1;
                double sum = num[a] + num[b];
                m = sum / 2;
        }
        return m;
   }
}