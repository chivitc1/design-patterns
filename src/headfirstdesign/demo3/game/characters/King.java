package demo3.game.characters;

public class King extends Character {
    @Override
    public void fight() {
        System.out.println("---------King fight--------");
        weapon.useWeapon();
    }
}
