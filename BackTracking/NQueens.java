public class NQueens {
    static int count =0;
    public static void main(String[] args) {
        int n = 5;
        char [][]board = new char[n][n];
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                board[i][j]='x';
            }
        }
        nQueensAll(board,0);
        if(nQueensOne(board, 0))
        {
            System.out.println("Solution is possible");
            printBoard(board);
        }
        else{
            System.out.println("Solution is not possible");
        }
        System.out.println("Total possible solution for NQueen's problem is : "+count);
    }
    public static boolean nQueensOne(char board[][],int row){//to print only one solution if possible
        if(row == board.length)
        {
            
            count++;
            return true;
        }
        for(int j =0;j<board.length;j++)
        {
            if(isSafe(board, row, j))
            {
                board[row][j]='Q';
                if(nQueensOne(board,row+1))
                {
                    return true;
                }
                board[row][j]='x';
            }
        }
        return false;
    }
    public static void nQueensAll(char board[][],int row){//to print all the possible solutions
        
        //base
        if(row == board.length){
            printBoard(board);
            count++;
            return ;
        }
        //column loop
        for(int j =0;j<board.length;j++)
        {
            if(isSafe(board,row,j)){

                board[row][j]='Q';
                nQueensAll(board, row+1);//functoin call
            }
            board[row][j]='x';//backtracking
        }
    }
    public static void printBoard(char board[][])
    {
        System.out.println("--------Chess Board---------");
        for(int i =0;i<board.length;i++)
        {
            for(int j =0;j<board.length;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char[][]board,int row,int col)
    {
        //vertical up
        for(int i = row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal left up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--)
        {
            
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        //diagonal right up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++)
        {
            if(board[i][j]=='Q')
            {
                return false;
            }
        }
        return true;
    }

}
