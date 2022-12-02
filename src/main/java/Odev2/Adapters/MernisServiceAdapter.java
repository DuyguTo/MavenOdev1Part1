package Odev2.Adapters;

import Odev2.Abstarct.ICustomerCheckService;
import Odev2.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        if (customer.NationalId.length() == 11){
            return true;
        }
        else {
            return false;
        }

    }
}
