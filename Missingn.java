import java.util.*;

public class Missingn {
    int missing(int[] arr){
        int sum=0,sume=0;
        for(int i=0;i<arr.length+1;i++){
            sum+=i;
        }
        for(int i=0;i<arr.length;i++){
            sume+=arr[i];
        }
        return sum-sume;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Missingn m=new Missingn();
        int res=m.missing(arr);
        System.out.println(res);
        sc.close();
    }
}
