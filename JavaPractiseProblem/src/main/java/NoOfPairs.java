import java.util.HashMap;

public class NoOfPairs {
    static int findpairscount(int[] arr,int n,int k){
        HashMap<Integer,Integer> mp = new HashMap<>();
        int count=0;
        for (int i = 0; i < n; i++) {
            if(mp.containsKey(k - arr[i])){
                count += mp.get(k-arr[i]);
            }
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i],1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int N=4,K=2;
        int[] arr = {1, 1, 1, 1};
        int ans = findpairscount(arr,N,K);
        System.out.println(ans);
    }
}
