import java.util.Scanner;

public class ArrayEg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,19,27,35,48,3};
        int n=arr.length;
        //int[] a={12,15,23,47,59,90};
        //int n=a.length;
        /*for(int i=0;i<a.length/2;i++){
            System.out.println(a[i]);
        }*/
        //half elements
        /*for(int i=0;i<n;i++){
            if(i>=n/2){
                break;
            }
            else{
                System.out.println(a[i]);
            }
        }*/
        //even indexed values
        /*for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println(i+"-"+a[i]);
            }
        }*/
        /*rotate last elemnet to the first place */
        int[] brr=new int[n];
        int le=arr[n-1];
        for(int i=0;i<n;i++){
            if(i==0){
                brr[i]=le;
            }
            else{
                brr[i]=arr[i-1];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(brr[i]+" ");
        }
    }
}
