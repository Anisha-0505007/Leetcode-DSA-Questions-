class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        generate(n,k,1,ans,new ArrayList<>());
        return ans;
    }
  public void generate(int A, int B, int start,
    List<List<Integer>> ans, ArrayList<Integer> temp) {
        if (temp.size() == B){
            ans.add(new  ArrayList<>(temp));
            return;
        }

        for(int i=start;i<=A;i++){
            temp.add(i);
            generate(A,B,i+1,ans,temp);
            temp.remove(temp.size()-1);

        }
    }
}