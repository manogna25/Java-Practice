import java.util.Scanner;

public class FirstPaliStr {

    boolean palindrome(String s){
        boolean result=false;
        /*StringBuffer s1=new StringBuffer(s);
        s1.reverse();
        String rev=new String(s1);*/
        String rev="";
        for(int i=0;i<s.length();i++){
            rev=rev+s.charAt(s.length()-i-1);
        }
        if(s.equals(rev)){
            result=true;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        FirstPaliStr f=new FirstPaliStr();
        for(int i=0;i<n;i++){
            boolean result=f.palindrome(s[i]);
            if(result){
                System.out.println(s[i]);
                break;
            }
        }
        
    }
}
