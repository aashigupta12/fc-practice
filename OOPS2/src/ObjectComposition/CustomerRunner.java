package ObjectComposition;

public class CustomerRunner {
    public static void main(String[] args) {

        Address homeAddress = new Address("E-44", "Delhi", "110030");
        Customer customer =  new Customer("Aashi", homeAddress);

        System.out.println(customer);

        Address workAddress = new Address("line 1 for work", "gurgaon", "110037");
        customer.setWorkAddress(workAddress);

        System.out.println(customer);
    }
}
