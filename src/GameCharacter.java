public class GameCharacter {
    private String name;
    private String avatar;
    private int health;
    private boolean isSleeping;
    private Inventory inventory;

    public GameCharacter(String name, String avatar, int health, Inventory inventory){
        this.name = name;
        this.avatar = avatar;
        this.health = health;
        this.inventory = inventory;
    }

    public GameCharacter(String name, String avatar, int health) {
        this.name = name;
        this.avatar = avatar;
        this.health = health;
        // Другие поля заполняет значениями по умолчанию
        this.isSleeping = false;
        this.inventory = new Inventory(5);
    }

    // Конструктор только с именем
    public GameCharacter(String name) {
        this.name = name;
        // Другие поля заполняет значениями по умолчанию
        this.avatar = "👤";
        this.health = 100;
        this.isSleeping = false;
        this.inventory = new Inventory(5);
    }

    public void sayHello() {
        System.out.println(avatar + ": Привет!");
    }

    public void sayHello(GameCharacter other) {
        System.out.println(avatar + ": Привет, " + other.getName() + "!");
    }

    public void sayGoodbye() {
        System.out.println(avatar + ": Пока!");
    }
    public void sayGoodbye(GameCharacter other) {
        System.out.println(other.getName() + ": Пока!");
    }

    public void eatItem(Food itemToEat) { // <- itemToEat — это аргумент метода

        // Если персонаж съел предмет, вычисляем его обновлённое здоровье
        setHealth(health + itemToEat.getHealthEffect());
    }

    public void moveToLocation(String locationName, int distance) {
        System.out.println(avatar + " отправляется в " + locationName);
        System.out.println("Расстояние до места: " + distance + " км");

        if (distance > 50) {
            setHealth(health - 10);// Длинные путешествия утомляют
            System.out.println("Путешествие было долгим, уровень здоровья понижен до " + health);
        } else {
            System.out.println("Путешествие прошло быстро и без проблем!");
        }
    }

    public void setHealth(int newHealth) {
        health = newHealth;
        if (health <= 0) {
            health = 0;
            isSleeping = true;
            System.out.println(avatar + " засыпает для восстановления здоровья...");
        }
    }

    public String getName(){
        return name;
    }

    public String getAvatar(){
        return avatar;
    }

    public int getHealth(){
        return health;
    }

    public boolean isSleeping(){
        return isSleeping;
    }

    public Inventory getInventory(){
        return inventory;
    }
}
