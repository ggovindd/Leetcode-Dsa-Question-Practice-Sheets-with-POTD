class Solution {
        int n;
    String str;
    int[][] costMemo;
    int[][] memo;

    private int getCost(int i, int j) {
        int len = j - i + 1;

        if (costMemo[i][j] != -1) {
            return costMemo[i][j];
        }

        int minCost = Integer.MAX_VALUE;

        for (int d = 1; d < len; d++) {
            if (len % d != 0)
                continue;

            int cost = 0;
            for (int group = 0; group < d; group++) { 
                int l = i + group;
                int r = l + (len / d - 1) * d;

                while (l < r) {
                    if (str.charAt(l) != str.charAt(r))
                        cost++;

                    l += d;
                    r -= d;
                }
            }

            minCost = Math.min(minCost, cost);
        }

        return costMemo[i][j] = minCost;
    }

    private int solve(int start, int k) {
        if (k == 0) {
            if (start == n)
                return 0;

            return Integer.MAX_VALUE;
        }

      
        if (start + 2 * k > n)
            return Integer.MAX_VALUE;

        if (memo[start][k] != -1) {
            return memo[start][k];
        }

        int result = Integer.MAX_VALUE;

        for (int end = start + 1; end < n; end++) {
            
            int remainingCost = solve(end + 1, k - 1);

            if (remainingCost == Integer.MAX_VALUE) {
                continue;
            }

            result = Math.min(result, getCost(start, end) + remainingCost);
        }

        return memo[start][k] = result;
    }

    public int minimumChanges(String s, int k) {
        n = s.length();
        str = s;

        costMemo = new int[n + 1][n + 1];
        for (int[] row : costMemo)
            Arrays.fill(row, -1);

        memo = new int[n + 1][k + 1];
        for (int[] row : memo)
            Arrays.fill(row, -1);

        return solve(0, k);
    }
}
    