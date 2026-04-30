public class ValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
        int[] row = new int[9];
        int[] col = new int[9];
        int[] box = new int[9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                if (board[r][c] == '.') continue;

                int val = board[r][c] - '1';
                int idx = (r / 3) * 3 + (c / 3);

                if ((row[r] & (1 << val)) > 0 ||
                    (col[c] & (1 << val)) > 0 ||
                    (box[idx] & (1 << val)) > 0) {
                    return false;
                }

                row[r] |= (1 << val);
                col[c] |= (1 << val);
                box[idx] |= (1 << val);
            }
        }
        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
            {'1','2','.','.','3','.','.','.','.'},
            {'4','.','.','5','.','.','.','.','.'},
            {'.','9','8','.','.','.','.','.','3'},
            {'5','.','.','.','6','.','.','.','4'},
            {'.','.','.','8','.','3','.','.','5'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','.','.','.','.','.','2','.','.'},
            {'.','.','.','4','1','9','.','.','8'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(board));
    }
}
