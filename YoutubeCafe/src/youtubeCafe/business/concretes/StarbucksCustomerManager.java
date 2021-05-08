package youtubeCafe.business.concretes;

import java.rmi.RemoteException;

import youtubeCafe.business.abstracts.BaseCustomerManager;
import youtubeCafe.business.abstracts.CustomerCheckService;
import youtubeCafe.entites.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager (CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) throws RemoteException {
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			this.save(customer);
//		}else {
//			throw new Exception("Not a valid person");
		}
		
	}

}
