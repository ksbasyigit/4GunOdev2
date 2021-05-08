package youtubeCafe.business.abstracts;

import java.rmi.RemoteException;

import youtubeCafe.entites.concretes.Customer;

public interface CustomerCheckService {
	
	boolean CheckIfRealPerson(Customer customer) throws RemoteException;
	
}
