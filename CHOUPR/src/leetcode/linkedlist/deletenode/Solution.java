package leetcode.linkedlist.deletenode;

/*
 * Input: head = [4,5,1,9], n = 5
   Output: [4,1,9]
 */

public class Solution {
	ListNode tempNode = null;
	Solution(ListNode node){
		tempNode = node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode listnode = new ListNode(4);
		listnode.next = new ListNode(5);
		listnode.next.next = new ListNode(1);
		listnode.next.next.next = new ListNode(9);
		
		Solution solution = new Solution(listnode);
		solution.deleteNode(listnode.next.next);
		
		System.out.println("===== [4,5,1,9]=======");
		while(solution.tempNode!=null) {
			System.out.println("....>"+solution.tempNode.val);
			solution.tempNode = solution.tempNode.next;
		}
	}
	
    public void deleteNode(ListNode node) {
    	//¸Ñªk¡Ghttps://leetcode.com/problems/delete-node-in-a-linked-list/solution/
    	node.val = node.next.val;
        node.next = node.next.next;
    	
    }
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { 
		val = x; 
	}
}