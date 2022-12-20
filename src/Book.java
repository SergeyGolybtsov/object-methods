
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
    public boolean equals(Object a) {
        if (getClass() != a.getClass()){
            return false;
        }
        return toString().equals(a.toString());
    }
    public int hashCode() {
        return java.util.Objects.hash(toString());
    }
}
