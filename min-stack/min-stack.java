class MinStack {

    /** initialize your data structure here. */
    int arr[] = new int[30000];
    int top;
    int marr[] = new int[30000];
    int mtop;
    public MinStack() {
        top = -1;
        mtop = -1;
    }
    
    public void push(int val) {
        if(top == -1 && mtop ==-1){
            top++;
            mtop++;
            arr[top] = val;
            marr[mtop] = val;
        }
        else{
            top++;
            arr[top] = val;
            if(marr[mtop] >= val){
                mtop++;
                marr[mtop] = val;
            }
        }
    }
    
    public void pop() {
        int val = arr[top];
        top--;
        if(marr[mtop] == val){
            mtop--;
        }
    }
    
    public int top() {
        int val = arr[top];
        return val;
    }
    
    public int getMin() {
        return marr[mtop];
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