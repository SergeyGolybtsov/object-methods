import java.util.Objects;

public class Author {
    private String ferstName;
    private String surName;

    public Author(String ferstName, String surNeme) {
        this.ferstName = ferstName;
        this.surName = surNeme;
    }

    public String getFerstName() {
        return ferstName;
    }

    public String getSurName() {
        return surName;
    }

    public String toString() {
        return " Автор " + this.surName + " " + this.ferstName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(ferstName, author.ferstName) && Objects.equals(surName, author.surName) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ferstName, surName);
    }
}
