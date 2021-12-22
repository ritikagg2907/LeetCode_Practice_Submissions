class Solution {
    public int longestMountain(int[] arr) {
        ArrayList<Integer> ar = new ArrayList<>();
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				ar.add(i);
			}
		}
		int res = 0;
		for (int i : ar) {
			int j = i;
			int k = i;
			while (j > 0 && arr[j - 1] < arr[j]) {
				j--;
			}
			while (k < arr.length - 1 && arr[k] > arr[k + 1]) {
				k++;
			}
			res = Math.max(res, k - j + 1);
		}
		return res;
    }
}