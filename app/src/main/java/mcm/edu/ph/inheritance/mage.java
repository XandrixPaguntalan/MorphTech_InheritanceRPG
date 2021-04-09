package mcm.edu.ph.inheritance;

public class mage extends GameUnit{

    public mage() {}
    public mage(int healthPoint, int manaPoint, int armorPoint, int damagePoint) {
        super.setHealthPoint(healthPoint);
        super.setManaPoint(manaPoint);
        super.setArmorPoint(armorPoint);
        super.setArmorPoint(damagePoint);
    }
    public static int getHealthpoint() {
        return 1300;
    }
    public static int getManapoint() {
        return 170;
    }
    public static int getArmorpoint() {
        return 120;
    }
    public static int getDamagepoint() {
        return 310;
    }
}

