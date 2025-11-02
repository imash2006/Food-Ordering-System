package edu.icet.ecom.controller;

import edu.icet.ecom.Service.CustomerService;
import edu.icet.ecom.model.dto.Customer;
import edu.icet.ecom.model.dto.Food;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {
    CustomerService service = new CustomerService();
    @GetMapping("/login")
    List<Customer> getCustomer(){return service.getCustomer();}


    @PostMapping("/insert")
    public void insert(@RequestBody Customer customer){
        System.out.println(customer);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Customer customer){
        System.out.println(customer);
    }
}
