import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromStringTest {

    @Test
    void Test1() {
        String S = "gfg";
        String ans1 = RemoveDuplicatesFromString.Removeduplicate(S);
        String ans2 = "gf";
        assertEquals(ans1,ans2);
    }

    @Test
    void Test2() {
        String S = "zvvo";
        String ans1 = RemoveDuplicatesFromString.Removeduplicate(S);
        String ans2 = "zvo";
        assertEquals(ans1,ans2);
    }

    @Test
    void Test3() {
        String S = "deep sanghani";
        String ans1 = RemoveDuplicatesFromString.Removeduplicate(S);
        String ans2 = "dep sanghi";
        assertEquals(ans1,ans2);
    }
}