public class Player {
    private String name;
    private int score;
    private String move;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getMove() {
        return this.move;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score += score;
        /*
        System.out.println(" ");
        System.out.println("~~~~~~~~~~ " + this.name + " remporte la manche ~~~~~~~~~~");
        System.out.println(" ");
         */
    }

    public void setMove(String move) {
        this.move = move;
    }

}
