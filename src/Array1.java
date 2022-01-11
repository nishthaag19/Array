public class Array1 {
    static  int remove(int arr[]){
        int x=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[x-1]!=arr[i])
            {
                arr[x] = arr[i];
                x++;
            }
        }
        return  x;
    }
    public static void main(String[] args) {
        int arr[] = {10, 10, 30, 30, 40, 50, 50, 50, 9, 45};
        System.out.println("elements in the array are");
        for( int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int z = remove(arr);
        for( int i=0;i< z;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
