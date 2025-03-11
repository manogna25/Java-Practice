import java.util.Scanner;

public class Fav {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0 && n%7==0){
            System.out.println("Alice takes");
        }
        else if(n%2!=0 && n%9==0){
            System.out.println("Bob takes");
        }
        else{
            System.out.println("Charlie takes");
        }
        sc.close();
    }
}
