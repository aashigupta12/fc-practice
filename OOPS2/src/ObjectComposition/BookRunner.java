package ObjectComposition;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book(123, "Object Oriented prog lang", "Aashi");

        System.out.println();
        book.addReview(new Review(12, "Great Book", 9));

        book.addReview(new Review(23, "amazing", 10));

        System.out.println(book);
    }
}
