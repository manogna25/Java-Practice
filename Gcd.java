import java.util.Scanner;

public class Gcd {
    int gcd(int a,int b){
        while (b!=0) {
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        Gcd g=new Gcd();
        int res=g.gcd(n1, n2);
        int lcm=(n1*n2)/res;
        System.out.println("gcd "+ res);
        System.out.println("lcm "+ lcm);
    }
}
