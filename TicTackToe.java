import System.util.Scanner;

private Array[][] board = new Array[2][2];
public class TicTackToe
{
	public static void main(String[] args)
	{
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

	public void print(Array[][] board)
	{

	}

	public void checkBoard(Array[][] board)
	{

	}
}