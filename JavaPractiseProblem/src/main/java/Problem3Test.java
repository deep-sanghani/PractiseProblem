import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @org.junit.jupiter.api.Test
    void Test1() {
        List<Integer> ans1 = Problem3.frequency(5, new int[]{5, 5, 4, 6, 4});
        List<Integer> ans2 = new ArrayList<>() {{
            add(4);
            add(4);
            add(5);
            add(5);
            add(6);
        }};
        assertEquals(ans1, ans2);
    }

    @org.junit.jupiter.api.Test
    void Test2() {
        List<Integer> ans1 = Problem3.frequency(5,new int[]{9,9,9,2,5});
        List<Integer> ans2 = new ArrayList<>(){{add(9);add(9);add(9);add(2);add(5);}};
        assertEquals(ans1, ans2);
    }

}