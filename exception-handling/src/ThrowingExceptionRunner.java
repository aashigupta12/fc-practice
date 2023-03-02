import java.util.Currency;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    //predefined
//    public void add(Amount that) throws Exception{
    //custom exception
      public void add(Amount that) throws CurrenciesDoNotMatchException {

        if(this.currency.equals(that.currency)){
            this.amount = this.amount + that.amount;
        } else {
//            throw new Exception("Currencies don't match! " + this.currency + " & " + that.currency);
            //CUSTOM EXCEPTION HANDLING
            throw new CurrenciesDoNotMatchException("Currencies don't match! " + this.currency + " & " + that.currency);

        }
    }

    public String toString(){
        return amount + " " + currency;
    }
}

//creating customException by extending Exception
    class CurrenciesDoNotMatchException extends Exception{
        //constructor for customException

        CurrenciesDoNotMatchException(String msg){
        super(msg);
    }
}

    public class ThrowingExceptionRunner {
    public static void main(String[] args) throws CurrenciesDoNotMatchException {
        Amount amount1 = new Amount("USD", 10);
        Amount amount2 = new Amount("EUR", 20);

        amount1.add(amount2);
        System.out.println(amount1);
    }
}
