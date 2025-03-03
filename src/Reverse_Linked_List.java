import javax.print.event.PrintEvent;

public class Reverse_Linked_List {
    public static void main(String[] args) {
        ListNode lis1 = new ListNode(1,
                new ListNode(2));
        ListNode lis2=new ListNode(1,
                new ListNode(3,
                        new ListNode(4)));
        printList(reverseList(lis1));
    }
    public static ListNode reverseList(ListNode list) {
        if (list == null) return null;

        if (list.next == null) return list;
        ListNode secondElem = list.next;
        list.next = null;
        ListNode reverseRest = reverseList(secondElem);
        secondElem.next = list;
        return reverseRest;
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
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
