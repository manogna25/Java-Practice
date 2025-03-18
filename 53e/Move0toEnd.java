import java.util.Scanner;

public class Move0toEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //using temp
        /*int[] brr=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                brr[count]=arr[i];
                count++;
            }
        } 
        for(int i=count;i<n;i++){
            brr[count]=0;
        }
        for(int k:brr){
            System.out.print(k+" ");
        }
        System.out.println();*/
        //swapping
        for(int i=0;i<n-1;i++){
            if(arr[i]==0&&arr[i+1]!=0){
                arr[i]=arr[i+1];
                arr[i+1]=0;
            }
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
        sc.close();
    }
}
