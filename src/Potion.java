public class Potion extends Item {
    private int healthEffect;

    public Potion(String name, String icon, int healthEffect) {
        super(name, icon);
        this.healthEffect = healthEffect;
    }

    @Override
    public void use() {
        System.out.println("Персонаж выпил " + getIcon() + " " + getName()
                + ". Эффект на здоровье: " + healthEffect);
    }
}
