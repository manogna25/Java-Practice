import java.util.Scanner;

public class ArrSortNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;          //flag=true if(arr[i]>=arr[i+1]) then flag =false break;
        for(int i=0;i<n-1;i++){        
            if(arr[i]<=arr[i+1]){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
        }
        System.out.println(flag);
        sc.close();
    }
}
