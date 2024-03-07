package TaskOne;
import java.util.ArrayList;
class main {


    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Micke", "Dengaard", "Kongen"));
        customers.add(new Customer("Melanie", "Christensen", "Suresen"));

        System.out.println(customers);

    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}










