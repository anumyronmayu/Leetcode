package dataStructures.LinkList;

public class LinkListOperations {

	public static void searchByValue(ListNode head, int value) {

		ListNode p = head;

		while (p.next != null && p.val != value) {
			p = p.next;
		}

		if (p.val == value) {
			System.out.println(p.val);
		} else {
			System.out.println("No Such Node");
		}

	}

	public static void searchByIndex(ListNode head, int index) {

		ListNode p = head;

		int i = 0;

		while (p.next != null && i < index) {

			p = p.next;
			i++;

		}

		if (i == index) {
			System.out.println("The" + index + "node is: " + p.val);
		} else {
			System.out.println("No Such Node");
		}

	}

	public static ListNode insertNode(ListNode head) {
		
		

		return null;
	}

	public static ListNode deleteNode(ListNode head, int value) {
		
		

		return null;
	}

	public static void main(String[] args) {

		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);
		ListNode listNode5 = new ListNode(5);

		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;

		// searchByValue(listNode1, 6);

		searchByIndex(listNode1, 100);

	}

}
