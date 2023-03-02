public class Book {

    //noOfCopies
    private int noOfCopies;
    public void setNoOfCopies(int noOfCopies){
        if(noOfCopies > 0)
        this.noOfCopies = noOfCopies;
    }

    public int getNoOfCopies(){
        return noOfCopies;
    }

    public void increaseNoOfCopies(int howMuch){
        setNoOfCopies(this.noOfCopies + howMuch);
    }

    public void decreaseNoOfCopies(int howMuch){
        setNoOfCopies(this.noOfCopies - howMuch);
    }
}

