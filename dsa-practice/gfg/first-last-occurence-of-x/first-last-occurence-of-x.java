
import java.util.ArrayList;

class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> res = new ArrayList<>();

        res.add(ff(arr, x));
        res.add(fl(arr, x));

        return res;
    }

    private int ff(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int fidx = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                fidx = mid;      
                high = mid - 1;  
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return fidx;
    }

    private int fl(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int lidx = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                lidx = mid;       
                low = mid + 1;        
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return lidx;
    }
}
