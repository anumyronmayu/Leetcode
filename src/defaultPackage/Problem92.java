package defaultPackage;

public class Problem92 {

	public ListNode reverseBetween(ListNode head, int m, int n) {

		ListNode introNode1 = new ListNode(0);
		introNode1.next = head;

		int i = 0;

		ListNode p = head;
		ListNode pre = introNode1;

		while (p != null && i < m - 1) {

			p = p.next;
			pre = pre.next;
			i++;

		}

		ListNode q = head;
		int j = 0;
		while (q != null && j < n - 1) {
			q = q.next;
			j++;
		}

		ListNode r = q.next;

		pre.next = null;
		q.next = null;

		// reverse LinkList
		ListNode introNode2 = new ListNode(0);
		ListNode s = p;

		while (s != null) {

			ListNode t = s.next;
			s.next = introNode2.next;
			introNode2.next = s;
			s = t;

		}

		pre.next = introNode2.next;
		// reverse LinkList

		ListNode x = introNode1;

		while (x.next != null) {
			x = x.next;
		}

		x.next = r;

		return introNode1.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
