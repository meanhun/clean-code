package cleancodes;

public class Main {
    public static void main(String[] args) {
        BookArrayList bookList = new BookArrayList();

        bookList.add(new Book("Sach A",5));
        bookList.add(new Book("Sach C",4));
        bookList.add(new Book("Sach H",3));
        bookList.add(new Book("Sach B",2));
        bookList.add(new Book("Sach B",3));
    
        printBookList(bookList);
        System.out.println("-----------------------");
        bookList.sort(new BookPriceComparator());
        printBookList(bookList);
        System.out.println("-----------------------");
        bookList.sort(new BookNameComparator());
        printBookList(bookList);
    }
    
    public static void printBookList(BookArrayList bookList){
        for( int i=0; i< bookList.getCount(); i++){
            Book book = bookList.get(i);
            System.out.println(book.getName()+"    -   "+ book.getPrice());
        }
    }
}
