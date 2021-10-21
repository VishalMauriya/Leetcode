class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int row = obstacleGrid.length;
        int column = obstacleGrid[0].length;     
        
        if(obstacleGrid[0][0] == 1)
            return 0;
        
        obstacleGrid[0][0] = 1;
        
        for(int i=1; i<row; i++)
            obstacleGrid[i][0] = (obstacleGrid[i][0]==0 && obstacleGrid[i-1][0]==1) ? 1 : 0;
        
        for(int j=1; j<column; j++)
            obstacleGrid[0][j] = (obstacleGrid[0][j]==0 && obstacleGrid[0][j-1]==1) ? 1 : 0;
            
        for(int i=1; i<row; i++){
            for(int j=1; j<column; j++){
                if(obstacleGrid[i][j] == 0){
                     obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                }else{
                    obstacleGrid[i][j] = 0;
                }
            }
        }
        
        return obstacleGrid[row-1][column-1];
        
    }
}