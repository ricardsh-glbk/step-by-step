public class GameCharacter {
    private String name;
    private String avatar;
    private int health;
    private Weapon weapon;


    public GameCharacter(String name, String avatar, int health, Weapon weapon) {
        this.name = name;
        this.avatar = avatar;
        this.health = health;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public String getAvatar() {
        return avatar;
    }

    public int getHealth() {
        return health;
    }


    // TODO 3: добавь геттер для текущего оружия персонажа
    public Weapon getWeapon(){
        return weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }


    // TODO 4: добавь сеттер для текущего оружия персонажа – оружие может меняться.
}
