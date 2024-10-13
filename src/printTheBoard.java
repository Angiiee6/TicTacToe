public class printTheBoard {
    public printTheBoard(char[] square) {                   //Ta emot char square
        System.out.println( square[0] + " | " + square[1] + " | " + square[2]);
        System.out.println("--+---+--");
        System.out.println( square[3] + " | " + square[4] + " | " + square[5]);
        System.out.println("--+---+--");
        System.out.println( square[6] + " | " + square[7] + " | " + square[8] + "\n");
    }
}
