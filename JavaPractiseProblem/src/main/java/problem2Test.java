import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class problem2Test {
    @org.junit.jupiter.api.Test
    void Test1() {
        int ans1 = problem2.toys(new int[]{1, 12, 5, 111, 200, 1000, 10},7,50);
        int ans2 = 4;
        assertEquals(ans1,ans2);
    }

    @org.junit.jupiter.api.Test
    void Test2() {
        int ans1 = problem2.toys(new int[]{20, 30, 50},3,100);
        int ans2 = 3;
        assertEquals(ans1,ans2);
    }

    @org.junit.jupiter.api.Test
    void Test3() {
        int ans1 = problem2.toys(new int[]{16,17,4,3,5,2},6,50);
        int ans2 = 6;
        assertEquals(ans1,ans2);
    }

    @org.junit.jupiter.api.Test
    void Test4() {
        int ans1 = problem2.toys(new int[]{100,99,88,77,66,55},6,50);
        int ans2 = 0;
        assertEquals(ans1,ans2);
    }

    @org.junit.jupiter.api.Test
    void Test5() {
        int ans1 = problem2.toys(new int[]{16,17,10,3,88,2,70,80},8,100);
        int ans2 = 5;
        assertEquals(ans1,ans2);
    }
}