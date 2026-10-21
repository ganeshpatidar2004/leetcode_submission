class Solution {
    public int maximumSum(int[] arr) {
        int noDel = arr[0];
        int Del = 0;
        int ans = arr[0];

        for(int i=1; i<arr.length; i++){

            Del = Math.max(noDel, Del+arr[i]);
            noDel = Math.max(arr[i]+noDel, arr[i]);

            ans = Math.max(ans, Math.max(noDel, Del));
        }
        return ans;
    }
}