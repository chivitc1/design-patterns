package demo3.game.characters;

import demo3.game.weapons.AxeBehavior;
import demo3.game.weapons.BowBehavior;
import demo3.game.weapons.KnifeBehavior;
import demo3.game.weapons.SwordBehavior;

public class MiniGameSimulation {
    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();
        Character knight = new Knight();
        Character troll = new Troll();

        var axe = new AxeBehavior();
        var bow = new BowBehavior();
        var knife = new KnifeBehavior();
        var sword = new SwordBehavior();

        king.setWeapon(sword);
        queen.setWeapon(sword);
        knight.setWeapon(axe);
        troll.setWeapon(bow);

        king.fight();
        queen.fight();
        knight.fight();
        troll.fight();
        knight.setWeapon(bow);
        knight.fight();
    }
}
