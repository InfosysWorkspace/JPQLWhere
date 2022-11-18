package com.infy.JPQLWhere.service;


import com.infy.JPQLWhere.dto.CustomerDTO;
import com.infy.JPQLWhere.exception.InfyBankException;
import com.infy.JPQLWhere.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<CustomerDTO> getCustomerDetails(Integer customerId) throws InfyBankException{
        return customerRepository.getCustomerDetails(customerId);
    }

}
