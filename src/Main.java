import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         //declare variables
        char[] square = {'1', '2', '3',                 //array with char
                    '4', '5', '6',
                    '7', '8', '9'};
        var numberOfSquaresUsed = 0;                                         //Number of squares used
        var whoseTurn = 'X';                                                //Whose turn to play



        while (numberOfSquaresUsed < 9 ) {
         new printTheBoard(square);
         System.out.printf("Choose a number player " + whoseTurn + ":\n");
         Scanner sc = new Scanner(System.in);                               //read user input
         var input = sc.nextInt();

         //control input is only 1-9
         if (input < 1 || input > 9) {
             System.out.println("Invalid input. Please enter a number between 1 and 9.\n");
             continue;
            }

         if (square[input -1] == 'X' || square[input -1] == 'O') {                         //Check if square is occupied
             System.out.println("That number is already chosen, please enter another number.\n");
         continue;
         } else {
             square[input -1] = whoseTurn;

         }
         //check if victory, and write message if there is a winner
            if ((square[0] == whoseTurn) && (square[1] == whoseTurn) && (square[2] == whoseTurn) ||
             (square[3] == whoseTurn) && (square[4] == whoseTurn) && (square[5] == whoseTurn) ||
             (square[6] == whoseTurn) && (square[7] == whoseTurn) && (square[8] == whoseTurn) ||
             (square[0] == whoseTurn) && (square[3] == whoseTurn) && (square[6] == whoseTurn) ||
             (square[1] == whoseTurn) && (square[4] == whoseTurn) && (square[7] == whoseTurn) ||
             (square[2] == whoseTurn) && (square[5] == whoseTurn) && (square[8] == whoseTurn) ||
             (square[0] == whoseTurn) && (square[4] == whoseTurn) && (square[8] == whoseTurn) ||
             (square[6] == whoseTurn) && (square[4] == whoseTurn) && (square[2] == whoseTurn)) {
             new printTheBoard(square);                                         //print board to see win
             System.out.println("Congratulations, you won! \n");
             numberOfSquaresUsed = 0;
             square = new char[]{'1','2','3','4','5','6','7','8','9'};

             } else {
                square[input -1] = whoseTurn;
                numberOfSquaresUsed++;                             //add +1 to used squares
                if (numberOfSquaresUsed == 9) {
                    new printTheBoard(square);
                    System.out.println("There is no winner this round, it is a tie!\n");
                    numberOfSquaresUsed = 0;
                    continue;
                }
                if (whoseTurn == 'X') {                          //Check which player has played and whose turn it is
                     whoseTurn = 'O';
                 } else {
                     whoseTurn = 'X';
                 }
            }
        }
    }
}