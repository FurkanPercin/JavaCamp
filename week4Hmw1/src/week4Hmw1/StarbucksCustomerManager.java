package week4Hmw1;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private PersonCheckService _customerCheckService;
	
	public  StarbucksCustomerManager(PersonCheckService customerCheckService) {
		_customerCheckService=customerCheckService;
	}
	
	@Override
	public void save(Customer customer)  {
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Saved to database: "+customer.firstName );
		}
		else {
			System.out.println("Not a real person");
			
		}
		
	}

	
	
}
