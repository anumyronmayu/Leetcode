package defaultPackage;

import test.ListNode;

public class Problem21 {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode p = l1;
		ListNode q = l2;

		ListNode result = new ListNode(0);

		ListNode r = result;

		while (p != null && q != null) {

			if (p.val <= q.val) {

				ListNode listNode = new ListNode(p.val);

				r.next = listNode;

				r = r.next;
				
				p = p.next;

			} else {

				ListNode listNode = new ListNode(q.val);

				r.next = listNode;

				r = r.next;
				
				q = q.next;

			}

		}
		
		if(p == null && q != null){
			r.next = q;
		}
		
		if(p != null && q == null){
			r.next = p;
		}

		return result.next;

	}

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		ListNode listNode4 = new ListNode(4);
		ListNode listNode5 = new ListNode(5);

		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		listNode4.next = listNode5;
		
		ListNode listNode21 = new ListNode(2);
		ListNode listNode22 = new ListNode(3);
		ListNode listNode23 = new ListNode(4);
		ListNode listNode24 = new ListNode(5);
		ListNode listNode25 = new ListNode(6);

		listNode21.next = listNode22;
		listNode22.next = listNode23;
		listNode23.next = listNode24;
		listNode24.next = listNode25;
		
		
		System.out.println(mergeTwoLists(listNode1, listNode21).val);
		System.out.println(mergeTwoLists(listNode1, listNode21).next.val);
		System.out.println(mergeTwoLists(listNode1, listNode21).next.next.val);
		System.out.println(mergeTwoLists(listNode1, listNode21).next.next.next.val);
		System.out.println(mergeTwoLists(listNode1, listNode21).next.next.next.next.val);
		System.out.println(mergeTwoLists(listNode1, listNode21).next.next.next.next.next.val);

	}

}
