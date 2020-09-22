public class InsertintoSortedCircularLinkedList {

    class Solution {

        /**
        class Node {
            public int val;
            public Node next;

            public Node() {}

            public Node(int _val) {
                val = _val;
            }

            public Node(int _val, Node _next) {
                val = _val;
                next = _next;
            }
        };
        */
        public Node insert(Node head, int insertVal) {

            Node res = new Node(insertVal);
            if (head == null) {
                res.next = res;
                return res;
            }

            Node cur = head;
            while (cur.next != head
                    && !((cur.val <= insertVal && insertVal <= cur.next.val)
                    || (cur.val > cur.next.val && (cur.next.val > insertVal || cur.val < insertVal))))){
                cur = cur.next;
            }

            res.next = cur.next;
            cur.next = res;
            return head;

        }
    }
}
