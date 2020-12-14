package demo3.game.characters;

import demo3.game.weapons.WeaponBehavior;

public abstract class Character {
    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    protected WeaponBehavior weapon;

    public abstract void fight();
}
