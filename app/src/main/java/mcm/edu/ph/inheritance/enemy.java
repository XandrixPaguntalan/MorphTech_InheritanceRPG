package mcm.edu.ph.inheritance;

public class enemy extends GameUnit{

    public enemy() {}
    public enemy(int healthPoint, int manaPoint, int armorPoint, int damagePoint) {
        super.setHealthPoint(healthPoint);
        super.setManaPoint(manaPoint);
        super.setArmorPoint(armorPoint);
        super.setArmorPoint(damagePoint);
    }
    public static int getHealthpoint() {
        return 1300;
    }
    public static int getManapoint() {
        return 90;
    }
    public static int getArmorpoint() {
        return 70;
    }
    public static int getDamagepoint() {
        return 110;
    }
}
