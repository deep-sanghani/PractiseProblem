import java.util.PriorityQueue;

public class ConnectRopeMinCost {
    static  int MinCost(int[] arr, int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }
        int ans = 0;
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            ans += first + second;
            pq.add(first+second);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 6;
        int arr[] = {10,5,8,2,3,15};
        int ans = MinCost(arr,n);
        System.out.println(ans);
    }
}
