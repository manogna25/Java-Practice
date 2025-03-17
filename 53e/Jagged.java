import java.util.Scanner;

public class Jagged {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int[][] arr={{1,2},{3,4,5},{6,7,8,9}};
        int[][] a1=new int[3][];
        a1[0]=new int[2];
        a1[1]=new int[3];
        a1[2]=new int[4];
        //0th row
        a1[0][0]=1;
        a1[0][1]=2;
        //1st row
        a1[1][0]=3;
        a1[1][1]=4;
        a1[1][2]=5;
        //2nd row
        a1[2][0]=6;
        a1[2][1]=7;
        a1[2][2]=8;
        a1[2][3]=9;
        //printing
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a1[i].length;j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
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
        System.out.println("printinggggg");
        for(int i=0;i<r;i++){
            for(int j=0;j<a2[i].length;j++){
                System.out.print(a2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
