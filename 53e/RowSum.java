import java.util.Scanner;

public class RowSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row and column size");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int max=0,min=0;
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum+=a[i][j];
            }
            if(i==0){
                min=sum;
            }
            System.out.println("sum of "+(i+1)+"row is "+sum);
            max=Math.max(max,sum);
            min=Math.min(min,sum);
        }
        System.out.println("max sum is "+max);
        System.out.println("min sum is "+min);
    }
}
