package youtubeCafe.business.concretes;

import youtubeCafe.business.abstracts.CustomerCheckService;
import youtubeCafe.entites.concretes.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}
}
