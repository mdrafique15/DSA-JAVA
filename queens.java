public class queens {
    public static boolean isSafe(char board[][], int row, int col){
     //3 condtions to check is it safe or not

     //vertically up
     for(int i=row -1; i>=0 ; i--){
       if(board[i][col]=='Q'){
        return false;
       }
     }
     //diiagonally left up
     for(int i=row-1, j=col-1; i>=0 && j>=0; i-- , j--){
        if(board[i][j]=='Q'){
            return false;
           }
     }
     //diagonally right up
     for(int i=row-1, j=col+1; i>=0 && j<board.length; i-- , j++){
        if(board[i][j]=='Q'){
            return false;
           }
     }
     return true;

    }
    public static void nQueens(char board[][], int row) {
        //base case
        if(row==board.length){
          printBoard(board);
          return;
        }
        //column loop
        for(int j =0; j<board.length; j++){
            //check wheather it is safe or not to put Q
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                //function call
                nQueens(board, row+1);
                //after backtrack, again same space is empty to store queen
                board[row][j] = 'x';
            }
            
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("------------");
        for(int i=0; i< board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char [n][n];

        //intitialise
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
          board[i][j] = 'x';
        }   
     }
     nQueens(board, 0);
    }
    
}
