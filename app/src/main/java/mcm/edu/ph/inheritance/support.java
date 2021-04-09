package mcm.edu.ph.inheritance;

public class support extends GameUnit{

    public support() {}
    public support(int healthPoint, int manaPoint, int armorPoint, int damagePoint) {
        super.setHealthPoint(healthPoint);
        super.setManaPoint(manaPoint);
        super.setArmorPoint(armorPoint);
        super.setArmorPoint(damagePoint);
    }
    public static int getHealthpoint() {
        return 1500;
    }
    public static int getManapoint() {
        return 190;
    }
    public static int getArmorpoint() {
        return 110;
    }
    public static int getDamagepoint() {
        return 80;
    }
}
