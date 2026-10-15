public class Food extends Item{
    private int healthEffect;

    public Food(String name, String icon, int healthEffect){
        super(name, icon);
        if (healthEffect < 0) {
            healthEffect = 0;
        }
        this.healthEffect = healthEffect;
    }

    @Override
    public void use() {
        System.out.println("Персонаж съел " + getIcon() + " " + getName()
                + ". Здоровье восстановлено: +" + healthEffect);
    }
}
