public abstract class GameCharacter implements Ability {

    int hp = 1000;
    int level = 1;
    int experience;

    void born() {
        this.hp = 1000 + (100 * this.level);
    }

    void die() {
        System.out.println("wait for 10s to reborn");
        // ??? how to wait 10s ???
        this.born();
    }

    void levelUp() {
        this.level += 1;
    }

    void kill() {
        this.hp += 100;
        this.experience += 100;
        if (this.experience >= 1000)
            this.levelUp();
    }

    void getAttack(int damage) {
        this.hp -= damage;
        if (this.hp <= 0)
            this.die();
    }

}
