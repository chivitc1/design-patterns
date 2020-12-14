package demo3.game.weapons;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Use weapon: swing a sword");
    }
}
