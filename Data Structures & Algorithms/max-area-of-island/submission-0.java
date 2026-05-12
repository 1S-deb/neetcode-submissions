class Solution {
    class Pair
    {
        int first;
        int second;
        public Pair( int first, int second)
        {
            this.first=first;
            this.second=second;
        }
    }
    
    public  int bfs( int r, int c , int vis[][], int grid[][])
    {   int res=1;
        vis[r][c]=1;
       
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(r,c));
        int n = grid.length;
        int m =grid[0].length;
        int delrow[]={-1, 0 ,1,0};
        int delcol[]={0,1,0,-1};
        while(!q.isEmpty())
        {
            int row= q.peek().first;
            int col=q.peek().second;
            q.remove();
            for( int i =0;i<4;i++)
            {
                int nrow= row+delrow[i];
                int ncol=col+delcol[i];
            
            if( nrow>=0 && nrow<n && ncol>=0 
            && ncol<m && vis[nrow][ncol]==0 
             && grid[nrow][ncol]==1)
            {
                vis[nrow][ncol]=1;
                q.add(new Pair(nrow,ncol));
                res++;
            }
        }
        }
        return res;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int vis[][]=new int[row][col];
        int area=0;
        for( int i =0;i<row;i++)
        {
            for( int j=0;j<col;j++)
            {
                if( vis[i][j]==0 && grid[i][j]==1)
                {
                    area= Math.max(area,bfs(i,j,vis,grid));
                }
            }
        }
        return area;
    }
}
