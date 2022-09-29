import java.util.*;

public class Problem3 {
    static List<Integer> frequency(int n, int[] A){
        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> high = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Integer count = mp.get(A[i]);
            if(count==null){
                mp.put(A[i],1);
            }
            else{
                mp.put(A[i],count+1);
            }
        }
        while(!mp.isEmpty()){
            int maxcount = 0;
            int ans =0;
            for (Map.Entry<Integer,Integer> entry :mp.entrySet()) {
                if(entry.getValue() > maxcount){
                    maxcount = entry.getValue();
                    ans = entry.getKey();
                }
                else{
                    if(entry.getValue() == maxcount && entry.getKey() < ans){
                        maxcount = entry.getValue();
                        ans = entry.getKey();
                    }
                }
            }
            for (int i = 0; i < maxcount; i++) {
                high.add(ans);
            }
            mp.remove(ans);
        }
        return high;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
//        int A[] = {5,5,4,6,4};
        List<Integer> ans = frequency(n,A);
        System.out.println(ans);
    }
}
