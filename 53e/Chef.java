import java.util.Scanner;

public class Chef {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("No of 500/- needed are "+((n*2000)/500));
        sc.close();
    }

}
