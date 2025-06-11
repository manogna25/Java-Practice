package manu;

import java.util.Scanner;

public class Arraysss {
	int size=5;
	int[] arr=new int[size];
	void display() {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	void insertion(int element,int index) {
		if(index<0 || index>=size) {
			System.out.println("Index not valid");
		}
		else {
			arr[index]=element;
		}
	}
	void deletion(int index) {
		if(index<0 || index>=size) {
			System.out.println("Index not valid");
		}
		else {
			for(int i=index;i<size-1;i++) {
				arr[i]=arr[i+1];
			}
			size--;
		}
	}
	void search(int element) {
		for(int i=0;i<size;i++) {
			if(arr[i]==element) {
				System.out.println("Search element is found");
				return;
			}
		}
		System.out.println("Not found");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Arraysss w=new Arraysss();
		for(int i=0;i<w.size;i++) {
			int e=sc.nextInt();
			w.insertion(e, i);
		}
		w.display();
		w.deletion(2);
		w.display();
		w.search(10);
		w.insertion(23, 4);
		w.display();
		for(int i:w.arr) {
			System.out.println(i);
		}
		sc.close();
	}
}
