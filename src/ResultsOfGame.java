public class ResultsOfGame{
    private int id;
    private String  name;
    private String player;
    private int points;
    private boolean won;

    public ResultsOfGame(int id, String name, String player, int points, boolean won) {
        this.id = id;
        this.name = name;
        this.player = player;
        this.points = points;
        this.won = won;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isWon() {
        return won;
    }

    public void setWon(boolean won) {
        this.won = won;
    }

    @Override
    public String toString() {
        return (id +";" + name + ";" + player + ';'+points+";"+won);
    }
}
