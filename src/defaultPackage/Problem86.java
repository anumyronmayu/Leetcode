package defaultPackage;

public class Problem86 {

	public ListNode partition(ListNode head, int x) {

		ListNode introNode1 = new ListNode(0);
		ListNode introNode2 = new ListNode(0);

		ListNode p = head;
		ListNode q = introNode1;
		ListNode r = introNode2;

		while (p != null) {

			if (p.val < x) {
				ListNode k = new ListNode(p.val);
				q.next = k;
				q = q.next;
			} else {
				ListNode k = new ListNode(p.val);
				r.next = k;
				r = r.next;
			}

			p = p.next;

		}

		q.next = introNode2.next;

		return introNode1.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
