public abstract class Item {
    private String name;
    private String icon;
    private Rarity rarity;

    private static int totalCreated = 0;

    public Item(String name, String icon, Rarity rarity) {
        this.name = name;
        this.icon = icon;
        this.rarity = rarity;
        totalCreated++;
    }

    public abstract void use();

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public static int getTotalCreated() {
        return totalCreated;
    }
}
