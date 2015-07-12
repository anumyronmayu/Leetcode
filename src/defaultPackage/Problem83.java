package defaultPackage;

import test.ListNode;

public class Problem83 {

	public static ListNode deleteDuplicates(ListNode head) {

		//

		if (head == null) {
			return null;
		}

		ListNode p = head;

		int currentValue = head.val;

		while (p.next != null) {

			if (p.next.val == currentValue) {
				// delete
				p.next = p.next.next;

			} else {
				p = p.next;
				currentValue = p.val;
			}

		}

		return head;

	}

	public static void main(String[] args) {

		ListNode listNode1 = new ListNode(2);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(2);
		ListNode listNode4 = new ListNode(2);
		ListNode listNode5 = new ListNode(2);

		//listNode1.next = listNode2;
		//listNode2.next = listNode3;
		//listNode3.next = listNode4;
		//listNode4.next = listNode5;

		ListNode result = deleteDuplicates(listNode1);

		while (result != null) {
			System.out.println(result.val);
			result = result.next;
		}

	}

}
