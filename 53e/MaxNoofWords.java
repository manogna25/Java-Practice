import java.util.Arrays;
import java.util.Scanner;

public class MaxNoofWords {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//the sc.nextLine() is used to say the cursor we are considering the string input from next line not beside the int input 
        sc.nextLine();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.nextLine();
        }
        System.out.println(Arrays.toString(s));
        int max=0;
        for(int i=0;i<n;i++){
            String sarr[]=s[i].split(" ");
            max=Math.max(max,sarr.length);
        }
        System.out.println(max);
        sc.close();
    }
}
