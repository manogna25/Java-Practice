import java.util.Scanner;

public class StrWayTooLong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(str.length()>10){
            System.out.println(str.charAt(0)+""+(str.length()-2)+""+str.charAt(str.length()-1));
        }
        else{
            System.out.println(str);
        }
        sc.close();
    }
}
