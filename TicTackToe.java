import System.util.Scanner;


public class TicTackToe
{
	public static void main(String[] args)
	{
		String[][] board = new String[3][3];
		Scanner scan = new Scanner(System.in);
		int guess;
		boolean won = false;
		for(int i = 0; i<3; i++)
		{
			for(int j = 0; j<3; j++)
			{
				board[i][j] = "-";
			}
		}

		while(!won)
		{

			print();
			System.out.println("Enter location with the row and column number.";
		}

	}

	public void print(String[][] board)
	{

	}

	public void checkBoard(String[][] board)
	{
		if(board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2]))
		{
			won = true;
		}
		else if(board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2])
		{
			won = true;
		}
		else if(board[2][0].equals(board[2][1]) && board[2][0].equals(board[2][2]))
		{
			won = true;
		}
		else if(board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2]))
		{
			won = true;
		}




	}
}