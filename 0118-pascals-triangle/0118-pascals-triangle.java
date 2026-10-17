class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            res.add(new ArrayList<>());
        }

        for(int i=0; i<numRows; i++){
            List<Integer> list = res.get(i);
            for(int j=0; j<=i; j++){
                if(j == 0 || j == i){
                    list.add(1);
                }else{
                    list.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                }
            }
        }
        return res;
        
    }
}