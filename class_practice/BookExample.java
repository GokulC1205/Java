package class_practice;

class Book {
    String title;
    String author;
    double price;

    public String details() {
        return "Title: " + title + ", Author: " + author + ", Price: $" + price;
    }
}

public class BookExample {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "The Alchemist";
        book.author = "Paulo Coelho";
        book.price = 15.99;
        System.out.println(book.details());
    }
}
