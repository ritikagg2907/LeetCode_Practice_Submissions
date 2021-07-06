class Solution {
    public int[] sortArray(int[] nums) {
        merges(nums, 0, nums.length-1);
        return nums;
    }
    
    public void merges(int arr[], int s, int e){
        if(s<e){
            int mid = (s+e)/2;
            merges(arr, s, mid);
            merges(arr, mid+1,e);
            merge(arr, s, mid, e);
        }
        return;
    }
    
    public void merge(int arr[] , int s, int mid, int e){
        int l[] = Arrays.copyOfRange(arr, s, mid+1);
        int r[] = Arrays.copyOfRange(arr, mid+1, e+1);
        int n1 = l.length;
        int n2 = r.length;
        int i=0,j=0,k=s;
        while(i<n1 && j<n2){
            if(l[i] <= r[j]){
                arr[k] = l[i];
                k++; i++;
            }
            else{
                arr[k] = r[j];
                j++;k++;
            }
        }
        while(i<n1){
            arr[k] = l[i];
            k++; i++;
        }
        while(j<n2){
            arr[k] = r[j];
            j++;k++;
        }
        return ;
    }
   
}