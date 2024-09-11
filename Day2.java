class Solution {
    public long minCost(long[] arr) {
        long totalCost = 0;
        int n = arr.length;

        while (n > 1) {
            Arrays.sort(arr, 0, n);
            long first = arr[0];
            long second = arr[1];
            long cost = first + second;
            totalCost += cost;
            arr[0] = cost;

            for (int i = 1; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            
            n--;
        }
        
        return totalCost;
    }
}
