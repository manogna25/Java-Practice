import java.util.Arrays;
import java.util.Scanner;

public class Rotatek {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter no of elements to rotate");
        int k=sc.nextInt();
        int brr[]=new int[n];
        int c=0;
        if(k<n){
            for(int i=k-1;i<n;i++){
                brr[c]=arr[i];
                c++;
            }
            for(int i=0;i<k-1;i++){
                brr[c]=arr[i];
                c++;
            }
        }
        System.out.println(Arrays.toString(brr));
        sc.close();
    }
}
