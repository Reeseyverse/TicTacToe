package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character[][] matrix;

    private String winningPlayer() {
       // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            // check rows
            if (matrix[i][0] != ' ' && matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2]) {
                return matrix[i][0].toString();
            }
            // Check columns
            if (matrix[0][i] != ' ' && matrix[0][i] == matrix[1][i] && matrix[1][i] == matrix[2][i]) {
                return matrix[0][i].toString();
            }
        }
          // Check diagonals
        if (matrix[0][0] != ' ' && matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2] ||
            matrix[0][2] != ' ' && matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]) {
            return matrix[1][1].toString();
        }
        // No winner
        return "";
        }

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {
        return "X".equals(winningPlayer());
    }

    public Boolean isInFavorOfO() {
   return "O".equals(winningPlayer());
    }

    public Boolean isTie() {
        return winningPlayer().isEmpty();
    }

    public String getWinner() {
        return winningPlayer();
    }
}
