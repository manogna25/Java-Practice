import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //sum of elements in 1d
        //int n=sc.nextInt();
        /*int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println("sum is "+sum);*/
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        int sum=0,ne=r*c;
        System.out.println("Enter 1st matrix elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter 2nd matrix elements");
        int crr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                crr[i][j]=sc.nextInt();
            }
        }
        //sum of emlemts in 2d
        /*for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum+=arr[i][j];
            }
        }
        System.out.println("sum of matrix is "+sum);
        System.out.println("Average is "+(sum/ne));*/
        //min and max elements in 2d
        /*int max=arr[0][0],min=arr[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
                max=Math.max(max,arr[i][j]);
                min=Math.min(min,arr[i][j]);
            }
        }
        System.out.println("max is "+max);
        System.out.println("Min is "+min);*/
        //counting elements less than k
        /*System.out.print("enter thr element ");
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]<k){
                    count++;
                }
            }
        }
        System.out.println("no of values less than "+k+" are "+count);*/
        //diagonal elements in matrix
        /*System.out.println("left to right: ");
        int dsum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j && i+j!=r){
                    System.out.println(arr[i][j]);
                }
            }
        }
        System.out.println("right to left: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i+j==r-1){
                    System.out.println(arr[i][j]);
                }
            }
        }
        System.out.print("Sum is: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j && i+j!=r){
                    dsum+=arr[i][j];
                }
                if(i!=j && i+j==r-1){
                    dsum+=arr[i][j];
                }
            }
        }
        System.out.println(dsum);*/
        //transpose
        /*int brr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                brr[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }*/
        //addition of two matrixes
        /*
        int add[][]=new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                add[i][j]=arr[i][j]+crr[i][j];
            }
        }
        System.out.println("sum of two matrices is ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println();
        }*/
        
        sc.close();
    }
}