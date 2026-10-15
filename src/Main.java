import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаём предметы разных типов
        Food apple = new Food("Яблоко", "🍎", 10);
        Food bread = new Food("Хлеб", "🍞", 5);
        Potion healingPotion = new Potion("Зелье лечения", "🧪", 30);
        Weapon sword = new Weapon("Меч", "⚔️", 20);
        Book book = new Book("Меч", "⚔️", 20);


        // Кладём все предметы в общий список
        List<Item> allItems = new ArrayList<>();
        allItems.add(apple);
        allItems.add(bread);
        allItems.add(healingPotion);
        allItems.add(sword);
        allItems.add(book);

        // Торговец оценивает каждый продажный предмет
        System.out.println("Торговец оценивает предметы героя:");
        for (int i = 0; i < allItems.size(); i++) {
            Item item = allItems.get(i);
            if (item instanceof Tradeable tradeable) {
                System.out.println("Готов купить " + item.getIcon() + " " + item.getName()
                    + " за " + tradeable.getPrice() + " монет");
            }
        }
    }
}
