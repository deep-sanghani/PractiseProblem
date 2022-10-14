import java.util.HashMap;
import java.util.Map;

public class LargestNumberLowFreq {
    static int findhighestNo(int[] arr, int n){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(arr[i],mp.get(arr[i])==null?1:mp.get(arr[i])+1);
        }
        int minfreq = Integer.MAX_VALUE;
        int larnum = Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer> li: mp.entrySet()) {
            if(li.getValue() < minfreq){
                minfreq = li.getValue();
                larnum = li.getKey();
            }
            else if(li.getValue() == minfreq && li.getKey() > larnum){
                larnum = li.getKey();
            }
        }
        return larnum;
    }

    public static void main(String[] args) {
        int N=5;
        int[] arr = {2,2,5,50,1};
        int ans = findhighestNo(arr,N);
        System.out.println(ans);
    }
}
