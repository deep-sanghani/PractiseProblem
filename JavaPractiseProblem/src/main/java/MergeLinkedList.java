public class MergeLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int n){
            data = n;
            next = null;
        }
    }

    static Node merge(Node head1, int n, Node head2, int m){
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        Node anshead = null,endhead = null;
        while(head1!=null && head2!=null){
            if(head1.data < head2.data){
                if(anshead==null){
                    anshead = new Node(head1.data);
                    endhead = anshead;
                }
                else{
                    endhead.next = new Node(head1.data);
                    endhead = endhead.next;
                }
                head1 = head1.next;
            }
            else{
                if(anshead==null){
                    anshead = new Node(head2.data);
                    endhead = anshead;
                }
                else{
                    endhead.next = new Node(head2.data);
                    endhead = endhead.next;
                }
                head2 = head2.next;
            }
        }
        while(head1!=null){
            endhead.next = new Node(head1.data);
            endhead = endhead.next;
            head1 = head1.next;
        }
        while(head2!=null){
            endhead.next = new Node(head2.data);
            endhead = endhead.next;
            head2 = head2.next;
        }
        return anshead;
    }

    public static void main(String[] args) {
        int N = 2, M = 2;
        MergeLinkedList.Node head1 = new MergeLinkedList.Node(1);
        MergeLinkedList.Node end = head1;
        MergeLinkedList.Node newNode = new MergeLinkedList.Node(1);
        end.next = newNode;
        MergeLinkedList.Node head2 = new MergeLinkedList.Node(2);
        end = head2;
        newNode = new MergeLinkedList.Node(4);
        end.next = newNode;
        Node head3 = MergeLinkedList.merge(head1,N,head2,M);
        while(head3!=null){
            System.out.println(head3.data+" ");
            head3 = head3.next;
        }
    }
}
