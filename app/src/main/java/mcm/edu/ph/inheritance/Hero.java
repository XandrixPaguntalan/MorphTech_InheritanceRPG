package mcm.edu.ph.inheritance;

public class Hero extends GameUnit{

    public Hero() {}
    public Hero(int healthPoint, int manaPoint, int armorPoint, int damagePoint) {
        super.setHealthPoint(healthPoint);
        super.setManaPoint(manaPoint);
        super.setArmorPoint(armorPoint);
        super.setArmorPoint(damagePoint);
    }
    public static int getHealthpoint() {
        return 2000;
    }
    public static int getManapoint() {
        return 130;
    }
    public static int getArmorpoint() {
        return 150;
    }
    public static int getDamagepoint() {
        return 170;
    }
}
