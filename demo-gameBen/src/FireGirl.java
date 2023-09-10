public final class FireGirl extends GameCharacter {

    @Override
    public void move() {

    }

    @Override
    public void attack1(GameCharacter gameCharacter) {
        gameCharacter.hp -= 150;
    }

    @Override
    public void attack2(GameCharacter gameCharacter) {
        gameCharacter.hp -= 150;
    }
}
