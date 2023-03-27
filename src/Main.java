public class Main {
    public static void main(String[] args) {
        Author man = new Author("Thomas", "Mayne");
        Book book = new Book("Headless horseman", man, 1865);
        System.out.println("book.name = " + book.getName());
        System.out.println("book.author = " + book.getAuthor().getName());
        System.out.println("book.author = " + book.getAuthor().getLastName());
        System.out.println("book.year = " + book.getYear());

        Author man1 = new Author("Aldous", "Huxley");
        Book book1 = new Book("Brave New World", man1, 1932);
        System.out.println("book1.name = " + book1.getName());
        System.out.println("book1.author = " + book1.getAuthor().getName());
        System.out.println("book1.author = " + book1.getAuthor().getLastName());
        System.out.println("book1.year = " + book1.getYear());
        book1.setYear(1931);
        System.out.println("book1.getYear() = " + book1.getYear());

        Author man2 = new Author("Jules", "Verne");
        Book book2 = new Book("Twenty Thousand Leagues Under the Sea", man2, 1870);
        System.out.println("book2.name = " + book2.getName());
        System.out.println("book2.author = " + book2.getAuthor().getName());
        System.out.println("book2.author = " + book2.getAuthor().getLastName());
        System.out.println("book2.year = " + book2.getYear());
    }
}