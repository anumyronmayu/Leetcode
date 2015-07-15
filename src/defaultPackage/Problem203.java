package defaultPackage;

public class Problem203 {

	public ListNode removeElements(ListNode head, int val) {

		ListNode introNode = new ListNode(0);
		introNode.next = head;

		ListNode p = head;
		ListNode pre = introNode;

		while (p != null) {

			ListNode r = p.next;

			if (p.val == val) {
				pre.next = r;
				p = r;
			} else {

				p = r;
				pre = pre.next;
			}
		}

		return introNode.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
