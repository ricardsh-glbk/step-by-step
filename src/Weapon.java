public class Weapon extends Item {
    private int damage;

    public Weapon(String name, String icon, int damage) {
        super(name, icon);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    // У оружия своё уникальное действие — прокачка
    public void upgrade(int increase) {
        damage += increase;
        System.out.println(getIcon() + " прокачано! Новый урон: " + damage);
    }

    @Override
    public void use() {
        upgrade(5);
        System.out.println("Оружие " + getIcon() + " " + getName()
                + " прокачано! Новый урон: " + damage);
    }
}
