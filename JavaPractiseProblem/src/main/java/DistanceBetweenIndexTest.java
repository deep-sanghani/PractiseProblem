import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceBetweenIndexTest {

    @Test
    void Test1() {
        int ans1 = DistanceBetweenIndex.finddistance(new int[]{1,2,3,2},4,1,2);
        int ans2 = 1;
        assertEquals(ans1,ans2);
    }

    @Test
    void Test2() {
        int ans1 = DistanceBetweenIndex.finddistance(new int[]{86,39,90,67,84,66,62},7,42,12);
        int ans2 = -1;
        assertEquals(ans1,ans2);
    }
}