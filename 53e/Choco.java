import java.util.Scanner;
class Choco{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int f=(5*a)+(10*b);
        System.out.println((int)(f/c));
        sc.close();
    }
}