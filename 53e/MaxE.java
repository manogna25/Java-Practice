import java.util.Scanner;

public class MaxE {
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
        //max element in a row
        /*for(int i=0;i<r;i++){
            int max=a[i][0],min=a[i][0];
            for(int j=0;j<c;j++){
                max=Math.max(max, a[i][j]);
                min=Math.min(min,a[i][j]);
            }
            System.out.println("max element in row "+(i+1)+" is: "+max);
            System.out.println("min element in row "+(i+1)+" is: "+min);
        }
        */
        int temp=0,sum,max=0;
        for(int i=0;i<r;i++){
            sum=0;
            for(int j=0;j<c;j++){
                sum+=a[i][j];
            }
            if(sum>max){
                temp=i;
                max=sum;
            }
        }
        System.out.println("max no of 1s is in row "+temp);
    }
}
