public class Book extends Item{
    private int pages;

    public Book(String name, String avatar, int pages){
        super(name, avatar);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

}
