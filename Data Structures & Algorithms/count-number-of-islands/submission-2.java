class Solution {
    class Pair
    {
        int first;
        int second;
        public Pair(int first,int second)
        {
            this.first=first;
            this.second=second;
        }
    }
    public void bfs(int i , int j , int vis[][],char[][]grid)
    {
        vis[i][j]=1;
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(i,j));
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        while(!q.isEmpty())
        {
            int r=q.peek().first;
            int c=q.peek().second;
            q.remove();
        
        for( int k=0;k<4;k++)
        {
            int row=r+drow[k];
            int col=c+dcol[k];
            if(row>=0 && row<grid.length && col>=0 && col<grid[0].length && vis[row][col]==0 && grid[row][col]=='1')
            {
                vis[row][col]=1;
                q.add(new Pair(row,col));
            }
        }
        }
    }
    public int numIslands(char[][] grid) {
        int n= grid.length;
        int m=grid[0].length;
        int vis[][]= new int[n][m];
        int cnt=0;
        for( int i =0;i<n;i++)
        {
            for( int j =0;j<m;j++)
            {
                if(vis[i][j]==0 && grid[i][j]=='1')
                {
                    cnt++;
                    bfs(i,j,vis,grid);
                }
            }
        }
        return cnt;
    }
}
