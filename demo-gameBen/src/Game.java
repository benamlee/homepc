public class Game {

    GameMode gameMode;
    GameCharacter[] gameCharacters = new GameCharacter[10];
    int gameId;

    static int id = 0;
    // gameEnd should reuse id?

    public Game(GameMode gameMode) {
        this.gameMode = gameMode;
        this.gameId = ++id;
    }

    void gameStart() {
        System.out.println("Game Start");
        // timer...
    }

    void gameEnd() {
        if (this.gameMode == GameMode.RUNRACING)
            GameMode.runWin(this);
        if (this.gameMode == GameMode.KILLTHEBOSS)
            GameMode.killWin(this);
        if (this.gameMode == GameMode.FIGHTING5V5)
            GameMode.fightWin(this);
    }

    public static void fireTrap(GameCharacter gameCharacter) {
        gameCharacter.hp -= 200;
        if (gameCharacter.hp <= 0)
            gameCharacter.die();
    }

    public static void healPool(GameCharacter gameCharacter) {
        gameCharacter.hp += 200;
        if (gameCharacter.hp > 1000 + (100 * gameCharacter.level))
            gameCharacter.hp = 1000 + (100 * gameCharacter.level);
    }

    public static void main(String[] args) {
        FireGirl fg = new FireGirl();
        WindBoy wb = new WindBoy();
        fg.attack1(wb);
        System.out.println(wb.hp);
    }

    public static Game gameBuild() {

        return new Game(null);
    }

}
