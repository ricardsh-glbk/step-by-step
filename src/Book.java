public class Book extends Item implements Tradeable{
    private int pages;

    public Book(String name, String avatar, int pages){
        super(name, avatar);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void use(){
        System.out.print("Персонаж прочитал книгу на " + pages + " страниц");
    }

    @Override 
    public int getPrice(){
        return pages * 1;
    }

}
