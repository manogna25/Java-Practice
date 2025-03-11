import java.util.Scanner;

public class Eg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int n=ch;
        /*if(n>=((int)'a') && n<=((int)'z')){
            System.out.println(0);
        }
        else if(n>=((int)'A') && n<=((int)'Z')){
            System.out.println(1);
        }
        else{
            System.out.println(-1);
        }
        sc.close();
        */
        if(Character.isLowerCase(ch)){
            System.out.println(0);
        }
        else if(Character.isUpperCase(ch)){
            System.out.println(1);
        }
        else{
            System.out.println(-1);
        }
        sc.close();
    }
}
