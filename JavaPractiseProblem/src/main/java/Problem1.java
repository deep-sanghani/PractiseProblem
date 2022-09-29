import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
//        Given an array A of positive integers. Your task is to find the leaders in the array. An element
//        of an array is leader if it is greater than or equal to all the elements to its right side. The
//        rightmost element is always a leader.
//        n = 6
//        A[] = {16,17,4,3,5,2}
//        Output: 17 5 2
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
//        int n = 6;
//        int[] A = {16,17,4,3,5,2};
        List<Integer> ans = new ArrayList<>();
        boolean isans = true;
        //O(n^2)
//        for (int i = 0; i < n-1; i++) {
//            isans = true;
//            for (int j = i+1; j < n; j++) {
//                if(A[i] < A[j]) {
//                    isans = false;
//                }
//            }
//            if(isans){
//                ans.add(A[i]);
//            }
//        }
//        ans.add(A[n-1]);

        //O(n)
//        int[] dp = new int[n];
//        dp[n-1] = A[n-1];
//        for (int i = n-2; i >= 0; i--) {
//            if(A[i] > dp[i+1]){
//                dp[i] = A[i];
//            }
//            else{
//                dp[i] = dp[i+1];
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if(dp[i]!=dp[i+1]){
//                ans.add(dp[i]);
//            }
//        }
//        System.out.println(ans);

        //
        int curr = A[n-1];
        for(int i=n-1;i>=0;i--){
            if(curr <= A[i]){
                ans.add(0,A[i]);
                curr = A[i];
            }
        }
        System.out.println(ans);
    }
}
