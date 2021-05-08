import java.rmi.RemoteException;
import java.time.LocalDate;

import youtubeCafe.business.abstracts.BaseCustomerManager;
import youtubeCafe.business.concretes.StarbucksCustomerManager;
import youtubeCafe.core.abstracts.MernisManagerAdaptor;
import youtubeCafe.entites.concretes.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisManagerAdaptor());
		baseCustomerManager.save(new Customer(1, "Kadri Sertan", "Başyiğit", LocalDate.of(1976, 1, 1), "49510402218"));
	}

	
}
