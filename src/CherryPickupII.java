public class CherryPickupII {
    /*
    https://leetcode.com/problems/cherry-pickup-ii/
     */
    public int cherryPickup(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int [][][]dp = new int[r][c][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                for(int k=0;k<c;k++){
                    dp[i][j][k] = -1;
                }
            }
        }

        return dfs(0, 0, c-1, dp, grid);
    }

    int dfs(int r, int c1, int c2, int dp[][][], int grid[][]){
        if(r>=grid.length || c1>=grid[0].length || c2>=grid[0].length || c1<0 || c2<0){
            return 0;
        }

        if(dp[r][c1][c2]!=-1){
            return dp[r][c1][c2];
        }

        int max = grid[r][c1];
        if(c1!=c2){
            max += grid[r][c2];
        }
        int temp=0;
        if(r!=grid.length-1){
            for(int newC1 = c1-1; newC1<=c1+1; newC1++){
                for(int newC2 = c2-1; newC2<=c2+1; newC2++){
                    temp = Math.max(temp, dfs(r+1, newC1, newC2, dp, grid));
                }
            }
        }
        max += temp;
        dp[r][c1][c2] = max;
        return max;
    }

}
