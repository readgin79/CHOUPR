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
		solution.deleteNode(new ListNode(1));
		
		System.out.println(solution.tempNode.next);
		while(solution.tempNode!=null) {
			System.out.println("....>"+solution.tempNode.val);
			solution.tempNode = solution.tempNode.next;
		}
	}
	
    public void deleteNode(ListNode node) {
        //[4,5,1,9], n = 1
    	boolean isFindNext = true;
    	ListNode t_temp = null;
    	System.out.println(tempNode.val);
    	t_temp = tempNode.next; //5
        while(isFindNext) {
        	
        	if(node.val==tempNode.val) {
        	//鏈結的第一個先忽略	
        		tempNode = tempNode.next;
        		isFindNext = false;
        	}else {
        		
        		if(t_temp.val==node.val) { //5==1
        			tempNode.next = tempNode.next.next;
        			isFindNext = false;
        		}else {
        			System.out.println("xxxx===>"+t_temp.val);
        			System.out.println("yyyy===>"+t_temp.next.val);
        			t_temp = t_temp.next; //4=5
        		}
        		
        	}
    	}
    	
    }
}

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { 
		val = x; 
	}
}