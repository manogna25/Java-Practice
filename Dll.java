package DoublyLL;
class Node{
	int data;
	Node next;
	Node prev;
	Node(int data){
		this.data=data;
	}
}
public class Dll {
	Node head;
	Node tail;
	void insertAtBeg(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=tail=node;
		}
		else {
			node.next=head;
			head.prev=node;
			head=node;
		}
	}
	void insertAtEnd(int data) {
		Node node=new Node(data);
		if(head==null) {
			head=tail=node;
		}
		else {
			tail.next=node;
			node.prev=tail;
			tail=node;
		}
	}
	int countNodes() {
		Node t=head;
		int count=0;
		while(t!=null) {
			count++;
			t=t.next;
		}
		return count;
	}
	void insertAtPos(int pos,int data) {
		Node node=new Node(data);
		if( pos>countNodes() || pos<1) {
			System.out.println("wrong pos");
			return;
		}
		if(pos==1) {
			insertAtBeg(data);
			return;
		}
		Node t=head;
		for(int i=1;i<pos-1;i++) {
			t=t.next;
		}
		node.next=t.next;
		node.prev=t;
		t.next=node;
		t.next.prev=node;
	}
	void insertBeforeVal(int val,int data) {
		Node node=new Node(data);
		if(head==null) {
			System.out.println("Not possible dll is empty");
			return;
		}
		if(head.data==val) {
			insertAtBeg(data);
			return;
		}
		Node t=head;
		while(t.next!=null && t.next.data!=val) {
			t=t.next;
		}
		if(t.next==null) {
			System.out.println("Not found");
			return;
		}
		node.next=t.next;
		node.prev=t;
		t.next=node;
		t.next.prev=node;
	}
	void deleteAtBeg() {
		if(head==null) {
			System.out.println("Dll is empty");
			return;
		}
		if(head.next==null) {
			head=tail=null;
			return;
		}
		head=head.next;
		head.prev=null;
	}
	void deleteAtEnd() {
		if(head==null) {
			System.out.println("dll is empty");
			return;
		}
		if(head.next==null) {
			head=tail=null;
			return;
		}
		tail=tail.prev;
		tail.next=null;
		
	}
	void deleteAtPos(int pos) {
		if( pos>countNodes() || pos<1) {
			System.out.println("wrong pos");
			return;
		}
		if(pos==1) {
			deleteAtBeg();
			return;
		}
		if(pos==countNodes()) {
			deleteAtEnd();
			return;
		}
		Node t=head;
		for(int i=1;i<pos-1;i++) {
			t=t.next;
		}
		t.next=t.next.next;
		t.next.prev=t;
	}
	void deleteByVal(int val) {
		if(head==null) {
			System.out.println("dll is empty");
			return;
		}
		if(head.data==val) {
			deleteAtBeg();
			return;
		}
		if(tail.data==val) {
			deleteAtEnd();
			return;
		}
		Node t=head;
		while(t.next!=null && t.next.data!=val) {
			t=t.next;
		}
		if(t.next==null) {
			System.out.println("Not Found");
			return;
		}
		t.next=t.next.next;
		t.next.prev=t;
	}
	void search(int ele) {
		if(head==null) {
			System.out.println("dll is empty");
			return;
		}
		if(head.data==ele) {
			System.out.println("Found");
			return;
		}
		if(tail.data==ele) {
			System.out.println("found");
			return;
		}
		Node t=head;
		while(t.next!=null && t.next.data!=ele) {
			t=t.next;
		}
		if(t.next==null) {
			System.out.println("Not Found");
			return;
		}
		if(t.next.data==ele) {
			System.out.println("Found");
		}
		else {
			System.out.println("not found");
		}
	}
	void display() {
		if(head==null) {
			System.out.println("No elements");
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
		Dll d=new Dll();
		d.insertAtBeg(12);
		d.insertAtBeg(45);
		d.insertAtBeg(67);
		d.insertAtBeg(87);
		d.insertAtBeg(99);
		d.display();
		d.insertAtEnd(33);
		d.display();
		/*d.insertAtPos(6,17);
		d.display();
		d.insertBeforeVal(67,56);
		d.display();*/
		d.display();
		d.deleteAtBeg();
		d.display();
		d.deleteAtEnd();
		d.display();
		d.deleteAtPos(3);
		d.display();
		d.deleteByVal(45);
		d.display();
		d.search(45);
	}
}
