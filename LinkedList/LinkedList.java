class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}
public class LinkedList {
    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i=1; i<arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static int findLengthOfLL(Node head) {
        Node temp = head;
        int count = 0;

        while(temp!=null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void traverseLL(Node head) {
        Node temp = head;
        while(temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static int checkIfPresent(Node head, int val) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == val) return 1;
            temp = temp.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,7};
        Node head = convertArr2LL(arr);

        System.out.println(checkIfPresent(head, 54));
        

    }
}
