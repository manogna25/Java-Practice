import java.util.Scanner;

public class SwapAdj {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c[]=s.toCharArray();
        for(int i=0;i<c.length-1;i+=2){
            char temp=c[i];
            c[i]=c[i+1];
            c[i+1]=temp;
        }
        System.out.println(c);
        sc.close();
    }
}
