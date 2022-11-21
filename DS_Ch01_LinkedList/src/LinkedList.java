
public class LinkedList {
	private ListNode head;
	
	public LinkedList() {
		head = null;
	}
	
	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data);
		
		
	}
	
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data);
		
		
		
		
	}
	
	public void deleteLastNode() {
		ListNode pre, temp;
		
		
		
		
	}
	
	public ListNode searchNode(String data) {
		ListNode temp = this.head;
		
		
		
		
		
		return temp;
	}
	
	public void reverseList() {
		ListNode next = head;
		ListNode current = null;
		ListNode pre = null;
		
		
		head = current;
	}
	
	public void printList() {
		ListNode temp = this.head;
		System.out.printf("L = (");
		while(temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			if(temp != null) {
			System.out.printf(",");
			}
		}
		System.out.println(")");
	}
	
}
