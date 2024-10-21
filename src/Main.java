public class Main {
    public static void printSeparator() {
        System.out.println("====================");
    }

    public static void main(String[] args) {


        Author Lermontov = new Author("Михаил","Лермонтов");
        printSeparator();
        System.out.println("Автор - " + Lermontov.getName() + " " + Lermontov.getSurname());
        Book dogHeart = new Book("Герой нашего времени", Lermontov, 1838);
        System.out.println("Название книги - " + dogHeart.getName());
        System.out.println("Год издания - " + dogHeart.getYear());
        printSeparator();
        Author Gogol = new Author("Николай","Гоголь");
        System.out.println("Автор - " + Gogol.getName() + " " + Gogol.getSurname());
        Book Viy = new Book("Вий",Gogol,1834);
        System.out.println("Название книги - " + Viy.getName());
        System.out.println("Год издания - " + Viy.getYear());
        Viy.setYear(1835);
        System.out.println("Год издания - " + Viy.getYear());
        printSeparator();


    }


}