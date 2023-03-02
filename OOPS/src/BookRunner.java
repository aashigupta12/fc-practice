public class BookRunner {
    public static void main(String[] args) {
        //created a new class Book
        //create three instances
        Book artOfCompProg = new Book();
        Book effectiveJava = new Book();
        Book cleanCode = new Book();

        artOfCompProg.setNoOfCopies(100);
        effectiveJava.setNoOfCopies(50);
        cleanCode.setNoOfCopies(40);

        artOfCompProg.increaseNoOfCopies(100);
        artOfCompProg.decreaseNoOfCopies(90);

        System.out.println(artOfCompProg.getNoOfCopies());
    }
}
