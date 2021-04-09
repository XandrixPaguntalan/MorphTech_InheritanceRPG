package mcm.edu.ph.inheritance;

public class tank extends GameUnit{

    public tank() {}
    public tank(int healthPoint, int manaPoint, int armorPoint, int damagePoint) {
        super.setHealthPoint(healthPoint);
        super.setManaPoint(manaPoint);
        super.setArmorPoint(armorPoint);
        super.setArmorPoint(damagePoint);
    }
    public static int getHealthpoint() {
        return 4500;
    }
    public static int getManapoint() {
        return 120;
    }
    public static int getArmorpoint() {
        return 350;
    }
    public static int getDamagepoint() {
        return 65;
    }
}
