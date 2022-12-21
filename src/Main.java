public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Сергей", "Пушкин");
        Author author2 = new Author("Сергей", "Есенин");
        Book book1 = new Book("Название 1", 1922, author1);
        Book book2 = new Book("Название 2", 1908, author2);
        book1.setYearPublic(1907);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println("Сравнение книг");
        System.out.println(book1.equals(book2));
        System.out.println("Сравнение авторов");
        System.out.println(author1.equals(author2));

    }
}