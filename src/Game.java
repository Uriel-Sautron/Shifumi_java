public class Game {
   private Player player1;
   private Player player2;

   public Game(Player player1, Player player2) {
       this.player1 = player1;
       this.player2 = player2;
   }

   public void startGame() {
        Round round = new Round(this.player1, this.player2);
       for (int i = 0; i < 3; i++) {
           System.out.printf("");
           System.out.println("********** Manche: " + (i + 1) + " **********");
           round.getPlayersMove();
           round.getRoundWinner();
       }

    }

    public void getGameWinner() {
       if(this.player1.getScore() > this.player2.getScore()) {
           System.out.println(this.player1.getName() + " vainqueur");
       } else if(this.player1.getScore() < this.player2.getScore()) {
           System.out.println(this.player2.getName() + " vainqueur");
       } else {
           System.out.println("Match nul");
       }
    }


}
