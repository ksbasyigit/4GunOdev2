package youtubeCafe.core.abstracts;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import youtubeCafe.business.abstracts.CustomerCheckService;
import youtubeCafe.entites.concretes.Customer;

public class MernisManagerAdaptor implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy(); 
		
		Long nationalityId = Long.parseLong(customer.getNationalityId());
		String firstName = customer.getFirstName().toUpperCase();
		String lastName = customer.getLastName().toUpperCase();
		int date = customer.getDateOfBirth().getYear();
		
		return kpsPublicSoapProxy.TCKimlikNoDogrula(nationalityId, firstName, lastName, date);
		
		//System.out.println("Adı: "+ firstName + ", Soyadi: "+ lastName + ", TC Kimlik: "+ nationalityId + ", Doğum Yılı: " + date);
		
	}
}
