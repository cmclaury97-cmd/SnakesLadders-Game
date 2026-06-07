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
