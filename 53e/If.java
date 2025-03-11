import java.util.Scanner;

class If{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println(a+" is even");
        }
        System.out.println("OUT");
        sc.close();
    }
}