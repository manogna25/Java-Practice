import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    static int count(int n){
        int count=0;
        while(n>0){
            count+=1;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n,sum=1;
        int order=count(n);
        while(temp>0){
            int r=temp%10;
            sum=(int) (sum+Math.pow(r,order));
            temp/=10;
        }
        if(n==sum){
            System.out.println("It is armstrong");
        }
        else{
            System.out.println("not");
        }
        sc.close();
    }
}
