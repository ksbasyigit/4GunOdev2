package youtubeCafe.business.abstracts;

import java.rmi.RemoteException;

import youtubeCafe.entites.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	public abstract void save(Customer customer) throws RemoteException ;

}
