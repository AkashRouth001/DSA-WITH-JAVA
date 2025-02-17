import java.util.Scanner;

public class bubble {
    static void bubbleSthort(int[] arr,int n){
        int i,j;
        int swap;
        for (i=n-1;i>=1;i--){
            for (j=0;j<i;j++){
                if (arr[j]>arr[j+1]){
                    swap=arr[j] ;
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }
        System.out.println("Shorting array is:");
        for (i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    // main
    public static void main(String []args){
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("ehter the size:");
        int n =sc.nextInt();
        int []arr = new int[n];
        System.out.println("enter the number:");
        for (i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("array number:");
        for (i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //function call
        bubbleSthort(arr,n);
    }
}
