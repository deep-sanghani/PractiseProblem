public class MiddleOfLinkedlist {
    static class Node{
        int data;
        Node next;

        Node(int n){
            data = n;
            next = null;
        }
    }

    static int middleEle(Node head){
        if(head==null){
            return -1;
        }
        Node temp=head;
        int count =0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        for (int i = 0; i < (Math.ceil(count/2)); i++) {
            head = head.next;
        }
        return head.data;
    }

    public static void main(String[] args) {
        Node first = new Node(2);
        Node head = first;
        first = new Node(4);
        head.next = first;
        Node end = head.next;
        first = new Node(6);
        end.next = first;
        end = end.next;
        first = new Node(7);
        end.next = first;
        end = end.next;
        first = new Node(5);
        end.next = first;
        end = end.next;
        first = new Node(1);
        end.next = first;
        end = end.next;
        System.out.println(middleEle(head));
    }
}
