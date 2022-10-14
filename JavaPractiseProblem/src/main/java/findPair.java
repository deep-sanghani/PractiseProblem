import java.util.HashMap;
import java.util.Map;

public class findPair {
    static class pair
    {
        int first, second;
        pair(int f,int s)
        {
            first = f; second = s;
        }
    };

    static boolean findpairexist(int[] a, int n) {
        // Create an empty Hash to store mapping from sum to
        // pair indexes
        HashMap<Integer, pair> mp = new HashMap<>();
        // Traverse through all possible pairs of arr[]
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                // If sum of current pair is not in hash,
                // then store it and continue to next pair
                int sum = a[i] + a[j];
                if(!mp.containsKey(sum))
                    mp.put(sum,new pair(i,j));
                else // Else (Sum already present in hash)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int N=7, A[] = {65, 30, 7, 90, 1, 9, 8};
        System.out.println(findpairexist(A,N));
    }
}
