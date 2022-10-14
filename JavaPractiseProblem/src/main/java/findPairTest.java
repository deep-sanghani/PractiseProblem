import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findPairTest {

    @Test
    void Test1() {
        boolean ans1 = findPair.findpairexist(new int[]{3, 4, 7, 1, 2, 9, 8},7);
        boolean ans2 = true;
        assertEquals(ans1,ans2);
    }

    @Test
    void Test2() {
        boolean ans1 = findPair.findpairexist(new int[]{65, 30, 7, 90, 1, 9, 8},7);
        boolean ans2 = false;
        assertEquals(ans1,ans2);
    }
}