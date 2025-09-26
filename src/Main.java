public class Main {
    static class ListNode {
        int val;
        ListNode next; //pointer
        ListNode() {}  // empty constructor
        ListNode(int val) {   // create a node with value
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) throws Exception {
        ListNode L1 = new ListNode(2);
        L1.next = new ListNode(4);
        L1.next.next = new ListNode(3);

        ListNode L2 = new ListNode(5);
        L2.next = new ListNode(6);
        L2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(L1, L2);

        System.out.print("[");
        ListNode cur = result;
        while (cur != null) {
            System.out.print(cur.val);
            if (cur.next != null) System.out.print(",");
            cur = cur.next;
        }
        System.out.println("]");
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        ListNode p1 = l1;
        ListNode p2 = l2;
        int carry = 0;

        while (p1 != null || p2 != null) {
            int x = (p1 != null) ? p1.val : 0;
            int y = (p2 != null) ? p2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
