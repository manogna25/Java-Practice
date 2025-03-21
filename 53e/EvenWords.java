//import java.util.Arrays;
import java.util.Scanner;

public class EvenWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        for(int i=0;i<s.length;i++){
            if(s[i].length()%2==0){
                System.out.println(s[i]);
            }
        }
        sc.close();
        
    }
}
