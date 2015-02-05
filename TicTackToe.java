import java.util.Scanner;


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

			printThis(board);
			System.out.println("Enter location with the row and column number.");
		}

	}

	public void printThis(String[][] board)
	{
		for (int i = 0; i < board.length; i++)
			{
				for (int j = 0; i <board.length; i++)
					System.out.print(board[i][j]);
			}

	}

	public void checkBoard(String[][] board)
	{

	}
}