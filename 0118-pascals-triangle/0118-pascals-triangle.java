class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        pascal(numRows, ans);
        return ans;
    }
    public void pascal(int n , List<List<Integer>> ans){
        long M = (long) Math.pow(10,9)+7;
        
        for(int i=1; i<=n;i++){
            ArrayList<Integer> t = new ArrayList<>();
            
            t.add(1);
            for(int j=1; j<i-1; j++){
                long sum = (long) ans.get(i - 2).get(j - 1) + ans.get(i - 2).get(j);
                t.add((int) (sum % M));
                
            }
            if (i > 1) {
                t.add(1);
            }
            ans.add(t);
        }
    }
}