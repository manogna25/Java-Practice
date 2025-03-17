import java.util.Scanner;

public class Jsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size:");
        int r=sc.nextInt();
        int[][] a2=new int[r][];
        for(int i=0;i<r;i++){
            System.out.println("enter col size:");
            int c=sc.nextInt();
            a2[i]=new int[c];
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<a2[i].length;j++){
                a2[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<a2[i].length;j++){
                sum+=a2[i][j];
            }
        }
        System.out.println("sum of jagged array is: "+sum);
    }
}
