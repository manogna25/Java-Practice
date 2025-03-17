import java.util.Scanner;

public class Mul {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows and colums of 1st matrix:");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int arr[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter no of rows and colums of 2nd matrix:");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int brr[][]=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                brr[i][j]=sc.nextInt();
            }
        }
        int[][] mul=new int[r1][c2];
        if(c1==r2){
            for(int i=0;i<r1;i++){
                for(int j=0;j<c1;j++){
                    for(int k=0;k<r2;k++){
                        mul[i][j]+=arr[i][k]*brr[k][j];
                    }
                }
            }
        }
        else{
            System.out.println("Not possible");
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
}
