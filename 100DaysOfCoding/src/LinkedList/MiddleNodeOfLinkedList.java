package LinkedList;



public class MiddleNodeOfLinkedList {


	public static void middleNode(ListNode head){
		if(head == null){return;}
		ListNode current = head;
		while(current != null){
			
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
		ListNode fifth = new ListNode(5);
		
		head.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		middleNode(head);

	}

}
