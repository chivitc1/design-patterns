package demo3.game.weapons;

public class BowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Use weapon: shoot an arrow with a bow");
    }
}
