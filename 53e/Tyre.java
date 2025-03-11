import java.util.Scanner;

public class Tyre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println((int)((2*n)+(4*m)));
        sc.close();
    }
}
