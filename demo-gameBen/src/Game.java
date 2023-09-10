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

    }

    void gameEnd() {

    }

    public static void main(String[] args) {
        FireGirl fg = new FireGirl();
        WindBoy wb = new WindBoy();
        fg.attack1(wb);
        System.out.println(wb.hp);
    }

    public static Game gameBuild(){
        
        return new Game(null);
    }

}
