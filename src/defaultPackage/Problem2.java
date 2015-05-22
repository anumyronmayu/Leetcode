package defaultPackage;

public class Problem2 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int add = 0;

		ListNode l3 = new ListNode((l1.val + l2.val + add) % 10);

		ListNode q = l3;

		add = (l1.val + l2.val + add) / 10;

		while (l1.next != null || l2.next != null) {

			if (l1.next == null) {

				l2 = l2.next;

				ListNode p = new ListNode((l2.val + add) % 10);
				q.next = p;
				q = p;

				add = (l2.val + add) / 10;

			} else if (l2.next == null) {

				l1 = l1.next;

				ListNode p = new ListNode((l1.val + add) % 10);
				q.next = p;
				q = p;

				add = (l1.val + add) / 10;

			} else {

				l1 = l1.next;
				l2 = l2.next;

				ListNode p = new ListNode((l1.val + l2.val + add) % 10);
				q.next = p;
				q = p;

				add = (l1.val + l2.val + add) / 10;

			}

		}

		if (add == 1) {
			ListNode p = new ListNode(add);
			q.next = p;
		}

		return l3;

	}

	public static void main(String args[]) {

		ListNode l10 = new ListNode(9);
		ListNode l20 = new ListNode(1);

		ListNode l11 = new ListNode(8);
		// ListNode l21 = new ListNode(6);

		l10.next = l11;
		// l20.next = l21;

		/*
		 * ListNode l12 = new ListNode(1); ListNode l22 = new ListNode(8);
		 * 
		 * l11.next = l12; l21.next = l22;
		 * 
		 * ListNode l13 = new ListNode(2); ListNode l23 = new ListNode(7);
		 * 
		 * l12.next = l13; l22.next = l23;
		 * 
		 * ListNode l14 = new ListNode(3); ListNode l24 = new ListNode(6);
		 * 
		 * l13.next = l14; l23.next = l24;
		 * 
		 * ListNode l15 = new ListNode(3); l14.next = l15;
		 */

		ListNode l3 = addTwoNumbers(l10, l20);

		System.out.println(l3.val);
		System.out.println(l3.next.val);
		// System.out.println(l3.next.next.val);
		// System.out.println(l3.next.next.next.val);
		// System.out.println(l3.next.next.next.next.val);
		// System.out.println(l3.next.next.next.next.next.val);

	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}