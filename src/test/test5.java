package test;

public class test5 {

	public static void main(String[] args) {
		
		ListNode listNode1 = new ListNode(1);
		
		ListNode listNode2 = listNode1;
		
		ListNode listNode3 = new ListNode(2);
		
		listNode3 = listNode1;
		
		ListNode listNode4 = new ListNode(4);
		listNode1.next = listNode4;
		
		
		System.out.println(listNode1.val);
		System.out.println(listNode2.val);
		System.out.println(listNode3.val);
		
		System.out.println(listNode1 == listNode2);
		System.out.println(listNode1 == listNode3);
		System.out.println(listNode2 == listNode3);
		
		System.out.println(listNode1.next.val);
		System.out.println(listNode2.next.val);
		System.out.println(listNode3.next.val);

	}

}
