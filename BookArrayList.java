package cleancodes;

public class BookArrayList {
    private final int MAX_CAPACITY = 5;
    private Book[] books;
    private int count=0;
    
    public BookArrayList(){
        this.books = new Book[MAX_CAPACITY];
    }

    public boolean add(Book book){
        if(this.count < this.MAX_CAPACITY){
            this.books[this.count] = book;
            this.count++;
            return true;
        }
        return false;
    }

    public void sort(BookComparator bookComparator){
        for (int i = 0 ; i < this.books.length - 1; i++) {
            for (int j = i + 1; j < this.books.length; j++) {
                if (bookComparator.compare(this.books[i], this.books[j])  > 0) {
                    Book temp = this.books[j];
                    this.books[j] = this.books[i];
                    this.books[i] = temp;
                }
            }
        }
    }

    public Book get(int index){
        if(index >=0 && index < this.count){
            return this.books[index];
        }
        return null;
    }

    public int getMAX_CAPACITY() {
        return this.MAX_CAPACITY;
    }


    public Book[] getBooks() {
        return this.books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
    

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
}
