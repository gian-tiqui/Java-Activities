package data_structures;

class LNode {
    public int val;
    public LNode next;

    public LNode(int num) {
        this.val = num;
        this.next = null;
    }
}

public class MyList {
    LNode head;

    public MyList(int num) {
        this.head = new LNode(num);
    }

    public void append(int num) {
        LNode newNode = new LNode(num);

        if (head == null)
            head = newNode;
        else {
            LNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }

            curr.next = newNode;
        }
    }

    public void printList() {
        LNode curr = head;

        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }

    public void reverse() {

    }

    public void insert() {

    }
}