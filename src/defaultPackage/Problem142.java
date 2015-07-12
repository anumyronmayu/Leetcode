package defaultPackage;

import java.util.HashMap;

import dataStructures.LinkList.ListNode;

public class Problem142 {

	public static ListNode detectCycle(ListNode head) {

		ListNode p = head;
		ListNode q = head;

		boolean hasCycle = false;

		if (head == null) {
			return null;
		}

		while (p.next != null && q.next != null && q.next.next != null) {
			p = p.next;
			q = q.next.next;

			if (p == q) {
				hasCycle = true;
				break;
			}
		}

		if (hasCycle == false) {
			return null;
		} else {

			ListNode r = p;
			ListNode s = head;

			HashMap<ListNode, Integer> map = new HashMap<ListNode, Integer>();

			map.put(r, 1);
			r = r.next;
			
			while (r != p) {
				map.put(r, 1);
				r = r.next;
			}

			if (map.get(s) != null) {
				return s;
			}
			s = s.next;
			
			while (s != p) {

				if (map.get(s) != null) {
					return s;
				}

				s = s.next;

			}	

			return p;
		}

	}

	public static void main(String[] args) {

		ListNode listNode1 = new ListNode(1);
		listNode1.next = listNode1;

		System.out.println(detectCycle(listNode1));
	}

}
