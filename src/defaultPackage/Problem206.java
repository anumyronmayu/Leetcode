package defaultPackage;

public class Problem206 {

	public static ListNode reverseList(ListNode head) {

		ListNode introNode = new ListNode(0);
		ListNode p = head;

		while (p != null) {

			ListNode q = p.next;
			p.next = introNode.next;
			introNode.next = p;
			p = q;

		}

		return introNode.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
