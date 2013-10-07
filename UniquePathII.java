
public class UniquePathII {

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int [][] res = new int[m][n];
        if(obstacleGrid[m-1][n-1]==1)
            return 0;
        res[m-1][n-1] =1;
        for(int i = m-2; i>=0; i--){
            if(obstacleGrid[i][n-1]==0){
                res[i][n-1] =res[i+1][n-1];
            }
            else{
                res[i][n-1] = 0;
            }
        }
        for( int j = n-2; j>=0; j--){
            if(obstacleGrid[m-1][j]==0){
                res[m-1][j] = res[m-1][j+1];
            }
            else{
                res[m-1][j] = 0;
            }
        }
        for( int i = m-2; i>=0; i--)
            for(int j = n-2; j>=0; j--){
                if(obstacleGrid[i][j]==0){
                    res[i][j] = res[i+1][j]+res[i][j+1];
                }
                else{
                    res[i][j] = 0;
                }
            }
        return res[0][0];
    }
}
