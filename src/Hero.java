public class Hero {
    private int hp;
    private int damage;
    private String pover;

    public Hero(int hp, int damage, String pover) {
        this.hp = hp;
        this.damage = damage;
        this.pover = pover;
    }

    public Hero(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getPover() {
        return pover;
    }

    public void setPover(String pover) {
        this.pover = pover;
    }

    public String toString() {
        return " Hero; " +
                " Hp; " + hp +
                " damage; " + damage +
                " pover; " + pover;
    }
}

