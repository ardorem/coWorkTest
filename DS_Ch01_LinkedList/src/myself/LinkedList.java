package myself;

public class LinkedList {
	private ListNode head;
	
	public LinkedList() {
		head = null;
	}
	
	public void insertMiddleNode(ListNode pre, String data) {
		ListNode newNode = new ListNode(data);
		newNode.link = pre.link;
		pre.link = newNode;
	}
	
	public void insertLastNode(String data) {
		ListNode newNode = new ListNode(data);
//		if (this.head == null) {
//			this.head = newNode;
//		} else if(this.head.link == null){
//			this.head.link = newNode;
//		}else if(this.head.link.link == null) {
//			this.head.link.link = newNode;
//		}else if(this.head.link.link.link == null) {
//			this.head.link.link.link = newNode;
//		}
		if (this.head == null) {
			this.head = newNode;
		} else if(this.head.link == null){
			this.head.link = newNode;
		} else {
			ListNode temp = this.head.link;
			while(temp.link != null) {
				temp = temp.link;
			}
			temp.link = newNode;
		}
	}
	
	public void deleteLastNode() {
		ListNode pre, temp;
		temp = this.head;
		head = null;
		while(temp.link != null) {
			pre = temp;
			temp = temp.link;
			insertLastNode(pre.getData());
		}
		
	}
	
	public ListNode searchNode(String data) {
		ListNode temp = this.head;
		while(temp != null) {
			if(temp.getData() == data) {
//				return temp;
				break;
			}else {
				temp = temp.link;
			}
		}
//		return null;
		return temp;
	}
	
	public void reverseList() {
		ListNode next = head;
		ListNode current = null;
		ListNode pre = null;
		
		while(next != null) {
		pre = current;
		current = next;
		//---------
		next = next.link;
		current.link = pre;
		//current.link = pre;라인이 먼저 실행되면, 첫번째 반복에서 head인 1의 링크가 null이 되어버린다.
		//----------
		}
//		while(head != null) {
//		if(current == null) {
//		while(next.link != null) {
//			pre = next;
//			next = next.link;
//		}
//		current = next;
//		pre.link = null;
//		next = head;
//		}else {
//			while(next.link != null) {
//				pre = next;
//				next = next.link;
//			}
//			current.link = next;//비어있는 링크를 찾아 넣어줘야 한다.
//			pre.link = null;
//			next = head;
//		}
//		}
		
//		ListNode temp = this.head.link;
//	
//		while(temp.link.link != null) {
//			pre = temp;
//			temp = temp.link;
//		}
//		current = temp.link;//7
//		current.link = temp;//5
//		temp.link = null;
//		temp = null;
//		pre.link = null; // 7, 5 무한루프
		
	
		/*
		while(next != null) {
			pre = next;
//			pre.link = null; //next의 link도 null 이 된다.
			
			if(next.link !=null) {
			current = next.link;
			current.link=pre;}
			else {
				current.link = current;
				current = next;
			}
			next = next.link;
		
		}
		*/ //무한루프(1,2)
		
//		while(next != null) {
//			pre = next;
//			current = next.link;
//			next = next.link.link;
//			
//		}
		
		
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
