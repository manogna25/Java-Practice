import java.util.Scanner;

public class Roller {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int h=sc.nextInt();
        if(x>h){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
