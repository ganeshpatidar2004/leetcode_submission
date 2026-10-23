class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, ((a,b) -> {
            int res = Integer.compare(a[0], b[0]);

            if(res == 0){
                return Integer.compare(a[1], b[1]);
            }
            return res;
        }));

        int i=1;
        int res = 0;

        int[] current = intervals[0];

        while(i<n){
            if(intervals[i][0] < current[1]){
                res++;

                if (intervals[i][1] < current[1]) {
                    current = intervals[i];
                }

            }else{
                current = intervals[i];
            }
            i++;
        }
        return res;
    }
}