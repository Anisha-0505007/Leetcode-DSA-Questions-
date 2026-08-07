class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0; i < k; i++){
            while(dq.isEmpty() == false && nums[dq.getLast()] <= nums[i]){
                dq.removeLast();   // fixed
            }
            dq.addLast(i);  // fixed
        }

        a.add(nums[dq.getFirst()]);

        int s = 1, e = k;
        while(e < n){
            if(dq.isEmpty() == false && dq.getFirst() == s - 1){
                dq.removeFirst();
            }

            while(dq.isEmpty() == false && nums[dq.getLast()] <= nums[e]){
                dq.removeLast();
            }

            dq.addLast(e);   // added
            a.add(nums[dq.getFirst()]);

            s++;
            e++;
        }

        int arr[] = new int[a.size()];
        for(int i = 0; i < a.size(); i++){
            arr[i] = a.get(i);
        }

        return arr;
    }
}