import java.util.Scanner;

public class insertion {
    static void inserShort(int []arr,int n){
        int i,j;
        int swap;
        for (i=0;i<n;i++){
            j=i;
            while (j>0&&arr[j-1]>arr[j]){
                swap = arr[j];
                arr[j]=arr[j-1];
                arr[j-1] = swap;
                j--;
            }
        }
        System.out.println("Shorting array is:");
        for (i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[]args){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size:");
        int n= sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the array:");
        for (i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("the array:");
        for (i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();

        inserShort(arr,n);
    }
}
