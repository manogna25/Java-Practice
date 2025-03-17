import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {
        int arr1[]={5,53,2,34};
        /*Arrays.sort(arr1);
        for(int a:arr1){
            System.out.println(a);
        }
        */
        /*int arr2[]={5,53,2,34};
        System.out.println(Arrays.equals(arr1,arr2));*/
        int arr3[]=new int[10];
        Arrays.fill(arr3,34);
        for(int a:arr3){
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr3));
        int[] arr4=Arrays.copyOf(arr3, 5);
        for(int a:arr4){
            System.out.println(a);
        }
        int index=Arrays.binarySearch(arr1, 4);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println(index);
        }
    }
}
