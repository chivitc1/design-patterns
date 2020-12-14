package demo3.game.characters;

public class Troll extends Character {
    @Override
    public void fight() {
        System.out.println("---------Troll fight--------");
        weapon.useWeapon();
    }
}
