package defaultPackage;

import java.util.HashMap;

import test.RandomListNode;

public class Problem138 {

	public RandomListNode copyRandomList(RandomListNode head) {

		if (head == null) {
			return null;
		}

		RandomListNode introNode1 = new RandomListNode(0);
		RandomListNode introNode2 = new RandomListNode(0);

		HashMap<RandomListNode, Integer> map1 = new HashMap<RandomListNode, Integer>();
		HashMap<Integer, RandomListNode> map2 = new HashMap<Integer, RandomListNode>();

		introNode1.next = head;
		RandomListNode pre = introNode2;

		int i = 0;

		while (head != null) {
			map1.put(head, i);
			RandomListNode rln = new RandomListNode(head.label);
			map2.put(i, rln);
			i++;
			pre.next = rln;
			pre = pre.next;
			head = head.next;
		}

		RandomListNode head1 = introNode1.next;
		RandomListNode head2 = introNode2.next;

		while (head1 != null) {

			if (head1.random == null) {
				head2.random = null;
			}

			head2.random = map2.get(map1.get(head1.random));

			head1 = head1.next;
			head2 = head2.next;

		}

		return introNode2.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
