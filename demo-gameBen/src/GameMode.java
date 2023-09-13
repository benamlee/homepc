import java.util.ArrayList;
import java.util.List;

public enum GameMode {
    RUNRACING, //
    KILLTHEBOSS, //
    FIGHTING5V5,;


    public static void runWin(Game game) {
        // sout the 1st, 2nd, 3rd
    }

    public static List<GameCharacter> runRank(Game game) {
        List<GameCharacter> rankOfPlayers = new ArrayList<>();
        // how to play?
        return rankOfPlayers;
    }

    public static void killWin(Game game) {
        // sout the most kill player
    }

    public static void fightWin(Game game) {
        // sout the winning team
    }

}
