import java.util.Scanner;

public class Rev {
    static int rev(int n){
        int result = 0;
        while(n>0){
            int r=n%10;
            result=result*10+r;
            n=n/10;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=rev(n);
        System.out.println(r);
        sc.close();
    }
}
