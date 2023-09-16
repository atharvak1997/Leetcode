class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        row = len(grid)
        col = len(grid[0])
        visit = set()
        area = 0
        
        def dfs(r, c):
            if(r < 0 or r == row or c < 0 or c == col or grid[r][c] == 0 or (r, c) in visit):
                return 0
            visit.add((r, c))
            return (1 + dfs(r+1, c) + dfs(r-1, c) + dfs(r, c+1) + dfs(r, c-1))
        
        for rows in range((row)):
            for cols in range((col)):
                area = max(area, dfs(rows, cols))
        
        return area
            