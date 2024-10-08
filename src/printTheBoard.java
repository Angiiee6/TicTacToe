public class printTheBoard {
    char[] square = {'1', '2', '3',                 //array with char
            '4', '5', '6',
            '7', '8', '9'};



    public printTheBoard(char[] square) {
        System.out.println( square[0] + " | " + square[1] + " | " + square[2]);
        System.out.println("--+---+--");
        System.out.println( square[3] + " | " + square[4] + " | " + square[5]);
        System.out.println("--+---+--");
        System.out.println( square[6] + " | " + square[7] + " | " + square[8] + "\n");
    }

}
