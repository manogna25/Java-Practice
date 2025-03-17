import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*int marks[][]={{40,70,50},{28,34,54}};
        System.out.println(marks.length);
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[0].length;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }*/
        System.out.println("Enter row and column value");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        System.out.println("Enter matrix values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Printing----------");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of matrix is");
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum+=mat[i][j];
            }
        }
        System.out.println(sum);
    }
}