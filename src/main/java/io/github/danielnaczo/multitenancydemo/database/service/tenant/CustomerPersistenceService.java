package io.github.danielnaczo.multitenancydemo.database.service.tenant;

import io.github.danielnaczo.multitenancydemo.database.repository.CustomerRepository;
import io.github.danielnaczo.multitenancydemo.model.tenant.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerPersistenceService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerPersistenceService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer saveCustomer(Customer customer) {
        return this.customerRepository.save(customer);
    }

    public Customer findCustomerByCustomerCode(String customerCode) {
        return this.customerRepository.findCustomerByCustomerCode(customerCode);
    }
}
