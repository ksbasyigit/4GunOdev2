package youtubeCafe.business.abstracts;

import java.rmi.RemoteException;

import youtubeCafe.entites.concretes.Customer;

public interface CustomerService {

	void save(Customer customer) throws RemoteException;
}
