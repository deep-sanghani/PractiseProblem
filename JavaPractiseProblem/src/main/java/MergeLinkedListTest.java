import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeLinkedListTest {

    @Test
    void Test1() {
        int N = 4, M = 3;
        MergeLinkedList.Node head1 = new MergeLinkedList.Node(5);
        MergeLinkedList.Node end = head1;
        MergeLinkedList.Node newNode = new MergeLinkedList.Node(10);
        end.next = newNode;
        end = end.next;
        newNode = new MergeLinkedList.Node(15);
        end.next = newNode;
        end = end.next;
        newNode = new MergeLinkedList.Node(40);
        end.next = newNode;
        end = end.next;
        MergeLinkedList.Node head2 = new MergeLinkedList.Node(2);
        end = head2;
        newNode = new MergeLinkedList.Node(3);
        end.next = newNode;
        end = end.next;
        newNode = new MergeLinkedList.Node(20);
        end.next = newNode;
        end = end.next;
        head1 = MergeLinkedList.merge(head1,N,head2,M);
        List<Integer> ans1 = new ArrayList<>();
        while(head1!=null){
            ans1.add(head1.data);
            head1 = head1.next;
        }
        List<Integer> ans2 = new ArrayList<>(){{add(2);add(3);add(5);add(10);add(15);add(20);add(40);}};
        assertEquals(ans1,ans2);
    }

    @Test
    void Test2() {
        int N = 2, M = 2;
        MergeLinkedList.Node head1 = new MergeLinkedList.Node(1);
        MergeLinkedList.Node end = head1;
        MergeLinkedList.Node newNode = new MergeLinkedList.Node(1);
        end.next = newNode;
        end = end.next;
        MergeLinkedList.Node head2 = new MergeLinkedList.Node(2);
        end = head2;
        newNode = new MergeLinkedList.Node(4);
        end.next = newNode;
        head1 = MergeLinkedList.merge(head1,N,head2,M);
        List<Integer> ans1 = new ArrayList<>();
        while(head1!=null){
            ans1.add(head1.data);
            head1 = head1.next;
        }
        System.out.println(ans1);
        List<Integer> ans2 = new ArrayList<>(){{add(1);add(1);add(2);add(4);}};
        assertEquals(ans1,ans2);
    }
}