package demo3.game.weapons;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Use weapon: throw an axe");
    }
}
