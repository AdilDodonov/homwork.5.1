public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHp(700);
        boss.setDamage(50);
        boss.setDf("mygic df");
        System.out.println(" hp; " + boss.getHp() + " damage: " + boss.getDamage()+  " zaj; " + boss.getDf());
        for (int i = 0; i <createHeroes().length ; i++) {
            System.out.println("Geroy# "+ (1+i) + createHeroes()[i]);
        }
    }

    public static Hero[] createHeroes(){
        Hero hero = new Hero(200,40," pover");
        Hero hero1 = new Hero(250,20,"wor");
        Hero hero2 = new Hero(220,20,"yaroct");
        Hero [] olHeros = {hero, hero1 , hero2};
        return olHeros;

    }

}
