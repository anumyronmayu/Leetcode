package defaultPackage;

public class Problem19 {

	public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode p = head;
		int i = 0;

		while (p.next != null && i < n - 1) {
			p = p.next;
			i++;
		}

		ListNode introNode = new ListNode(0);

		introNode.next = head;

		ListNode q = head;
		ListNode pre = introNode;

		while (p.next != null) {
			p = p.next;
			q = q.next;
			pre = pre.next;
		}

		pre.next = q.next;

		return introNode.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
