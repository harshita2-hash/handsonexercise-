public class DependencyInjectionTest {

    public static void main(String[] args) {

        // Inject dependency
        CustomerRepository repository =
                new CustomerRepositoryImpl();

        CustomerService service =
                new CustomerService(repository);

        // Find customer
        service.getCustomerDetails(101);

        System.out.println();

        service.getCustomerDetails(102);
    }
}