import java.util.Arrays;
import java.util.Scanner;

public class problem2 {
    static int toys(int[] arr, int N, int K){
        Arrays.sort(arr);
        int i=0;
        while(K > 0 && i < N){
            if(arr[i] > K){
                break;
            }
            K = K - arr[i];
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
//        Given an array arr[ ] of length N consisting cost of N toys and an integer K depicting the
//        amount with you. Your task is to find the maximum number of toys you can buy with K
//                amount
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = toys(arr,N,K);
        System.out.println(ans);
    }
}
