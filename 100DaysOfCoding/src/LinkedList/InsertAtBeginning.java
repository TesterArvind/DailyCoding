package LinkedList;


public class InsertAtBeginning {

	public static ListNode insertAtBeginning(ListNode head, int data){
		
		ListNode newNode = new ListNode(data);
		if(head == null){
			return newNode;
			}
	    newNode.next=head;
	    head=newNode;
		
		return head;
	}
	public static void display(ListNode head){
		if(head == null){return;}
		ListNode current = head;
		int count=0;
		while(current != null){
			count++;
			System.out.println(current.data);
			current= current.next;
		}
		System.out.println(count + " Is the length of Singly LinkedList");
		
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
		ListNode fifth = new ListNode(5);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		display(insertAtBeginning(head, 14));
//		System.out.println(insertAtBeginning());

	}

}
