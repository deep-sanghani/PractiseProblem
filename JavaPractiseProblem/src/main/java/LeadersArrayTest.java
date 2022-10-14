import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeadersArrayTest {
    @org.junit.jupiter.api.Test
    void Test1() {
        List<Integer> ans1 = LeadersArray.leaders(6,new int[]{16,17,4,3,5,2});
        List<Integer> ans2 = new ArrayList<>(){{add(17);add(5);add(2);}};
        assertEquals(ans1,ans2);
    }

    @org.junit.jupiter.api.Test
    void Test2() {
        List<Integer> ans1 = LeadersArray.leaders(5,new int[]{1,2,3,4,0});
        List<Integer> ans2 = new ArrayList<>(){{add(4);add(0);}};
        assertEquals(ans1,ans2);
    }

    @org.junit.jupiter.api.Test
    void Test3() {
        List<Integer> ans1 = LeadersArray.leaders(10,new int[]{1,2,3,4,5,6,7,8,9,10});
        List<Integer> ans2 = new ArrayList<>(){{add(10);}};
        assertEquals(ans1,ans2);
    }

    @org.junit.jupiter.api.Test
    void Test4() {
        List<Integer> ans1 = LeadersArray.leaders(8,new int[]{100,99,88,77,66,55,44,33});
        List<Integer> ans2 = new ArrayList<>(){{add(100);add(99);add(88);add(77);add(66);add(55);add(44);add(33);}};
        assertEquals(ans1,ans2);
    }

    @org.junit.jupiter.api.Test
    void Test5() {
        List<Integer> ans1 = LeadersArray.leaders(7,new int[]{-16,-17,-10,-3,-88,-2,-70});
        List<Integer> ans2 = new ArrayList<>(){{add(-2);add(-70);}};
        assertEquals(ans1,ans2);
    }
}