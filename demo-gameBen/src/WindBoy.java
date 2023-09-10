public final class WindBoy extends GameCharacter {
    @Override
    public void move() {

    }

    @Override
    public void attack1(GameCharacter gameCharacter) {
        gameCharacter.hp -= 80;
    }

    @Override
    public void attack2(GameCharacter gameCharacter) {
        gameCharacter.hp -= 80;
    }
}
