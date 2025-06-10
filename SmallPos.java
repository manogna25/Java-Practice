package manu;
import java.util.*;
public class SmallPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int min=1;
		for(int i=0;i<n;i++) {
			if(a[i]>0) {
				if(a[i]==min) {
					min++;
				}
				
			}
		}
		System.out.println(min);
		sc.close();
	}

}
