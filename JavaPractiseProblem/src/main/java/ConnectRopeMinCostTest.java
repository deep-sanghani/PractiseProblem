import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ConnectRopeMinCostTest {

    @org.junit.jupiter.api.Test
    void Test1() {
        int ans1 = ConnectRopeMinCost.MinCost(new int[]{4, 3, 2, 6},4);
        int ans2 = 29;
        assertEquals(ans1, ans2);
    }

    @org.junit.jupiter.api.Test
    void Test2() {
        int ans1 = ConnectRopeMinCost.MinCost(new int[]{10,5,8,2,3,15},6);
        int ans2 = 101;
        assertEquals(ans1, ans2);
    }
}