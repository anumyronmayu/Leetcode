package defaultPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem234 {

	public boolean isPalindrome(ListNode head) {

		if (head == null) {
			return true;
		}

		List<Integer> list1 = new ArrayList<Integer>();

		while (head != null) {
			list1.add(head.val);
			head = head.next;
		}

		List<Integer> list2 = new ArrayList<Integer>();

		for (int i : list1) {
			list2.add(i);
		}

		Collections.reverse(list2);

		if (list1.equals(list2)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
