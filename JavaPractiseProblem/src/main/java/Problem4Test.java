import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {
    @org.junit.jupiter.api.Test
    void Test1() {
        int ans1 = Problem4.minswaps(new ArrayList<>(){{add(2);add(8);add(5);add(4);}});
        int ans2 = 1;
        assertEquals(ans1,ans2);
    }

    @org.junit.jupiter.api.Test
    void Test2() {
        int ans1 = Problem4.minswaps(new ArrayList<>(){{add(10);add(19);add(6);add(3);add(5);}});
        int ans2 = 2;
        assertEquals(ans1,ans2);
    }
}