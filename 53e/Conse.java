import java.util.*;

public class Conse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i+1]==arr[i]+1){
                flag=true;
            }
        }
        System.out.println(flag);

    }
}
