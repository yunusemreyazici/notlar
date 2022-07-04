public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data; // Generic Type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insert(int position, int value) {
        // 1 ->4 ->5
        // 1 ->6 ->4 >5
        ListNode node = new ListNode(value);
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }

    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }

    public ListNode deleteFirst(){
        if (head==null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next=null;
        return temp;
    }
    public ListNode deleteLast(){
        if(head== null || head.next ==null){
            return head;
        }
        ListNode current =head;
        ListNode previous = null;
        while(current.next != null){
            previous =current;
            current= current.next;
        }
        previous.next=null; // break the chain
        return current;
    }

    public void delete (int position){
        //position is valid and starting from 1
        // 3 -> 4-> 5 ->6 ->7 ->8 ->9 ->null
        if(position==1){
            head = head.next;
        }else{
            ListNode previous=head;
            int count=1;
            while (count<position-1) {
            previous =previous.next;
            count++;
            }
            ListNode current =previous.next;
            previous.next=current.next;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        // sll.head = new ListNode(10);
        // ListNode second = new ListNode(1);
        // ListNode third = new ListNode(8);
        // ListNode fourth = new ListNode(11);
        // now we will connect them together to from a chain
        // sll.head.next = second; // 10 --> 1
        // second.next = third; // 10 --> 1 --> 8
        // third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null
        // System.out.println("Length is : " + sll.length());
        // sll.insertFirst(11);
        // sll.insertFirst(12);
        // sll.insertFirst(31);
        // sll.insertLast(1);
        // sll.insertLast(2);
        // sll.insertLast(3);
        // sll.display();
        sll.insert(1,3); // 3 ->null
        sll.insert(2,5); // 3-> 5->null
        sll.insert(1,2); // 2 ->3 ->5 ->null
        sll.insert(1,2); // 2 ->2 ->3 ->5 ->null
        sll.insert(2,4); // 2 ->4 ->2 ->3 ->5 ->null
        sll.insert(5,7); // 2 ->4 ->2 ->3 ->5 ->7 ->null
        sll.display();
        // System.out.println(sll.deleteFirst().data);
        // System.out.println(sll.deleteFirst().data);
        // System.out.println(sll.deleteFirst().data);
        // System.out.println(sll.deleteFirst().data);
        sll.delete(1);
        sll.delete(5);
        sll.display();
    }
}