class TicTacToe{
    int [][] board;
    int posX;
    int posY;
    public TicTacToe(){
        board = new board[3][3];
    }
    public int posX() return posX;
    public int posY() return posY;
    public boolean checkWin(){
        int c = 0;
   for(int j = 0;j<3;j++){
    c=0;
        for(int i = 0;i<3;i++){
c+= board[i][j];
if(c==3) return true;
        }
   }
     for(int a = 0;j<3;j++){
    c=0;
        for(int b = 0;i<3;i++){
c+= board[a][b];
if(c==3) return true;
        }
   }
   if(board[0][0]+board[1][1]+board[2][2]==3) return true;
   if(board[0][2]+board[1][1]+board[2][0]==3) return true;
   return false;
    }
}