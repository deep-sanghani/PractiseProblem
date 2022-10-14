import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @Test
    void Test1() {
        int ans1 = MissingNumber.minmisnumber2(new int[]{1,2,3,5},5);
        int ans2 = 4;
        assertEquals(ans1,ans2);
    }

    @Test
    void Test2() {
        int ans1 = MissingNumber.minmisnumber2(new int[]{6,1,2,8,3,4,7,10,5},10);
        int ans2 = 9;
        assertEquals(ans1,ans2);
    }
}