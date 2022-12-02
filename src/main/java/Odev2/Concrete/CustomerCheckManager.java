package Odev2.Concrete;

import Odev2.Abstarct.ICustomerCheckService;
import Odev2.Abstarct.ICustomerService;
import Odev2.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        return true;


    }
}
