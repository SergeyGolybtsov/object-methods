public class Author {
    private String ferstName;
    private String surName;

    private String nick;

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

    public String getNick() {
        return nick;
    }

    public boolean equals(Object piska) {
        if (getClass() != piska.getClass()){
            return false;
        }
        return toString().equals(piska.toString());
    }
    public int hashCode() {
        return java.util.Objects.hash(toString());
    }
}