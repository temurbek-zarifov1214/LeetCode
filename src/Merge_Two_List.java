public class Merge_Two_List {
    public static void main(String[] args) {
        ListNode lis1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(4)));
        ListNode lis2=new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));
        printList(mergeTwoLists(lis1,lis2));
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode temp=head;
        if (list1 == null && list2 == null) {
            return null;
        }
        while (list1 != null&& list2 != null)
        {
            if (list1.val < list2.val)
            {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1 != null)
            temp.next = list1;
        else
        {
            temp.next = list2;
        }
        return head.next;
    }
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
