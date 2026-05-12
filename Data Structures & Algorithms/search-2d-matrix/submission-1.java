class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int col=matrix[0].length;
        for( int i =0;i<r;i++)
        {
            for( int j =0;j<col;j++)
            {
                if(matrix[i][j]==target)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
