import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Round {
    private Player player1;
    private Player player2;

    public Round(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String[] moves = {"Pierre", "Papier", "Ciseaux"};

    /* matrice {
         "Pierre": {"Pierre", "Papier", "Ciseaux"},
         "Papier": {"Pierre", "Papier", "Ciseaux"},
         "Ciseaux": {"Pierre", "Papier", "Ciseaux"}
        }

     */
    public int[][] choices = {
            {0, -1, 1},
            {1, 0, -1},
            {-1, 1, 0}
    };
    public void getPlayersMove() {
        Scanner newEntry = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Taper 1, 2 ou 3:");
        System.out.println("1 - Pierre");
        System.out.println("2 - Papier");
        System.out.println("3 - Ciseaux");
        System.out.println(" ");

        System.out.print(this.player1.getName() + " fait ton choix: ");
        int player1Move = parseInt(newEntry.nextLine());
        System.out.println(" ");
        this.player1.setMove(this.moves[(player1Move - 1)]);

        System.out.print(this.player2.getName() + " fait ton choix: ");
        int player2Move = parseInt(newEntry.nextLine());
        System.out.println(" ");
        this.player2.setMove(this.moves[(player2Move - 1)]);

    }

    public void getRoundWinner() {

        System.out.println(this.player1.getName() + " a choisi " + this.player1.getMove());
        System.out.println(" ");
        System.out.println(this.player2.getName() + " a choisi " + this.player2.getMove());

        int choiceP1 = Arrays.asList(this.moves).indexOf(player1.getMove());
        int choiceP2 = Arrays.asList(this.moves).indexOf(player2.getMove());

        this.player1.setScore(this.choices[choiceP1][choiceP2]);
        /*
        if(this.player1.getMove() == "Pierre") {
            if(this.player2.getMove() == "Ciseaux") {
                this.player1.setScore();
            } else if (this.player2.getMove() == "Papier") {
                this.player2.setScore();
            }
        } else if (this.player1.getMove() == "Ciseaux") {
            if(this.player2.getMove() == "Papier") {
                this.player1.setScore();
            } else if (this.player2.getMove() == "Pierre") {
                this.player2.setScore();
            }
        } else if (this.player1.getMove() == "Papier") {
            if(this.player2.getMove() == "Pierre") {
                this.player1.setScore();
            } else if (this.player2.getMove() == "Ciseaux") {
                this.player2.setScore();
            }
        }
         */

    }


}
