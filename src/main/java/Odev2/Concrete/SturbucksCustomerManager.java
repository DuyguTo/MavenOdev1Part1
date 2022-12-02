package Odev2.Concrete;

import Odev2.Abstarct.BaseCustomerManager;
import Odev2.Abstarct.ICustomerCheckService;
import Odev2.Customer;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

public class SturbucksCustomerManager extends BaseCustomerManager {

    private ICustomerCheckService customerCheckService;

    public SturbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }


    @Override
    public void Save(Customer customer) {

       if (customerCheckService.CheckIfRealPerson(customer))
        {
            super.Save(customer);
        }
        else {
           System.out.println("not a valid person");

       }

    }
}

