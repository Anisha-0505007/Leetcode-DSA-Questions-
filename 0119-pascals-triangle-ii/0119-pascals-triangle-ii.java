class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        pascal(rowIndex + 1, ans);
        return ans.get(rowIndex);
    }

    public void pascal(int n, List<List<Integer>> ans) {

        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> t = new ArrayList<>();

            t.add(1);

            for (int j = 1; j < i - 1; j++) {
                long sum = (long) ans.get(i - 2).get(j - 1)
                          + ans.get(i - 2).get(j);

                t.add((int) sum);
            }

            if (i > 1) {
                t.add(1);
            }

            ans.add(t);
        }
    }
}