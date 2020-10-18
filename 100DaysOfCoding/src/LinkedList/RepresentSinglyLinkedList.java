package LinkedList;

public class RepresentSinglyLinkedList {
	
	
//	 Linked list is a sequence of node, each node contains data 
//	 and reference to next node.
	
	
//	private ListNode head;
	
	public static void display(ListNode head){
		if(head == null){return;}
		ListNode current = head;
		while(current != null){
			System.out.println(current.data);
			current= current.next;
		}
		
		
	}
	
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data){	
			this.data=data;
			this.next=null;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(30);
		ListNode fourth = new ListNode(4);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		
		display(head);

	}

}
