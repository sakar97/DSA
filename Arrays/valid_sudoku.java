import java.util.*;

class valid_sudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char current_val = board[i][j];
                if (current_val != '.') {
                    if (!hs.add(current_val + "found in row " + i) || !hs.add(current_val + "found in column " + j)
                            || !hs.add(current_val + "found in sub box " + i / 3 + "-" + j / 3))
                        return false;
                }
            }
        }
        return true;
    }
}