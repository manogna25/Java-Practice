import java.util.Scanner;

public class Bucket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int res=w+(y*z);
        if(res>x){
            System.out.println("Overflow");
        }
        else if(res==x){
            System.out.println("Exactly filled");
        }
        else{
            System.out.println("underflow");
        }

    }
}
