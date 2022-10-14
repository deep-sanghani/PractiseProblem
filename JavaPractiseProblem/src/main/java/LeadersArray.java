import java.util.ArrayList;
import java.util.List;

public class LeadersArray {
    static List<Integer> leaders(int n, int[] A){
        //list for storing ans
        List<Integer> ans = new ArrayList<>();
        //curr will find largest element from array end
        int curr = A[n-1];
        for(int i=n-1;i>=0;i--){
            //if element is greater than previous largest we need to add it in to list
            if(curr <= A[i]){
                ans.add(0,A[i]);
                curr = A[i];
            }
        }
        return ans;
    }

//    public static void main(String[] args) {
////        Given an array A of positive integers. Your task is to find the leaders in the array. An element
////        of an array is leader if it is greater than or equal to all the elements to its right side. The
////        rightmost element is always a leader.
////        n = 6
////        A[] = {16,17,4,3,5,2}
////        Output: 17 5 2
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] A = new int[n];
//        for (int i = 0; i < n; i++) {
//            A[i] = sc.nextInt();
//        }
//        List<Integer> ans = leaders(n,A);
//        System.out.println(ans);
//    }
}
