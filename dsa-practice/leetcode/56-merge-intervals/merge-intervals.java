
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1){
            return intervals;
        }
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();

        int[] cInterval = intervals[0];
        merged.add(cInterval);

        for(int[] nInterval : intervals){
            int cEnd = cInterval[1];
            int nStart = nInterval[0];
            int nEnd = nInterval[1];

            if(nStart <= cEnd){
                cInterval[1] = Math.max(cEnd, nEnd);
            } else {
                cInterval = nInterval;
                merged.add(cInterval);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}