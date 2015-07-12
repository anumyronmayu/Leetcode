package defaultPackage;

import java.util.HashMap;

import dataStructures.LinkList.ListNode;

public class Problem160 {

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		//

		if (headA == null || headB == null) {
			return null;
		}

		ListNode p = headA;
		ListNode q = headB;
		HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();

		while (p != null) {
			map.put(p, 1);
			p = p.next;
		}

		while (q != null) {

			if (map.get(q) != null) {
				return q;
			}

			q = q.next;

		}

		return null;

	}

	public static void main(String[] args) {

		ListNode listNode1 = new ListNode(2);
		ListNode listNode2 = new ListNode(4);
		ListNode listNode3 = new ListNode(6);
		ListNode listNode4 = new ListNode(8);
		ListNode listNode5 = new ListNode(10);
		ListNode listNode6 = new ListNode(12);
		ListNode listNode7 = new ListNode(14);
		ListNode listNode8 = new ListNode(16);
		ListNode listNode9 = new ListNode(18);
		ListNode listNode10 = new ListNode(20);
		ListNode listNode11 = new ListNode(22);

		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;
		listNode5.next = listNode6;
		listNode6.next = listNode7;
		listNode7.next = listNode8;
		listNode8.next = listNode9;
		listNode9.next = listNode10;
		listNode10.next = listNode11;

		ListNode listNode = new ListNode(1);

		System.out.println(getIntersectionNode(listNode, listNode));

	}

}
