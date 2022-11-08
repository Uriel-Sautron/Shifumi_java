import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create player 1
        Scanner newEntry = new Scanner(System.in);
        System.out.print("Entre un nom: ");
        String newName = newEntry.nextLine().trim();
        Player player1 = new Player(newName);

        // Create player 2
        System.out.print("Entre un nom: ");
        newName = newEntry.nextLine().trim();
        Player player2 = new Player(newName);

        Game game = new Game(player1, player2);
        game.startGame();
        game.getGameWinner();

    }
}