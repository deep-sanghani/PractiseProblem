import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StackImplementationTest {

    @Test
    void Test1() {
        List<Integer> ans = new ArrayList<>();
        StackImplementation.push(2);
        StackImplementation.push(3);
        StackImplementation.pop();
        ans.add(StackImplementation.getMin());
        StackImplementation.push(1);
        ans.add(StackImplementation.getMin());
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        assertEquals(new ArrayList<Integer>(){{add(2);add(1);}}, ans);
    }
}