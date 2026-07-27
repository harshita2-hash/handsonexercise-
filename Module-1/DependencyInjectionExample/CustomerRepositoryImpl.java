public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {

        if (id == 101) {
            return "Harshita";
        } else if (id == 102) {
            return "Priya";
        } else {
            return "Customer Not Found";
        }
    }
}