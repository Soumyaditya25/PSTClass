// A sequence x1, x2, ..., xn is Fibonacci-like if:

// n >= 3
// xi + xi+1 == xi+2 for all i + 2 <= n
// Given a strictly increasing array arr of positive integers forming a sequence, return the length of the longest Fibonacci-like subsequence of arr. If one does not exist, return 0.

// A subsequence is derived from another sequence arr by deleting any number of elements (including none) from arr, without changing the order of the remaining elements. For example, [3, 5, 8] is a subsequence of [3, 4, 5, 6, 7, 8].

 

// Example 1:

// Input: arr = [1,2,3,4,5,6,7,8]
// Output: 5
// Explanation: The longest subsequence that is fibonacci-like: [1,2,3,5,8].
// Example 2:

// Input: arr = [1,3,7,11,12,14,18]
// Output: 3
// Explanation: The longest subsequence that is fibonacci-like: [1,11,12], [3,11,14] or [7,11,18].
 

// Constraints:

// 3 <= arr.length <= 1000
// 1 <= arr[i] < arr[i + 1] <= 109

 



import java.util.*;

public class leetcode {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(lenLongestFibSubseq(arr));
    }
    public static int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < n; i++) {
            index.put(arr[i], i);
        }
        
        Map<Integer, Integer> longest = new HashMap<>();
        int ans = 0;
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < k; j++) {
                if (arr[k] - arr[j] < arr[j] && index.containsKey(arr[k] - arr[j])) {
                    int i = index.get(arr[k] - arr[j]);
                    longest.put(j * n + k, longest.getOrDefault(i * n + j, 2) + 1);
                    ans = Math.max(ans, longest.get(j * n + k));
                }
            }
        }
        
        return ans >= 3 ? ans : 0;
    }

}