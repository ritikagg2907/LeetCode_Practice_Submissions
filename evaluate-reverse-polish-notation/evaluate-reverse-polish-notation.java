class Solution {
    public int evalRPN(String[] arr) {
        Stack<String> st = new Stack<>();
        int a,b,c;
        String res;
        for(int i=0;i<arr.length ; i++){
           // if(!st.isEmpty()){
           //      System.out.println(st.peek());
           // }
            if(!arr[i].equals("+") && !arr[i].equals("*") && !arr[i].equals("/") && !arr[i].equals("-")){
                st.push(arr[i]);
            }
            else{
                switch(arr[i]){
                    case "+":
                        a = Integer.parseInt(st.pop());
                        b = Integer.parseInt(st.pop());
                        c = a+b;
                        res = Integer.toString(c);
                        st.push(res);
                        break;
                    
                    case "-":
                        a = Integer.parseInt(st.pop());
                        b = Integer.parseInt(st.pop());
                        c = b-a;
                        res = Integer.toString(c);
                        st.push(res);
                        break;
                    
                    case "*":
                        a = Integer.parseInt(st.pop());
                        b = Integer.parseInt(st.pop());
                        c = a*b;
                        res = Integer.toString(c);
                        st.push(res);
                        break;
                    
                    case "/":
                        a = Integer.parseInt(st.pop());
                        b = Integer.parseInt(st.pop());
                        c = b/a;
                        res = Integer.toString(c);
                        st.push(res);
                        break;
                }
            }
        }
        return Integer.parseInt(st.pop());
    }
}