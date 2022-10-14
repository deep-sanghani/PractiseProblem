import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoOfPairsTest {

    @Test
    void Test1() {
        int N = 4, K = 6;
        int arr[] = {1, 5, 7, 1};
        int ans1 = NoOfPairs.findpairscount(arr,N,K);
        int ans2 = 2;
        assertEquals(ans1,ans2);
    }

    @Test
    void Test2() {
        int N = 4, K = 2;
        int arr[] = {1, 1, 1, 1};
        int ans1 = NoOfPairs.findpairscount(arr,N,K);
        int ans2 = 6;
        assertEquals(ans1,ans2);
    }
}