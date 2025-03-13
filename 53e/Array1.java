import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        //int[] brr={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        //declare
        int arr[]=new int[n];
        //int sum=0;
        System.out.println("Enter Array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //System.out.println("Printinggggggggg");
        //int countp=0,countn=0,zc=0;
        /*for(int i=0;i<n;i++){
            //System.out.print(arr[i]+" ");
            //sum+=arr[i];
            if(arr[i]>m){
                m=arr[i];
            }
            if(arr[i]<m){
                m=arr[i];
            }
            if(arr[i]>0){
                System.out.print(arr[i]+" ");
                countp++;
            }
            if(arr[i]==0){
                zc++;
            }
        }
        System.out.println();
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
                countn++;
            }
        }*/
        int m=arr[0],a=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>m){
                a=m;
                m=arr[i];
            }
            else if(arr[i]>a && a>m){
                a=arr[i];
            }
        }
        /*for(int i=0;i<n;i++){
            if(arr[i]>a && arr[i]!=m){
                a=arr[i];
            }
        }*/
        System.out.println("2nd largest: "+a);
        
        /*System.out.println("Enter search element: ");
        int se=sc.nextInt();
        int sec=0;
        for(int i=0;i<n;i++){
            if(arr[i]==se){
                sec++;
            }
        }
        System.out.println(se+" repeats "+sec+" times");*/
        //System.out.println("positive count: "+countp);
        //System.out.println("negative count: "+countn);
        //System.out.println("zero count: "+zc);
        //System.out.println("Min number is:"+m);
        //System.out.println("Max number is:"+m);
        //System.out.println("Sum of array: "+sum);
        /*
        System.out.println(brr.length);
        for(int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<brr.length;i++){
            System.out.println(i+" "+brr[i]+" ");
        }*/
        /*for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(arr[n-i-1]+" ");
        }
        */
        System.out.println();
        sc.close();
    }
}
