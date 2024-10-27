public class Main {
    public static void main (String[] args) {
        System.out.println("Привет, мир!");
        Author author = new Author("Михаил", "Михеев");
        Book book = new Book("Адмирал", 2016, author);
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Название книги: " + book.getBook());
        System.out.println("Год публикации : " + book.getYear());

        System.out.println();

        Author author1 = new Author("Михаель", "Гавен");
        Book book2 = new Book("заговор адмирала", 2013, author1);
        System.out.println("Автор: " + book2.getAuthor());
        System.out.println("Название книги: " + book2.getBook());
        System.out.println("Год публикации : " + book2.getYear());

        System.out.println();

        System.out.println("book2.toString() = " + book);
        System.out.println("book2.toString() = " + book2);
        System.out.println("book2.equals() = " + book.equals(book));
        System.out.println("book2.equals() = " + book2.equals(book2));
        System.out.println("Хеш код автора " + book.getAuthor() + " " + author.hashCode());
        System.out.println("Хеш код автора " + book2.getAuthor() + " " + author1.hashCode());
        System.out.println("Хеш код книги " + book.getBook() + " " + book.hashCode());
        System.out.println("Хеш код книги " + book2.getBook() + " " + book2.hashCode());
    }
}

