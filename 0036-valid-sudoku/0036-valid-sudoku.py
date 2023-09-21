class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = collections.defaultdict(set)
        cols = collections.defaultdict(set)
        square = collections.defaultdict(set)

        for row in range(len(board)):
            for col in range(len(board[0])):
                if board[row][col] == ".":
                    continue
                else:
                    if board[row][col] in rows[row] or board[row][col] in cols[col] or board[row][col] in square[(row // 3, col // 3)]:
                        return False
                    else:
                        rows[row].add(board[row][col])
                        cols[col].add(board[row][col])
                        square[(row//3, col//3)].add(board[row][col])
        return True