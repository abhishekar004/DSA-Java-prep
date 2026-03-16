/*
LeetCode 36 - Valid Sudoku

Topic: Arrays, HashSet
Difficulty: Medium

Problem:
Determine if a 9x9 Sudoku board is valid.

Rules:
1. Each row must contain digits 1-9 without repetition.
2. Each column must contain digits 1-9 without repetition.
3. Each 3x3 sub-box must contain digits 1-9 without repetition.

Empty cells are represented by '.'.

Approach:
Use a HashSet to store unique identifiers for:
- row checks
- column checks
- sub-box checks

If any identifier already exists in the set, the board is invalid.

Time Complexity: O(1) (since board size is fixed 9x9)
Space Complexity: O(1)
*/

import java.util.HashSet;

class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){

                char num = board[i][j];

                if(num != '.'){

                    if(!set.add(num + " in row " + i) ||
                       !set.add(num + " in column " + j) ||
                       !set.add(num + " in box " + i/3 + "-" + j/3)){
                        return false;
                    }

                }
            }
        }

        return true;
    }
}
