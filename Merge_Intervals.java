public class Merge_Intervals {
     public int[][] merge(int[][] intervals) {
        int max = 0;
        for (int i = 0; i < intervals.length; i++) {
            max = Math.max(intervals[i][0], max);
        }

        int[] mp = new int[max + 1];
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            mp[start] = Math.max(end + 1, mp[start]);
        }

        int r = 0;
        int have = -1;
        int intervalStart = -1;
        for (int i = 0; i < mp.length; i++) {
            if (mp[i] != 0) {
                if (intervalStart == -1) intervalStart = i;
                have = Math.max(mp[i] - 1, have);
            }
            if (have == i) {
                intervals[r++] = new int[] { intervalStart, have };
                have = -1;
                intervalStart = -1;
            }
        }

        if (intervalStart != -1) {
            intervals[r++] = new int[] { intervalStart, have };
        }
        if (intervals.length == r) {
            return intervals;
        }

        int[][] res = new int[r][];
        for (int i = 0; i < r; i++) {
            res[i] = intervals[i];
        }

        return res;
    }
    
}
