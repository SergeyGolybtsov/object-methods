import java.util.Objects;

public class Book {
    private String bookName;
    private int yearPublic;
    private Author author;


    public Book(String bookName, int yearPublik, Author author) {
        this.bookName = bookName;
        this.yearPublic = yearPublik;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }

    public String toString() {
        return "Название " + this.bookName + " Год выпуска " + this.yearPublic + author;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublic == book.yearPublic && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, yearPublic, author);
    }


}
