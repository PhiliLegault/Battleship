import java.util.Scanner;


public class battleship2d{

	public static void main(String[] args){

		board2d testBoard = new board2d();

		
		testBoard.createBoard();

		Scanner scan = new Scanner(System.in);

		while(testBoard.numOfHits < 3){
			System.out.println("Enter a y coordinate...");
			String yVal = scan.next();
			System.out.println("Enter an x coordinate...");
			String xVal = scan.next();

			String word = testBoard.checkYourself(yVal, xVal);
			System.out.println(word);
		}
	
	}
}