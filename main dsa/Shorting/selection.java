import java.util.Scanner;

public class selection {
    static void seleShort(int arr[],int n){
        int i,j;
        int swp;
        int min;
        for (i=0;i<n-1;i++){
            min =i;
            for(j=i+1;j<n;j++){
                if (arr[min]>arr[j]) min =j;
            }
            swp=arr[i];
            arr[i]=arr[min];
            arr[min]=swp;
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
        int n = sc.nextInt();
        int []arr= new int[n];
        System.out.println("enter the numbres :");
        for (i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("array is:");
        for (i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        seleShort(arr,n);
    }
}
