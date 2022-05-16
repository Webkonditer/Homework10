public class Main {
    public static void main(String[] args){
        Autor autor1 = new Autor("Федор", "Достоевский");
        Autor autor2 = new Autor("Сергей", "Есенин");

        Book book1 = new Book("Бесы", autor1, "1736");
        Book book2 = new Book("Шагане ты моя Шагане", autor2, "1924");

        book1.setBookDate("2022");

        System.out.println(book2);
    }
}