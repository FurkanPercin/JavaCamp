package week4Hmw1;

public class Main {

	public static void main(String[] args)  {
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		Customer customer1=new Customer();
		customer1.firstName="Furkan";
		customer1.lastName="Per�in";
		customer1.nationalityId="1111111111";
		
		baseCustomerManager.save(customer1);

	}

}
