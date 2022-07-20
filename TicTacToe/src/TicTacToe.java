import java.util.*;

public class TicTacToe {

    static ArrayList<Integer> humanPosition = new ArrayList<>();
    static ArrayList<Integer> cpuPosition = new ArrayList<>();


    public static void main(String[] args) {
        String[][] board = {{"  ", "|", " ", "|", "  "},
                {"--", "+", "-", "+", "--"},
                {"  ", "|", " ", "|", "  "},
                {"--", "+", "-", "+", "--"},
                {"  ", "|", " ", "|", "  "}};

        printBoard(board);

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your placement (1-9): ");
            int humanMove = input.nextInt();

            while (humanPosition.contains(humanMove) || cpuPosition.contains(humanMove)) {
                System.out.print("position taken! Enter a correct Position: ");
                humanMove = input.nextInt();
            }

            placement(board, humanMove, "Human");

            String result = checkWinner();
            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

            Random cpuInput = new Random();
            int cpuMove = cpuInput.nextInt(9) + 1;
            while (humanPosition.contains(cpuMove) || cpuPosition.contains(cpuMove)) {
                cpuMove = cpuInput.nextInt(9) + 1;
            }

            placement(board, cpuMove, "CPU");

            printBoard(board);

            result = checkWinner();
            if (result.length() > 0 ) {
                System.out.println(result);
                break;
            }
        }
    }

    public static void placement(String[][] Board, int placement, String player) {

        String symbol = " ";
        if (player.equals("Human")) {
            symbol = "X";
            humanPosition.add(placement);
        } else if (player.equals("CPU")) {
            symbol = "O";
            cpuPosition.add(placement);
        }

        switch (placement) {
            case 1 -> Board[0][0] = " " + symbol;
            case 2 -> Board[0][2] = symbol;
            case 3 -> Board[0][4] = symbol + " ";
            case 4 -> Board[2][0] = " " + symbol;
            case 5 -> Board[2][2] = symbol;
            case 6 -> Board[2][4] = symbol + " ";
            case 7 -> Board[4][0] = " " + symbol;
            case 8 -> Board[4][2] = symbol;
            case 9 -> Board[4][4] = symbol + " ";
            default -> {
            }
        }

    }

    public static void printBoard(String [][] Board) {
        for (String[] row: Board){
            for (String c: row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static String checkWinner () {

        List<Integer> topRow = Arrays.asList(1,2,3);
        List<Integer> midRow = Arrays.asList(4,5,6);
        List<Integer> botRow = Arrays.asList(7,8,9);
        List<Integer> leftCol = Arrays.asList(1,4,7);
        List<Integer> midCol = Arrays.asList(2,5,8);
        List<Integer> rightCol = Arrays.asList(3,6,9);
        List<Integer> cross1 = Arrays.asList(1,5,9);
        List<Integer> cross2 = Arrays.asList(3,5,7);

        List<List> winning = new ArrayList<>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (List l : winning) {
            if (humanPosition.containsAll(l)) {
                return "Congratulations!!! You Won!!!";
            } else if (cpuPosition.containsAll(l)) {
                return "CPU Won!!!";
            } else if (humanPosition.size() + cpuPosition.size() == 9) {
                return("The game is Tie!");
            }
        }

        return("");
    }
}