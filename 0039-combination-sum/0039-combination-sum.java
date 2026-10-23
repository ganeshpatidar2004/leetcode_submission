class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int sum = 0;
        Arrays.sort(candidates);
        ArrayList<Integer> list = new ArrayList<>();
        solve(candidates, target, sum, 0, list);
        return result;
    }

    public void solve(int[] arr, int target, int sum, int index, ArrayList<Integer> list){

        if(sum == target){
            result.add(new ArrayList<>(list));
            return;
        }
        
        if(index == arr.length)return;

        // if(sum>target)return;

        for(int i=index; i<arr.length; i++){
            if(sum + arr[i] > target)break;
            list.add(arr[i]);
            solve(arr, target, sum+arr[i],i, list);
            list.remove(list.size()-1);
        }

         
    }
}