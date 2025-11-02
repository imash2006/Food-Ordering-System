package edu.icet.ecom.Service;

import edu.icet.ecom.model.dto.Customer;

import java.util.Arrays;
import java.util.List;

public class CustomerService {
    public List<Customer> getCustomer(){
        Customer c1 = new Customer("kamal", "1234");

        return Arrays.asList(c1);
    }
}
