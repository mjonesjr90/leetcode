class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

class ReverseSinglyLinkedList {
	public static ListNode reverseList(ListNode head) {
		//if head is null, or if you reach the end of the list, just return that node
        if(head == null || head.next == null) {
            return head;
        }
        else {
        	//set temp equal to the node list after the first node
            ListNode temp = head.next;
            //set nHead to the reverse of the remaining list
            ListNode nHead = reverseList(temp);
            //the end of the remaining list temp should the current head - bump it to the end
            temp.next = head;
            //the end should be null
            head.next = null;
            return nHead;
        }
    }

    public static void print(ListNode x) {
        while(x != null) {
            System.out.print(x.val + " ");
            x = x.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode w = new ListNode(1);
        ListNode x = new ListNode(2);
        ListNode y = new ListNode(3);
        ListNode z = new ListNode(4);
        y.next = z;
        x.next = y;
        w.next = x;

        print(w);
        print(reverseList(w));
    }
}
