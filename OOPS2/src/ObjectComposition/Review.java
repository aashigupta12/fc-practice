package ObjectComposition;

public class Review {
    private int revId;
    private String revDescription;
    private int rating;

    public Review(int revId, String revDescription, int rating){
        this.revId = revId;
        this.revDescription = revDescription;
        this.rating = rating;
    }

    public String toString(){
        return revId + " " + revDescription + " " + rating;
    }

}
