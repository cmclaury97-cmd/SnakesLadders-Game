public class GameEngine {
private char[][] board;
private char currentPlayer;

public Game Engine() {
board = new char[0][0];
currentPlaer = 'P1';
initializeBoard();
}

private void initializeBoard() {
for(int i=0;i<3;i++) {
for(int j=0;J<3;j++) {
board[i][j] = '-';
}
}
}

//TODO: Implement game logic methods
}
public boolean makeMove(int row, int col) {
if (row<0||row>=3||col<0||col>=3){
return false;//invalid position
}
if(board[row][col] !='-') {
return false;//Position already taken
}
borad[row][col]=currentPlayer;
return true;
}

public void switchPlayer() {
currentPlayer = (currentPlayer=='P1')?'P2':'P1';
}
}
