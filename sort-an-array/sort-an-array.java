class Solution {
    public int[] sortArray(int[] nums) {
        quick(nums, 0, nums.length-1);
        return nums;
    }
    
    public void quick(int arr[], int s, int e){
        if(s>=e){
            return ;
        }
        int mid = (s+e)/2;
        int i=s;
        int j = e;
        int pi = arr[mid];
        while(i<=j){
            while(arr[i] < pi){
                i++;
            }
            while(arr[j] > pi){
                j--;
            }
            if(i<=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        quick(arr, s, j);
        quick(arr, i,e);
    }
   
}