
public class LinkedList {
	
	Node head;
	Node tail;
	
	class Node{
		Node next;
		int data;
		
		Node(int d){
			data=d;
		}
	}
	
	public void addDataAtFrond(int d) {
		Node node=new Node(d);
		Node tmp=head;
		if(tmp==null) {
			head=node;
		}
		else {
			node.next=head;
			head=node;
		}
	}
	
	public void addDataAtEnd(int d) {
		Node node=new Node(d);
		Node tmp=tail;
		if(tmp==null) {
			head=node;
			tail=node;
		}
		else {
			tmp.next=node;
			tail=node;
		}
	}
	
	public void findElement(int d) {
		Node tmp=head;
		while(tmp!=null) {
			if(tmp.data==d) {
				System.out.println(d+" is available in list");
				return;
			}
			tmp=tmp.next;
		}
		System.out.println(d+" is not available in list");
		
	}
	
	public void deleteElement(int d) {
		Node tmp=head;
		Node tmpprev=null;
		while(tmp!=null) {
			if(tmp.data==d) {
				tmpprev.next=tmp.next;
			}
			tmpprev=tmp;
			tmp=tmp.next;
		}
	}
	
	public void addDataAtMiddle(int d,int v) {
		Node node=new Node(v);
		Node tmp=head;
		if(tmp==null) {
			head=node;
			tail=node;
		}
		else {
			while(tmp!=null) {
				if(tmp.data==d) {
					Node tmpNext=tmp.next;
					tmp.next=node;
					node.next=tmpNext;
					break;
				}
				tmp=tmp.next;
			}
		}
	}
	
	public void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedList obj=new LinkedList();
		obj.addDataAtEnd(10);
		obj.addDataAtEnd(20);
		obj.addDataAtEnd(30);
		obj.addDataAtMiddle(20,25);
		obj.print();
		System.out.println("==============================");
		obj.findElement(20);
		obj.deleteElement(30);
		System.out.println("==============================");
		obj.print();
		System.out.println("==============================");
		obj.findElement(20);
	}

}
