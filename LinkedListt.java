package manu;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public class LinkedListt {
	Node head;
	void InsertionBeg(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
		}
		else {
			node.next=head;
			head=node;
		}
	}
	void InsertAtEnd(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=node;
		}
		else {
			Node t=head;
			while(t.next!=null) {
				t=t.next;
			}
			t.next=node;
		}
	}
	int countNodes() {
		int count=0;
		Node t=head;
		while(t!=null) {
			count++;
			t=t.next;
		}
		return count;
	}
	void InsertAtPosition(int pos,int data) {
		Node node=new Node(data);
		int count=countNodes();
		if(pos>count || pos<0) {
			System.out.println("Invalid pos");
		}
		else {
			Node t=head;
			//i=1 to i<pos-1 same position , i=0 to i<pos-1 after
			for(int i=1;i<pos-1;i++) {
				t=t.next;
			}
			node.next=t.next;
			t.next=node;
		}
	}
	void InsertBeforeEle(int element,int data) {
		Node node=new Node(data);
		if(head.data==element) {
			InsertionBeg(data);
			return;
		}
		Node t=head;
		while(t.next.data!=element && t!=null) {
			t=t.next;
			if(t.next==null) {
				System.out.println("not possible");
				return;
			}
		}
		if(t==null) {
			System.out.println("value not possible");
		}
		else {
			node.next=t.next;
			t.next=node;
		}
		
	}
	void deleteAtBeg() {
		if(head==null) {
			System.out.println("Not possible");
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		head=head.next;
		
	}
	void deleteAtEnd() {
		if(head==null) {
			System.out.println("Deletion not possible");
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		Node t=head;
		//Node prev=null;
		while(t.next.next!=null) {
			//prev=t;
			t=t.next;
		}
		t.next=null;
		//prev.next=null;
	}
	void deleteAtPos(int pos) {
		if(head==null) {
			System.out.println("Deletion not possible");
		}
		int count=countNodes();
		if(pos>count || pos<0) {
			System.out.println("Invalid pos");
		}
		if(pos==1) {
			deleteAtBeg();
		}
		if(pos==count) {
			deleteAtEnd();
			return;
		}
		else {
			Node t=head;
			for(int i=1;i<pos-1;i++) {
				if(t==null) {
					return;
				}
				t=t.next;
			}
			t.next=t.next.next;
			
		}
	}
	void deleteByValue(int val) {
		if(head==null) {
			System.out.println("Deletion not possible");
		}
		if(head.data==val) {
			deleteAtBeg();
		}
		Node t=head;
		while(t.next!=null && t.next.data!=val) {
			t=t.next;
		}
		if(t.next==null) {
			System.out.println("Not found");
			return;
		}
		if(t.next.next==null) {
			t.next=null;
		}
		else {
			t.next=t.next.next;
		}
	}
	void display(){
		if(head==null) {
			System.out.println("LL is empty");
		}
		else {
			Node t=head;
			while(t!=null) {
				System.out.print(t.data+" -> ");
				t=t.next;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		LinkedListt l=new LinkedListt();
		l.InsertionBeg(20);
		l.InsertionBeg(12);
		l.InsertionBeg(45);
		l.InsertionBeg(34);
		l.display();
		l.InsertAtEnd(89);
		l.display();
		l.InsertAtPosition(2, 19);
		l.display();
		l.InsertBeforeEle(19, 67);
		l.display();
		l.deleteAtBeg();
		l.display();
		l.deleteAtEnd();
		l.display();
		l.deleteAtPos(4);
		l.display();
		l.deleteByValue(20);
		l.display();
	}
}
