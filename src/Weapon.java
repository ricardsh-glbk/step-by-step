public class Weapon extends Item implements Tradeable {
    private int damage;

    public Weapon(String name, String icon, int damage, Rarity rarity) {
        super(name, icon, rarity);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void upgrade(int upgradeValue) {
        damage += 5;
        System.out.println(getIcon() + " прокачано! Новый урон: " + damage);
    }

    @Override
    public void use() {
        upgrade(5);
        System.out.println("Оружие " + getIcon() + " " + getName()
            + " прокачано! Новый урон: " + damage);
    }

    @Override
    public int getPrice() {
        return damage * 10;
    }
}
