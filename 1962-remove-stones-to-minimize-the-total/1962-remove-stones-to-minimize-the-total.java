class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)->(Integer.compare(b, a)));

        for(int num : piles){
            pq.add(num);
        }

        while(k>0){
            int num = pq.poll();
            pq.add((num+1)/2);
            k--;
        }
        
        int sum = 0;

        while(!pq.isEmpty()){
            sum = sum + pq.poll();
        }
        return sum;
    }
}