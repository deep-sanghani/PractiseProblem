import java.util.*;

public class Problem3 {
    static List<Integer> frequency(int n, int[] A){
        //created map for storing count and integer
        Map<Integer,Integer> mp = new HashMap<>();
        //ans will store all the frequency is required order
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            //count will have count of current element
            Integer count = mp.get(A[i]);
            //if count is not assigned with any value which it is not present in mp so we need to store count as 1
            if (count == null) {
                mp.put(A[i], 1);
            }
            //else we need to store current count + 1 for present element
            else {
                mp.put(A[i], count + 1);
            }
        }
        while(!mp.isEmpty()){
            //maxcount will store maxcount present in mp
            int maxcount = 0;
            //mapfreq will store maxfreq which has maxcount
            int maxfreq =0;
            //this loop will find maxcount and maxfreq
            for (Map.Entry<Integer,Integer> entry :mp.entrySet()) {
                if(entry.getValue() > maxcount){
                    maxcount = entry.getValue();
                    maxfreq = entry.getKey();
                }
                else{
                    //if count is equal but number is less so need to store in maxfreq
                    if(entry.getValue() == maxcount && entry.getKey() < maxfreq){
                        maxcount = entry.getValue();
                        maxfreq = entry.getKey();
                    }
                }
            }
            //adding element maxcount times in ans
            for (int i = 0; i < maxcount; i++) {
                ans.add(maxfreq);
            }
            //removing element from map
            mp.remove(maxfreq);
        }
        return ans;
    }
    public static void main(String[] args) {
//        Given an array of integers, sort the array according to frequency of
//        elements. That is elements that have higher frequency come first.
//        If frequencies of two elements are same, then smaller number comes
//        first.
//        N = 5
//        A[] = {5,5,4,6,4}

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        List<Integer> ans = frequency(n,A);
        System.out.println(ans);
    }
}
