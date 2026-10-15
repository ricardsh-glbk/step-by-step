import java.util.List;

public class Inventory {
    private List<Item> items;
    private int maxSize;

    public Inventory(int maxSize){
        this.maxSize = maxSize;
    }
    public Inventory(){
        maxSize = 5;
    }

    public void add(Item item){
        if(items.size() < maxSize){
            items.add(item);
        }
        else{
            System.out.println("Инвентарь заполнен");
        }
    }

    public void add(List<Item> newItems) {
        for (Item item : newItems) {
            add(item); // Вызываем уже существующий метод для каждого предмета
        }
    }

    public List<Item> getItems(){
        return items;
    }

    public int getMaxSize(){
        return maxSize;
    }

    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
}
