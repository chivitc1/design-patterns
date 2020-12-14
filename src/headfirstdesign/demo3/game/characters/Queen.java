package demo3.game.characters;

public class Queen extends Character {
    @Override
    public void fight() {
        System.out.println("---------Queen fight--------");
        weapon.useWeapon();
    }
}
