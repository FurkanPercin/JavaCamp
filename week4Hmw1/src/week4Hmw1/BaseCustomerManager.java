package week4Hmw1;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer)  {
		System.out.println("Saved to database: "+customer.firstName );
		
	}

}
