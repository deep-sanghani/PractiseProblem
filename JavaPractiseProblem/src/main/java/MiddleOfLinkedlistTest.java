import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleOfLinkedlistTest {

    @Test
    void Test1() {
        MiddleOfLinkedlist.Node first = new MiddleOfLinkedlist.Node(2);
        MiddleOfLinkedlist.Node head = first;
        first = new MiddleOfLinkedlist.Node(4);
        head.next = first;
        MiddleOfLinkedlist.Node end = head.next;
        first = new MiddleOfLinkedlist.Node(6);
        end.next = first;
        end = end.next;
        first = new MiddleOfLinkedlist.Node(7);
        end.next = first;
        end = end.next;
        first = new MiddleOfLinkedlist.Node(5);
        end.next = first;
        end = end.next;
        first = new MiddleOfLinkedlist.Node(1);
        end.next = first;
        end = end.next;
        int ans1 = MiddleOfLinkedlist.middleEle(head);
        int ans2 = 7;
        assertEquals(ans1,ans2);
    }

    @Test
    void Test2() {
        MiddleOfLinkedlist.Node first = new MiddleOfLinkedlist.Node(2);
        MiddleOfLinkedlist.Node head = first;
        first = new MiddleOfLinkedlist.Node(1);
        head.next = first;
        MiddleOfLinkedlist.Node end = head.next;
        first = new MiddleOfLinkedlist.Node(2);
        end.next = first;
        end = end.next;
        first = new MiddleOfLinkedlist.Node(3);
        end.next = first;
        end = end.next;
        first = new MiddleOfLinkedlist.Node(4);
        end.next = first;
        end = end.next;
        first = new MiddleOfLinkedlist.Node(5);
        end.next = first;
        end = end.next;
        int ans1 = MiddleOfLinkedlist.middleEle(head);
        int ans2 = 3;
        assertEquals(ans1,ans2);
    }
}