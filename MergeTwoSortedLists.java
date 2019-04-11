class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        System.out.println("l1: " + l1.val);
        if(l1 == null && l2 == null) {
            return null;
        }
        else if(l1 == null && l2 != null) {
            return l2;
        }
        else if(l1 != null && l2 == null) {
            return l1;
        }
        else if(l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void print(ListNode x) {
        while(x != null) {
            System.out.print(x.val + " ");
            x = x.next;
        }
    }

    public static void main(String[] args) {
        ListNode x = new ListNode(1);
        ListNode y = new ListNode(1);
        x.next = new ListNode(2);
        x.next.next = new ListNode(4);
        y.next = new ListNode(3);
        y.next.next = new ListNode(4);

        print(x);
        System.out.println();
        print(y);
        ListNode z = mergeTwoLists(x, y);
        print(z);
    }
}
