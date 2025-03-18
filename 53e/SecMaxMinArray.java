import java.util.Scanner;

public class SecMaxMinArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        /*int max=arr[0],min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];

            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int max2=Integer.MIN_VALUE;
        int min2=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max2 && arr[i]!=max){
                max2=arr[i];
            }
            if(arr[i]<min2 && arr[i]!=min){
                min2=arr[i];
            }
        }
        System.out.println(max2+" "+min2);
        //System.out.println(Integer.MIN_VALUE);
        //System.out.println(Integer.MAX_VALUE);
        */
        int l=Integer.MIN_VALUE;
        int m=Integer.MAX_VALUE;
        int sl=Integer.MIN_VALUE;
        int sm=Integer.MAX_VALUE;
        for(int b:arr){
            if(b>l){
                sl=l;
                l=b;
            }
            else if(b>sl && b!=l){
                sl=b;
            }
        }
        for(int b:arr){
            if(b<m){
                sm=m;
                m=b;
            }
            else if(b<sm && b!=m){
                sm=b;
            }
        }
        System.out.println(sl+" "+sm);
        sc.close();
    }
}
