class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3){
            return false;
        }
        int max = 0;
        int ind = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                ind = i;
            }
        }
        if(ind == arr.length -1 || ind == 0){
            return false;
        }
        int j = 0;
        while(j < ind){
            if(arr[j] < arr[j+1]){
                j++;
            }
            else{
                return false;
            }
        }
        while(j < arr.length-1){
            if(arr[j] > arr[j+1]){
                j++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}