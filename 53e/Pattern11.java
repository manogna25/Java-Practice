import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                
                System.out.print("* ");
            }
            for(int k=0;k<2*n-(2*i+2);k++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            for(int j=i;j>=0;j--){
                
                System.out.print("* ");
            }
            for(int k=(2*n-(2*i+2));k>0;k--){
                System.out.print("  ");
            }
            for(int l=i;l>=0;l--){
                
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
