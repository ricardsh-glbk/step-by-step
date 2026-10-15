import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаём предметы разных типов
        Food apple = new Food("Яблоко", "🍎", 10);
        Food bread = new Food("Хлеб", "🍞", 5);
        Potion healingPotion = new Potion("Зелье лечения", "🧪", 30);
        Weapon sword = new Weapon("Меч", "⚔️", 20);
        Book book = new Book("книга", "b", 10);

        // Кладём все предметы в один общий список Item
        List<Item> allItems = new ArrayList<>();
        allItems.add(apple);
        allItems.add(bread);
        allItems.add(healingPotion);
        allItems.add(sword);
        allItems.add(book);


        Scanner scanner = new Scanner(System.in);

        // Перебираем предметы и в зависимости от типа задаём вопрос
        for (int i = 0; i < allItems.size(); i++) {
            Item item = allItems.get(i);
            System.out.println("Найден предмет: " + item.getIcon() + " " + item.getName());

            if (item instanceof Food food) {
                System.out.print("Хотите съесть этот предмет? (1 — да / 0 — нет): ");
                int answer = scanner.nextInt();
                if (answer == 1) {
                    System.out.println("Эффект еды: +" + food.getHealthEffect() + " здоровья");
                }
            } else if (item instanceof Potion potion) {
                System.out.print("Хотите выпить зелье? (1 — да / 0 — нет): ");
                int answer = scanner.nextInt();
                if (answer == 1) {
                    System.out.println("Эффект зелья: " + potion.getHealthEffect() + " здоровья");
                }
            } else if (item instanceof Weapon weapon) {
                System.out.print("Хотите прокачать оружие? (1 — да / 0 — нет): ");
                int answer = scanner.nextInt();
                if (answer == 1) {
                    weapon.upgrade(5);
                }
            } else if (item instanceof Book b_k) {
                System.out.print("Хотите прочитать книгу? (1 — да / 0 — нет): ");
                int answer = scanner.nextInt();
                if (answer == 1) {
                    System.out.print("Вы прочитали книгу на " + b_k.getPages() + " страниц");
                }
               }
            System.out.println();
        }
        scanner.close();
    }
}
