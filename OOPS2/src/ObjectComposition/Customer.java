package ObjectComposition;

public class Customer {

    //state
    private String name;

    //Address is something which can be an object on its own
    //object composition
    //Customer obj contains reference instance of an Address object
    private Address homeAddress;
    private Address workAddress;


    //creating
    //mandatory states include in constructor
    public Customer(String name, Address homeAddress){
        this.name = name;
        this.homeAddress = homeAddress;
    }

    //operations

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString(){
        return String.format("name - %s homeAddress - [%s] workAddress - [%s]",
                name, homeAddress, workAddress );
    }
}
