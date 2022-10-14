import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HighestFrequencyStringTest {

    @Test
    void Test1() {
        String ans1 = HighestFrequencyString.findhighestfreq("the devil in the sky");
        String ans2 = "the 2";
        assertEquals(ans1,ans2);
    }

    @Test
    void Test2() {
        String ans1 = HighestFrequencyString.findhighestfreq("this is not right");
        String ans2 = "this 1";
        assertEquals(ans1,ans2);
    }
}