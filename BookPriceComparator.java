package cleancodes;

public class BookPriceComparator implements BookComparator {

    @Override
    public int compare(Book book1, Book book2) {
        return book1.getPrice() - book2.getPrice();
    }
}
