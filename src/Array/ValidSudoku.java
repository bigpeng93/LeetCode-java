package Array;

import com.sun.rowset.internal.Row;

import java.util.HashSet;

public class ValidSudoku {
    public boolean solution(char[][] board){
        for (int i = 0;i<9;i++){
            HashSet<Character> row = new HashSet<Character>();
            HashSet<Character> col = new HashSet<Character>();
            HashSet<Character> cub = new HashSet<Character>();
            for (int j =0; j<9;j++){
                if(board[i][j]!='.' && !row.add(board[i][j]))
                    return false;
                if(board[j][i]!='.' && !col.add(board[j][i]))
                    return false;
                int RowCub =3*(i/3);
                int ColCub =3*(i%3);
                if(board[RowCub+j/3][ColCub+j%3]!='.' && !cub.add(board[RowCub+j/3][ColCub+j%3]))
                    return false;
            }
        }
        return true;
    }
}
