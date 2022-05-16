import java.util.Objects;

public class Book {
    private String bookTitle;
    private Autor autor;
    private String bookDate;

    public Book(String bookTitle, Autor autor, String bookDate) {
        this.bookTitle = bookTitle;
        this.autor = autor;
        this.bookDate = bookDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }

    @Override
    public String toString() {
        return "Название книги: " + bookTitle + ", " + autor + ", Дата издания: " + bookDate + " год";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookTitle.equals(book.bookTitle) && autor.equals(book.autor) && bookDate.equals(book.bookDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, autor, bookDate);
    }
}
