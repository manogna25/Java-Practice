import java.util.Scanner;

public class Ballon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char s[]=str.toCharArray();
        int b=0,a=0,l=0,o=0,n=0;
        for(int i=0;i<s.length;i++){
            if(s[i]=='b'){
                b++;
            }
            if(s[i]=='a'){
                a++;
            }
            if(s[i]=='l'){
                l++;
            }
            if(s[i]=='o'){
                o++;
            }
            if(s[i]=='n'){
                n++;
            }
        }
        int min1=Math.min(Math.min(b,a),n);
        int min2=Math.min(l/2,o/2);
        int count=Math.min(min1,min2);
        //int count=(b+a+l+o+n)/7;
        System.out.println(count);
        /*
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='b') b++;
                else if(str.charAt(i)=='a') a++;
                else if(str.charAt(i)=='l') l++;
                else if(str.charAt(i)=='o') o++;
                else if(str.charAt(i)=='n') n++;
            }
                int[] arr={b,a,l,o,n};
                Arrays.sort(arr);
                System.out.println(arr[0])
         */
        sc.close();
    }
}
