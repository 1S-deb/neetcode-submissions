class Solution {
    public boolean bs( int matrix[], int k)
    {
        int low=0;
        int high=matrix.length;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if( matrix[mid]<k)
            {
                low=mid+1;
            }
            else if( matrix[mid]>k)
            {
                high=mid-1;
            }
            else
            {
                return true;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for( int i =0;i<n;i++)
       
       {
        if(matrix[i][0]<=target && target<=matrix[i][m-1])
        {
            return bs(matrix[i],target);
        }
       }
       return false;
    }
}