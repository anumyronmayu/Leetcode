package defaultPackage;

public class Problem24 {

	public static ListNode swapPairs(ListNode head) {

		ListNode introNode = new ListNode(0);

		introNode.next = head;

		ListNode p = head;

		ListNode previous = introNode;

		while (p != null && p.next != null) {
			ListNode q = p.next;
			p.next = q.next;
			previous.next = q;
			q.next = p;
			previous = p;
			p = p.next;

		}

		return introNode.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
