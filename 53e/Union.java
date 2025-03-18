import java.util.Arrays;
import java.util.Scanner;

public class Union {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size of 1st");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("size of 2nd ");
        int n2=sc.nextInt();
        int[] brr=new int[n];
        for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }
        int c[]=new int[n+n2];
        int k=0;
        for(int i=0;i<n;i++){
            c[k++]=arr[i];
        }
        for(int i=0;i<n2;i++){
            c[k++]=brr[i];
        }
        System.out.println(Arrays.toString(c));
        sc.close();
    }
}
