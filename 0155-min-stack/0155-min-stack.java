class MinStack {
    private ArrayList<Integer> a = new ArrayList<>();
    private ArrayList<Integer> minStack = new ArrayList<>();
    public MinStack() {
        
    }
    
   public void push(int x) {
        a.add(x);

        if(minStack.isEmpty()){
            minStack.add(x);
        } else {
            int currentMin = Math.min(x, minStack.get(minStack.size()-1));
            minStack.add(currentMin);
        }
    }

    public void pop() {
        if(a.isEmpty()) return;   // added safety
        a.remove(a.size()-1);
        minStack.remove(minStack.size()-1);
    }

    public int top() {
        if(a.isEmpty()) return -1;   // added safety
        return a.get(a.size()-1);
    }

    public int getMin() {
        if(minStack.isEmpty()) return -1;   // added safety
        return minStack.get(minStack.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */