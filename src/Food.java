public class Food extends Item implements Tradeable {
    private int healthEffect;

    public Food(String name, String icon, int healthEffect, Rarity rarity) {
        super(name, icon, rarity);
        if (healthEffect < 0) {
            healthEffect = 0;
        }
        this.healthEffect = healthEffect;
    }

    public int getHealthEffect() {
        return healthEffect;
    }

    @Override
    public int getPrice() {
        return healthEffect * 2;
    }

    @Override
    public void use() {
        System.out.println("Персонаж съел " + getIcon() + " " + getName()
            + ". Здоровье восстановлено: +" + healthEffect);
    }
}
