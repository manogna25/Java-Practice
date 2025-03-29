import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size");
        int n=sc.nextInt();
        System.out.println("array elements");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("target");
        int se=sc.nextInt();
        boolean flag=false;
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==se){
                System.out.println(arr[mid]);
                flag=true;
                break;
            }
            if(arr[mid]<se){
                l=mid+1;
            }
            if(arr[mid]>se){
                h=mid-1;
            }

        }
        System.out.println("found??"+flag);
        sc.close();
    }
}
