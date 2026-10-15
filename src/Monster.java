public class Monster {
    // TODO 5: добавь поле для объекта монстра: здоровье
    private int health;
    private static int defeatedCount;

    // TODO 6: добавь конструктор
    public Monster(int health){
        this.health = health;
    }

    // TODO 7: добавь геттер для здоровья
    public int getHealth(){
        return health;
    }

    // TODO 8: добавь статическое поле defeatedCount – общий счётчик побеждённых монстров –
    // и статический геттер getDefeatedCount(), который возвращает его значение.
    // Значение должно увеличиваться каждый раз, когда монстр побежден, то есть его здоровье опустилось до 0 или ниже. ?????????
    public static int getDefeatedCount(){
        return defeatedCount;
    }

    // TODO 9: добавь метод для обработки атаки на монстра:
    public void processAttack(GameCharacter character) {
        if(character == null){
            throw IllegalArgumentException("Персонаж, атакующий монстра, не может быть null");
        }
        health -= character.getWeapon().getDamage();
        if(health < 0){
            System.out.print("Монстр побежден");
            defeatedCount++;
        }
        else{
            System.out.print("У монстра осталось " + health + "здоровья");
        }
        // если в метод передали null – выброси IllegalArgumentException с сообщением "Персонаж, атакующий монстра, не может быть null".
        // здесь нужно уменьшить здоровье монстра на значение damage текущего оружия персонажа
        // если здоровье монстра стало 0 или меньше, выведи строку "Монстр побежден" и увеличь defeatedCount на 1,
        // иначе – "У монстра осталось ... здоровья". Вместо трёх точек выводи здоровье монстра
    }
}
