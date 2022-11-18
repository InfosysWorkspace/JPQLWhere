package com.infy.JPQLWhere.service;

import com.infy.JPQLWhere.dto.CustomerDTO;
import com.infy.JPQLWhere.exception.InfyBankException;

import java.util.List;

public interface CustomerService {
    public List<CustomerDTO> getCustomerDetails(Integer customerId) throws InfyBankException;
}
