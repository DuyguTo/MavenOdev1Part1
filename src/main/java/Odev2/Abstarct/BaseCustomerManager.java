package Odev2.Abstarct;

import Odev2.Customer;

public abstract class BaseCustomerManager implements ICustomerService{
    public  void Save(Customer customer) {
        System.out.println("Saved to db: " + customer.FirstName + " " + customer.LastName + " " + customer.DateOfBirth);

    }

    //I added this function by mysef, homework part3
    @Override
    public void Delete(Customer customer) {
        System.out.println("Following customer is deleted from db: " + customer.FirstName + " " + customer.LastName );
    }
}
