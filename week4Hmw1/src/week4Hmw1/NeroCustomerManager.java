package week4Hmw1;

public class NeroCustomerManager extends BaseCustomerManager{
private PersonCheckService _customerCheckService;
	
	public  NeroCustomerManager(PersonCheckService customerCheckService) {
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
