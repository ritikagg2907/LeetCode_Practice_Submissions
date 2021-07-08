class Solution {
    public int maximumScore(int a, int b, int c) {
        int[] arr = {a,b,c};
        Arrays.sort(arr);
		
		// the goal is to isolate the largest element and extract the maximum possible value
        int sum1=arr[0]+arr[1];
        int sum2=arr[2];
		
        int res=0;
		
        if(sum1>=sum2){
		// We can combine the 2 lower elements after utilising the largest of 3
            res=sum2+(sum1-sum2)/2;
        }else{
		// We can combine the 2 lower elements with the largest element
            res=sum1;
        }
        return res;
    }
}