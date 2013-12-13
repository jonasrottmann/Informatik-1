package uebung07;
import junit.framework.TestCase;

public class SudokuJUnitTest extends TestCase{
    
    public void testSudoku1() {
        int[][] sudoku = {{ 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                          { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                          { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                          { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                          { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                          { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                          { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                          { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                          { 3, 4, 5, 2, 8, 6, 1, 7, 9 }};
        Sudoku meinSudoku = new Sudoku(sudoku);
        
        assertTrue(meinSudoku.pruefen());
    }
    
    public void testSudoku2() {
        int[][] sudoku = {{5, 3, 4, 6, 7, 8, 8, 1, 3},
                          {6, 7, 2, 1, 9, 5, 3, 4, 8},
                          {1, 9, 8, 3, 4, 2, 5, 6, 7},
                          {8, 5, 9, 7, 6, 1, 4, 2, 3},
                          {4, 2, 6, 8, 5, 3, 7, 9, 1},
                          {7, 1, 3, 9, 2, 4, 8, 5, 6},
                          {9, 6, 1, 5, 3, 7, 2, 8, 4},
                          {2, 8, 7, 4, 1, 9, 6, 3, 5},
                          {3, 4, 5, 2, 8, 6, 2, 7, 8}};
        Sudoku meinSudoku = new Sudoku(sudoku);
        
        assertFalse(meinSudoku.pruefen());
    }
    
    public void testSudoku3() {
        int[][] sudoku = {{5, 3, 7, 6, 4, 8, 9, 1, 2},
                          {6, 7, 2, 1, 9, 5, 3, 4, 8},
                          {1, 9, 4, 3, 8, 2, 5, 6, 7},
                          {8, 5, 9, 7, 6, 1, 4, 2, 3},
                          {4, 2, 6, 8, 5, 3, 7, 9, 1},
                          {7, 1, 3, 9, 2, 4, 8, 5, 6},
                          {9, 6, 8, 5, 3, 7, 2, 1, 4},
                          {2, 8, 1, 4, 7, 9, 6, 3, 5},
                          {3, 4, 5, 2, 8, 6, 1, 7, 9}};
        Sudoku meinSudoku = new Sudoku(sudoku);
        
        assertFalse(meinSudoku.pruefen());
    }
    
    public void testSudoku4() {
        int[][] sudoku = {{5, 5, 5, 5, 5, 5, 5, 5, 5},
                          {5, 5, 5, 5, 5, 5, 5, 5, 5},
                          {5, 5, 5, 5, 5, 5, 5, 5, 5},
                          {5, 5, 5, 5, 5, 5, 5, 5, 5},
                          {5, 5, 5, 5, 5, 5, 5, 5, 5},
                          {5, 5, 5, 5, 5, 5, 5, 5, 5},
                          {5, 5, 5, 5, 5, 5, 5, 5, 5},
                          {5, 5, 5, 5, 5, 5, 5, 5, 5},
                          {5, 5, 5, 5, 5, 5, 5, 5, 5}};
        Sudoku meinSudoku = new Sudoku(sudoku);
        
        assertFalse(meinSudoku.pruefen());
    }
    
    public void testSudoku5() {
        int[][] sudoku = {{5, 3, 4, 6, 7, 8, 9, 1, 2},
                          {6, 7, 2, 1, 9, 5, 3, 4, 8},
                          {8, 5, 9, 7, 6, 1, 4, 2, 3},
                          {4, 2, 6, 8, 5, 3, 7, 9, 1},
                          {7, 1, 3, 9, 2, 4, 8, 5, 6},
                          {9, 6, 1, 5, 3, 7, 2, 8, 4},
                          {1, 9, 8, 3, 4, 2, 5, 6, 7},
                          {2, 8, 7, 4, 1, 9, 6, 3, 5},
                          {3, 4, 5, 2, 8, 6, 1, 7, 9}};
        Sudoku meinSudoku = new Sudoku(sudoku);
        
        assertFalse(meinSudoku.pruefen());
    }
    
    public void testSudoku6() {
        int[][] sudoku = {{5, 3, 4, 6, 7, 8, 9, 12, 2},
                          {6, 7, 2, 12, 9, 5, 3, 4, 8},
                          {12, 9, 8, 3, 4, 2, 5, 6, 7},
                          {8, 5, 9, 7, 6, 12, 4, 2, 3},
                          {4, 2, 6, 8, 5, 3, 7, 9, 12},
                          {7, 12, 3, 9, 2, 4, 8, 5, 6},
                          {9, 6, 12, 5, 3, 7, 2, 8, 4},
                          {2, 8, 7, 4, 12, 9, 6, 3, 5},
                          {3, 4, 5, 2, 8, 6, 12, 7, 9}};
        Sudoku meinSudoku = new Sudoku(sudoku);
        
        assertFalse(meinSudoku.pruefen());
    }
    
    
}
