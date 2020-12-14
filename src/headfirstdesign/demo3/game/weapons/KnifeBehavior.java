package demo3.game.weapons;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Use weapon: knife cutting in air");
    }
}
