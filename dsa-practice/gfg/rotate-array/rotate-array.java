class Solution {
     public void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n; 
        rev(arr, 0, d - 1);
        rev(arr, d, n - 1);
        rev(arr, 0, n - 1);
     }

    private void rev(int[] arr, int start, int end) {
         while (start < end) {
             int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
         }
     }
 }
