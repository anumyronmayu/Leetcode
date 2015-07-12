package defaultPackage;

import dataStructures.LinkList.*;

public class Problem141 {

	public static boolean hasCycle(ListNode head) {

		ListNode p = head;
		ListNode q = head;

		if (head == null) {
			return false;
		}

		while (p.next != null && q.next != null && q.next.next != null) {
			p = p.next;
			q = p.next.next;

			if (p.next == q.next) {
			// or 	if (p == q) {
				return true;
			}

		}

		return false;

	}

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);

		listNode1.next = listNode2;
		listNode2.next = listNode1;

		System.out.println(hasCycle(listNode1));

	}

}
