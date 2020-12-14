package demo3.game.characters;

public class Knight extends Character {
    @Override
    public void fight() {
        System.out.println("---------Knight fight--------");
        weapon.useWeapon();
    }
}
