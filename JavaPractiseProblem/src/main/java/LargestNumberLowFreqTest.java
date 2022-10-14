import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberLowFreqTest {

    @Test
    void Test1() {
        int ans1 = LargestNumberLowFreq.findhighestNo(new int[]{2, 2, 5, 50, 1},5);
        int ans2 = 50;
        assertEquals(ans1,ans2);
    }

    @Test
    void Test2() {
        int ans1 = LargestNumberLowFreq.findhighestNo(new int[]{3, 4, 7, 1, 2, 9, 8},7);
        int ans2 = 9;
        assertEquals(ans1,ans2);
    }
}