public class Potion extends Item implements Tradeable {
    private int healthEffect;

    public Potion(String name, String icon, int healthEffect, Rarity rarity) {
        super(name, icon, rarity);
        this.healthEffect = healthEffect;
    }

    public int getHealthEffect() {
        return healthEffect;
    }

    @Override
    public void use() {
        System.out.println("Персонаж выпил " + getIcon() + " " + getName()
            + ". Эффект на здоровье: " + healthEffect);
    }

    @Override
    public int getPrice() {
        if (healthEffect > 0) {
            return healthEffect * 3;
        } else {
            return -healthEffect * 3;
        }
    }
}
