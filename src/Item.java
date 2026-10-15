public abstract class Item {
    private String name;
    private String icon;

    public Item(String name, String icon) {
        this.name = name;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public abstract void use();
}
