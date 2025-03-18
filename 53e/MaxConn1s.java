import java.util.Scanner;

public class MaxConn1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=0,maxc=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                maxc++;
            }
            else{
                maxc=0;
            }
            max=Math.max(max,maxc);
        }
        System.out.println("max consecutive 1s is: "+max);
        sc.close();
    }
}
