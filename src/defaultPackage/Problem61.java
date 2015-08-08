package defaultPackage;

public class Problem61 {

	public ListNode rotateRight(ListNode head, int k) {

		if (head == null) {
			return null;
		}

		ListNode introNode = new ListNode(0);
		introNode.next = head;

		int count = 1;

		while (head.next != null) {
			count++;
			head = head.next;
		}

		ListNode last = head;

		k = k % count;

		if (k == 0) {
			return introNode.next;
		}

		int index = 0;

		head = introNode.next;

		while (head != null) {
			index++;
			if (index == (count - k)) {
				break;
			}
			head = head.next;
		}

		last.next = introNode.next;
		introNode.next = head.next;
		head.next = null;

		return introNode.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
