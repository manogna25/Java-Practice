import java.util.Scanner;

public class Swapcase {
    public static void main(String[] args) {
        //Qiscet==>qISCET
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String s="";
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                s+=(str.charAt(i)+"").toLowerCase();
            }
            if(Character.isLowerCase(str.charAt(i))){
                s+=(str.charAt(i)+"").toUpperCase();
            }
        }
        System.out.println(s);
        sc.close();
    }
}
