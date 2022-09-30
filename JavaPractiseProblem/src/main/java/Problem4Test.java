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

    @org.junit.jupiter.api.Test
    void Test3() {
        int ans1 = Problem4.minswaps(new ArrayList<>(){{add(50);add(40);add(30);add(20);add(10);add(0);}});
        int ans2 = 3;
        assertEquals(ans1,ans2);
    }

    @org.junit.jupiter.api.Test
    void Test4() {
        int ans1 = Problem4.minswaps(new ArrayList<>(){{add(0);add(1);add(2);add(3);add(4);add(5);add(6);add(7);add(8);add(9);add(10);}});
        int ans2 = 0;
        assertEquals(ans1,ans2);
    }

    @org.junit.jupiter.api.Test
    void Test5() {
        int ans1 = Problem4.minswaps(new ArrayList<>(){{add(100);add(50);add(60);add(30);add(50);}});
        int ans2 = 1;
        assertEquals(ans1,ans2);
    }
}