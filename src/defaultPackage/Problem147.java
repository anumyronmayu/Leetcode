package defaultPackage;

import dataStructures.LinkList.ListNode;

public class Problem147 {

	public static ListNode insertionSortList(ListNode head) {

		ListNode introNode = new ListNode(0);

		if (head == null || head.next == null) {
			return head;
		} else {

			introNode.next = head;

			ListNode p = head.next;
			
			head.next = null;

			while (p != null) {
				ListNode r = p.next;

				ListNode q = introNode;

				while (q.next != null && q.next.val < p.val) {
					q = q.next;
				}

				ListNode s = q.next;
				q.next = p;
				p.next = s;

				p = r;

			}

			return introNode.next;

		}

	}

	public static void main(String[] args) {
		
		ListNode listNode1 = new ListNode(5);
		ListNode listNode2 = new ListNode(4);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(2);
		ListNode listNode5 = new ListNode(1);

		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;

		ListNode r = insertionSortList(listNode1);
		
		System.out.println(r.val);
		System.out.println(r.next.val);
		System.out.println(r.next.next.val);
		System.out.println(r.next.next.next.val);
		System.out.println(r.next.next.next.next.val);
	}

}
